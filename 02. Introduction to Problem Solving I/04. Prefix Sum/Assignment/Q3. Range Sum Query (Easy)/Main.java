// # Problem Description
// * You are given an integer array A of length N.
// * You are also given a 2D integer array B with
// * dimensions M x 2, where each row denotes a [L, R] query.
// * For each query, you have to find the sum of all
// * elements from L to R indices in A (0 - indexed).
// * More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R]
// * for each query.

// # Problem Constraints
// * 1 <= N, M <= 10^5
// * 1 <= A[i] <= 10^9
// * 0 <= L <= R < N

// # Input Format
// * The first argument is the integer array A.
// * The second argument is the 2D integer array B.

// # Output Format
// * Return an integer array of length M where
// * ith element is the answer for ith query in B.

// # Example
// $ Input 1
// * A = [1, 2, 3, 4, 5]
// * B = [[0, 3], [1, 2]]

// $ Output 1
// * [10, 5]

// ! Explanantion
// * The sum of all elements of A[0 ... 3] = 1 + 2 + 3 + 4 = 10.
// * The sum of all elements of A[1 ... 2] = 2 + 3 = 5.

// $ Input 2
// * A = [2, 2, 2]
// * B = [[0, 0], [1, 2]]

// $ Output 2
// * [2, 4]

// ! Explanantion
// * The sum of all elements of A[0 ... 0] = 2 = 2.
// * The sum of all elements of A[1 ... 2] = 2 + 2 = 4.

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

    public static int[][] createMatrix(Scanner sc) {
        System.out.print("enter no of rows in query: ");
        int rows = sc.nextInt();

        int[][] arr = new int[rows][2];

        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print("enter L and R for row " + (i + 1) + ": ");
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        return arr;
    }

    public static long[] rangeSum(int[] A, int[][] B) {
        // * creating prefix sum array
        long[] pSum = new long[A.length];
        pSum[0] = A[0];

        // 'N' iterations if A[N]
        for (int i = 1; i < A.length; i++) { 
            pSum[i] = pSum[i - 1] + A[i];
        }
        
        // * for every range calculating and storing sum
        long[] sumInRange = new long[B.length];

        // 'M' iiterations if B[M][2]
        for (int i = 0; i < B.length; i++) { 
            int leftIndex = B[i][0];
            int rightIndex = B[i][1];

            if (leftIndex == 0){
                sumInRange[i] = pSum[rightIndex];
            } else {
                sumInRange[i] = pSum[rightIndex] - pSum[leftIndex - 1];
            }
        }
        return sumInRange; // TC: O(N+M)
    }

    public static void displaySumInRange(long[] arr, int[][] queries) {
        String str = "Sum in range ";

        for (int i = 0; i < queries.length; i++) {
            System.out.println(str + queries[i][0] + " to " + queries[i][1] + " is: " + arr[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read input array
        int[] arr = readArray(sc);

        // * create query matrix
        int[][] queries = createMatrix(sc);

        // * find the sum in each range
        displaySumInRange(rangeSum(arr, queries), queries);
    }
}
