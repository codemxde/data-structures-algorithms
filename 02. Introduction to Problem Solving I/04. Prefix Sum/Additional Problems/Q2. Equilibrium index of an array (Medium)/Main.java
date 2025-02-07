// # Problem Description
// * You are given an array A of integers of size N.
// * Your task is to find the equilibrium index of the given array

// # Equilibrium Index
// * The equilibrium index of an array is an index
// * such that the sum of elements at lower indexes is
// * equal to the sum of elements at higher indexes.
// * If there are no elements that are at lower indexes or at higher
// * indexes, then the corresponding sum of elements is considered as 0.

// # Note
// * Array indexing starts from 0.
// * If there is no equilibrium index then return -1.
// * If there are more than one equilibrium indexes then return the minimum index.

// # Problem Constraints
// * 1 <= N <= 10^5
// * -10^5 <= A[i] <= 10^5

// # Input Format
// * First arugment is an array A

// # Output Format
// * Return the equilibrium index of the given array.
// * If no such index is found then return -1.

// # Example
// $ Input 1
// * A = [-7, 1, 5, 2, -4, 3, 0]

// $ Output 1
// * 3

// ! Explanantion
// * i   Sum of elements at lower indexes    Sum of elements at higher indexes
// * 0                   0                                   7
// * 1                  -7                                   6
// * 2                  -6                                   1
// * 3                  -1                                  -1
// * 4                   1                                   3
// * 5                  -3                                   0
// * 6                   0                                   0

// * 3 is an equilibrium index, because: 
// * A[0] + A[1] + A[2] = A[4] + A[5] + A[6]

// $ Input 2
// * A = [1, 2, 3]

// $ Output 2
// * -1

// ! Explanantion
// * i   Sum of elements at lower indexes    Sum of elements at higher indexes
// * 0                   0                                   5
// * 1                   1                                   3
// * 2                   3                                   0
// * Thus, there is no such index.

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

    public static long[] createPrefixSum(int[] arr) {
        long[] pSum = new long[arr.length];
        pSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            pSum[i] = pSum[i - 1] + arr[i];
        }
        return pSum;
    }

    public static int solve(int[] A) {
        // # Approach
        // * Firstly, create a prefix sum sum array from input array
        // * Then for each index, calculate leftSum from '0' till 'i-1' index
        // * Similarly, calculate rightSum from 'i + 1' till 'N - 1' index
        // * If both the sums are equal, return the index
        
        // # Edge case
        // * If there is only element in the array, for ex, A = [5]
        // * According to the question statement, if there are no elements
        // * before an index, consider leftSum to be 0
        // * Similarly, if there an no elements to the right of the index
        // * consider rightSum to be 0
        // * for arrays with only one element, i.e i = 0, there are no elements
        // * to both left and right, making both leftSum and rightSum = 0
        // * Hence arrays with only one index have automatically index '0'
        // * as their equilibrium index and we can straight away return 0

        // * checking edge case
        if (A.length == 1) {
            return 0;
        }

        // * creating prefix sum array
        long[] pSum = createPrefixSum(A);
        int N = pSum.length;

        // * pre-checking if index 'O' is an equilibrium index
        if (pSum[N -1] - pSum[0] == 0) {
            return 0;
        }

        // * finding equilibrium index
        for (int i = 1; i < pSum.length; i++) {
            long leftSum = pSum[i - 1];
            long rightSum = pSum[N - 1] - pSum[i];

            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read array
        int[] arr = readArray(sc);

        // * finding equilibrium index of an array
        int equilibriumIndex = solve(arr);
        System.out.println(equilibriumIndex != -1 ? "found equilibrium index at: " + equilibriumIndex : "equilibrium index does not exist");
    }
}
