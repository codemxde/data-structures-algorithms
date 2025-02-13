// # Problem Description
// * Given an integer array A of size N.
// * You can remove any element from the array in one operation.
// * The cost of this operation is the sum of all elements in the array present before this operation.
// * Find the minimum cost to remove all elements from the array.

// # Problem Constraints
// * 0 <= N <= 1000
// * 1 <= A[i] <= 10^3

// # Input Format
// * First and only argument is an integer array A.

// # Output Format
// * Return an integer denoting the total cost of removing all elements from the array.

// # Example
// $ Input 1
// * A = [2, 1]

// $ Output 1
// * 4

// ! Explanation
// * Given array A = [2, 1]
// * Remove 2 from the array => [1]. Cost of this operation is (2 + 1) = 3.
// * Remove 1 from the array => []. Cost of this operation is (1) = 1.
// * So, total cost is = 3 + 1 = 4.

// $ Input 2
// * A = [5]

// $ Output 2
// * 5

// ! Explanantion
// * There is only one element in the array. So, cost of removing is 5.

import java.util.Scanner;

public class Main {

    public static int[] readArray(Scanner sc) {
        System.out.print("enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void sortArrayDescending(int[] arr) {
        // * using insertion sort
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (arr[j+1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static int solve(int[] A) {
        // * handling edge case if size of array is 1
        if (A.length == 1) return A[0];

        // * sort array in descending order
        sortArrayDescending(A);

        // * now find the minimum cost
        int minimumCost = 0;
        for (int i = 0; i < A.length; i++) {
            minimumCost += A[i] * (i + 1);
        }
        return minimumCost;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read input array
        int[] arr = readArray(sc);

        // * find minimum cost of removal
        System.out.println("minimum cost: " + solve(arr));
    }
}
