// # Problem Description
// * You are given an integer array C of size A.
// * Now you need to find a subarray (contiguous elements)
// * so that the sum of contiguous elements is maximum.
// * But the sum must not exceed B.

// # Problem Constraints
// * 1 <= A <= 10^3
// * 1 <= B <= 10^9
// * 1 <= C[i] <= 10^6

// # Input Format
// * The first argument is the integer A.
// * The second argument is the integer B.
// * The third argument is the integer array C.

// # Output Format
// * Return a single integer which denotes the maximum sum.

// # Example
// $ Input 1
// * A = 5
// * B = 12
// * C = [2, 1, 3, 4, 5]

// $ Output 1
// * 12

// ! Explanantion
// * We can select {3,4,5} which sums up to 12 which
// * is the maximum possible sum.

// $ Input 2
// * A = 3
// * B = 1
// * C = [2, 2, 2]

// $ Output 2
// * 0

// ! Explanantion
// * All elements are greater than B, which means we cannot
// * select any subarray. Hence, the answer is 0.

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

    public static int readMaximumSumAllowed(Scanner sc) {
        System.out.print("enter maximum subarray sum allowed: ");
        return sc.nextInt();
    }

    public static int maxSubarray(int A, int B, int[] C) {
        // # Approach
        // * This problem can be tackled using two approaches
        // * 'prefix-sum' and 'carry-forward'.
        // * Both of them have been covered under the PDF 'Approach'
        // * listed under the same directory as that of this file
        // * Here, I will be going ahead with the carry forarwd approach

        // * handling edge case
        int min = C[0];

        for (int i = 1; i < C.length; i++) {
            if (C[i] < min) min = C[i];
        }

        if (B < min) {
            return 0;
        }

        // * finding subarray holding maximum sum 
        int maxSum = 0;
        for (int i = 0; i < C.length; i++) {
            int sum = 0;
            for (int j = i; j < C.length; j++) {
                sum += C[j];
                if (sum > maxSum && sum <= B) {
                    maxSum = sum;
                }
            }
            if (maxSum == B) return B;
        }
        return maxSum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read array input
        int[] C = readArray(sc);

        // * reading maximum subarray sum allowed
        int B = readMaximumSumAllowed(sc);

        // * finding maximum sum of subarray
        System.out.println("maximum sum possible: " + maxSubarray(C.length, B, C));
    }
}
