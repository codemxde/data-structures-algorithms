// # Problem Description
// * You are given an integer array A of length N.
// * You have to find the sum of all subarray sums of A.
// * More formally, a subarray is defined as a contiguous part
// * of an array which we can obtain by deleting zero or more
// * elements from either end of the array.
// * A subarray sum denotes the sum of all the elements of that subarray.

// # Note:
// * Be careful of integer overflow issues while calculations.
// * Use appropriate datatypes.

// # Problem Constraints
// * 1 <= N <= 10^5
// * 1 <= A[i] <= 10^4

// # Input Format
// * The first argument is the integer array A.

// # Output Format
// * Return a single integer denoting the sum of
// * all subarray sums of the given array.

// # Example
// $ Input 1
// * A = [1, 2, 3]

// $ Output 1
// * 20

// ! Explanantion
// * The different subarrays for the given array are:
// * [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
// * Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20

// $ Input 2
// * A = [2, 1, 3]

// $ Output 2
// * 19

// ! Explanantion
// * The different subarrays for the given array are:
// * [2], [1], [3], [2, 1], [1, 3], [2, 1, 3].
// * Their sums are: 2 + 1 + 3 + 3 + 4 + 6 = 19

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
        System.out.println();
        return arr;
    }

    public static long subarraySum(int[] A) {
        // # Approach
        // * We will use the contribution technique to calculate
        // * the contribution of each element in all the subarrays
        // * and figure out the sum

        // # Fact
        // * Contribution of an element at index 'i' to all the
        // * subarrays it is a part of is 'frequency' * 'element'
        // * The frequnecy of an element index 'i' in all the possible
        // * subarrays is '(N-i)(i+1)'

        // # Time and Space Complexity
        // * T.C - O(N), S.C - O(1)

        int N = A.length;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (N-i) * (i+1) * A[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read array input
        int[] arr = readArray(sc);

        // * calculate sum of all subarrays
        System.out.println("sum of all subarrays: " + subarraySum(arr));
    }   
}
