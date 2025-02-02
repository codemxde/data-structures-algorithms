// # Problem Description
// * Given an array A of N non-negative numbers and
// * a non-negative number B,you need to find the number
// * of subarrays in A with a sum less than B.
// * We may assume that there is no overflow.

// # Problem Constraints
// * 1 <= N <= 5 x 10^3
// * 1 <= A[i] <= 1000
// * 1 <= B <= 10^7

// # Input Format
// * First argument is an integer array A.
// * Second argument is an integer B.

// # Output Format
// * Return an integer denoting the number of
// * subarrays in A having sum less than B.

// # Example
// $ Input 1
// * A = [2, 5, 6]
// * B = 10

// $ Output 1
// * 4

// ! Explanantion
// * The subarrays with sum less than B are {2}, {5}, {6} and {2, 5},

// $ Input 2
// * A = [1, 11, 2, 3, 15]
// * B = 10

// $ Output 2
// * 4

// ! Explanantion
// * The subarrays with sum less than B are {1}, {2}, {3} and {2, 3}

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
    public static int readInteger(Scanner sc) {
        System.out.print("enter integer to compare subarray sum: ");
        return sc.nextInt();
    }

    public static int solve(int[] A, int B) {
        // # Approach
        // * carry forward the sum, and for each sum, check
        // * if it is less than B.
        int totalSubarrays = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                if (sum < B) totalSubarrays++;
            }
        }
        return totalSubarrays;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading array input
        int[] A = readArray(sc);

        // * reading integer to compare sum with
        int B = readInteger(sc);

        // * finding first index of subarray with length B and least average
        System.out.println("\ntotal no of such subarrays: " + solve(A, B));
    }
}
