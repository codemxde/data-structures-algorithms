// # Problem Description
// * You are given an integer array A of size N.
// * You have to perform B operations.
// * In one operation, you can remove either the leftmost
// * or the rightmost element of the array A.
// * Find and return the maximum possible sum of the
// * B elements that were removed after the B operations.

// # NOTE:
// * Suppose B = 3, and array A contains 10 elements, then you can:
// * Remove 3 elements from front and 0 elements from the back, OR
// * Remove 2 elements from front and 1 element from the back, OR
// * Remove 1 element from front and 2 elements from the back, OR
// * Remove 0 elements from front and 3 elements from the back.

// # Problem Constraints
// * 1 <= N <= 10^5
// * 1 <= B <= N
// * -10^3 <= A[i] <= 10^3

// # Input Format
// * First argument is an integer array A.
// * Second argument is an integer B.

// # Output Format
// * Return an integer denoting the maximum possible sum of elements you removed.

// # Example
// $ Input 1
// * A = [5, -2, 3 , 1, 2]
// * B = 3

// $ Output 1
// * 8

// ! Explanantion
// * Remove element 5 from front and element (1, 2)
// * from back so we get 5 + 1 + 2 = 8

// $ Input 2
// * A = [ 2, 3, -1, 4, 2, 1 ]
// * B = 4

// $ Output 2
// * 9

// ! Explanantion
// * Remove the first element and the last 3 elements.
// * So we get 2 + 4 + 2 + 1 = 9

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void readArrayList(ArrayList<Integer> arr, Scanner sc) {
        System.out.print("enter size of collection: ");
        int size = sc.nextInt();

        System.out.print("enter elements: ");
        for (int i = 0; i < size; i++) {
            arr.add(i, sc.nextInt());
        }
    }

    public static int readNumberOfOperations(Scanner sc) {
        System.out.print("\nenter no of operations allowed: ");
        return sc.nextInt();
    }

    public static ArrayList<Integer> createPrefixSum(ArrayList<Integer> arr) {
        ArrayList<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(arr.get(0));

        for (int i = 1; i < arr.size(); i++) {
            int sum = arr.get(i) + prefixSum.get(i - 1);
            prefixSum.add(sum);
        }
        return prefixSum;
    }

    public static ArrayList<Integer> initializeEmptyList(int size) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(0);
        }
        return arr;
    }

    public static ArrayList<Integer> createSuffixSum(ArrayList<Integer> arr) {
        int N = arr.size();
        ArrayList<Integer> suffixSum = initializeEmptyList(N);
        suffixSum.set(N - 1, arr.get(N - 1));

        for (int i = N - 2; i >= 0; i--) {
            int sum = arr.get(i) + suffixSum.get(i + 1);
            suffixSum.set(i, sum);
        }
        return suffixSum;
    }

    public static int solve(ArrayList<Integer> A, int B) {
        // # Approach
        // * View PDF 'Rough Work' under the same directory for a
        // * detailed overview of the calculations and approach

        int N = A.size();

        // * creating prefix-sum array
        ArrayList<Integer> prefixSum = createPrefixSum(A);

        // * creating suffix-sum array
        ArrayList<Integer> suffixSum = createSuffixSum(A);

        // * handling edge-case
        int leftmostSum = prefixSum.get(B - 1);
        int rightmostSum = suffixSum.get(N - B);
        int maximumSum = leftmostSum > rightmostSum ? leftmostSum : rightmostSum;

        // * picking from both sides to check maximum sum
        int constant = N - B + 1;
        for (int i = 0; i < B - 1; i++) {
            int sum = prefixSum.get(i) + suffixSum.get(constant + i);
            if (sum > maximumSum) {
                maximumSum = sum;
            }
        }
        return maximumSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        // * read array list
        readArrayList(arr, sc);

        // * reading no of operations
        int B = readNumberOfOperations(sc);

        // * find maximum possible sum of B elements
        System.out.println("maximum sum after picking from both sides: " + solve(arr, B));
    }
}