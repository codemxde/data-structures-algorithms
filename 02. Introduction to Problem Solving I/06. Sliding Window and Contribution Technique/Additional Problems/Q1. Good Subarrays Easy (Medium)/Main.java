// # Problem Description
// * Given an array of integers A, a subarray of an array
// * is said to be good if it fulfills any one of the criteria:
// * 1. Length of the subarray is even, and the sum of all
// * the elements of the subarray must be less than B.
// * 2. Length of the subarray is odd, and the sum of
// * all the elements of the subarray must be greater than B.
// * Your task is to find the count of good subarrays in A.

// # Problem Constraints
// * 1 <= len(A) <= 5 x 10^3
// * 1 <= A[i] <= 10^3
// * 1 <= B <= 10^7

// # Input Format
// * The first argument given is the integer array A.
// * The second argument given is an integer B.

// # Output Format
// * Return the count of good subarrays in A.

// # Example
// $ Input 1
// * A = [1, 2, 3, 4, 5]
// * B = 4

// $ Output 1
// * 6

// ! Explanantion
// * Even length good subarrays = {1, 2}
// * Odd length good subarrays = {1, 2, 3}, {1, 2, 3, 4, 5}, {2, 3, 4}, {3, 4, 5}, {5} 

// $ Input 2
// * A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
// * B = 65

// $ Output 2
// * 35

// ! Explanantion
// * There are 36 good subarrays

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
        System.out.print("enter integer to compare sum with: ");
        return sc.nextInt();
    }

    public static int solve(int[] A, int B) {
        // # Aprroach
        // * For all the (i -> j) subarray pairs, find out
        // * whether it's length and sum match the description
        // * to account for a good pair or not
        // * I will be carry forwarding the sum and not creating/modifying
        // * a prefix-sum array (to save on space)

        int goodPair = 0;
        for (int i = 0; i < A.length; i++) {
            long sum = 0;
            for (int j = i; j < A.length; j++) {
                int length = j - i + 1;
                sum += A[j];
                if (length % 2 == 0 && sum < B || length % 2 == 1 && sum > B) goodPair++; 
            }
        }
        return goodPair;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read array input
        int[] A = readArray(sc);

        // * read integer to compare sum with
        int B = readInteger(sc);

        // * count the no of good subarrays
        System.out.println("no of good pairs: " + solve(A, B));
    }
}