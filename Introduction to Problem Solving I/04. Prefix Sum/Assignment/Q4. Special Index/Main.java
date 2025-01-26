// # Problem Description
// * Given an array, arr[] of size N, the task is
// * to find the count of array indices such that
// * removing an element from these indices makes
// * the sum of even-indexed and odd-indexed array elements equal.

// # Problem Constraints
// * 1 <= N <= 10^5
// * -10^5 <= A[i] <= 10^5
// * Sum of all elements of A <= 10^9

// # Input Format
// * First argument contains an array A of integers of size N

// # Output Format
// * Return the count of array indices such that removing
// * an element from these indices makes the sum of
// * even-indexed and odd-indexed array elements equal.

// # Example
// $ Input 1
// * A = [2, 1, 6, 4]

// $ Output 1
// * 1

// ! Explanantion
// * Removing arr[1] from the array modifies arr[] to
// * { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1]. 
// * Therefore, the required output is 1.

// $ Input 2
// * A = [1, 1, 1]

// $ Output 2
// * 3

// ! Explanantion
// * Removing arr[0] from the given array modifies arr[]
// * to { 1, 1 } such that arr[0] = arr[1] 
// * Removing arr[1] from the given array modifies arr[]
// * to { 1, 1 } such that arr[0] = arr[1] 
// * Removing arr[2] from the given array modifies arr[]
// * to { 1, 1 } such that arr[0] = arr[1] 
// * Therefore, the required output is 3.

import java.util.Arrays;
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

    public static void createPrefixSumArrays(int[] arr, long[] pSumEven, long[] pSumOdd) {
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                pSumEven[i] = pSumEven[i - 1] + arr[i];
                pSumOdd[i] = pSumOdd[i - 1];
            } else {
                pSumEven[i] = pSumEven[i - 1];
                pSumOdd[i] = pSumOdd[ i - 1] + arr[i];
            }
        }
    }

    public static int solve(int[] A) {
        int N = A.length;
        // * creating even and odd prefix sum arrays
       long[] pSumEven = new long[N];
       pSumEven[0] = A[0];

       long[] pSumOdd = new long[N];
       pSumOdd[0] = 0;

       createPrefixSumArrays(A, pSumEven, pSumOdd);

       // * Finding special indexes
       int specialIndexes = 0;
       // * handling edge case
       if (pSumEven[N - 1] - A[0] == pSumOdd[N - 1]) {
           specialIndexes++;
       }
       for (int i = 1; i < N; i++) {
           long sumEven = pSumEven[i - 1] + pSumOdd[N - 1] - pSumOdd[i];
           long sumOdd = pSumOdd[i - 1] + pSumEven[N - 1] - pSumEven[i];
           if (sumEven == sumOdd) {
               specialIndexes++;
           }
       }
       return specialIndexes;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read input array
        int[] arr = readArray(sc);

        // * find special indexes
        System.out.println("\ntotal special indexes: " + solve(arr));
    }
}
