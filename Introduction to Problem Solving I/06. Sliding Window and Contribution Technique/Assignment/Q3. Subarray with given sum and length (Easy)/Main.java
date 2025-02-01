// # Problem Description
// * Given an array A of length N.
// * Also given are integers B and C.
// * Return 1 if there exists a subarray with
// * length B having sum C and 0 otherwise

// # Problem Constraints
// * 1 <= N <= 10^5
// * 1 <= A[i] <= 10^4
// * 1 <= B <= N
// * 1 <= C <= 10^9

// # Input Format
// * First argument A is an array of integers.
// * The remaining arguments B and C are integers

// # Output Format
// * Return 1 if such a subarray exist and 0 otherwise

// # Example
// $ Input 1
// * A = [4, 3, 2, 6, 1]
// * B = 3
// * C = 11

// $ Output 1
// * 1

// ! Explanantion
// * The subarray [3, 2, 6] is of length 3 and sum 11.

// $ Input 2
// * A = [4, 2, 2, 5, 1]
// * B = 4
// * C = 6

// $ Output 2
// * 0

// ! Explanantion
// * There are no such subarray.

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

    public static int[] readLengthAndSum(Scanner sc) {
        int[] arr = new int[2];
        System.out.print("enter length of subarray: ");
        arr[0] = sc.nextInt();
        System.out.print("enter desired sum: ");
        arr[1] = sc.nextInt();
        return arr;
    }
    
    public static int solve(int[] A, int B, int C) {
        // # Approach
        // * Configure a sliding window of length 'B'
        // * Check in each window whether sum is equal to C

        // # Time and Space Complexity
        // * T.C - O(N), S.C - O(1)

        int N = A.length;
        long sum = A[0];
        
        // * handling edge case (A.length = 1)
        if (A.length == 1 && sum == C) {
            return 1;
        }
        
        // * calculating sum of elements in window
        for (int i = 1; i < B; i++) {
            sum += A[i];
        }

        // * sliding the window and checking sum
        int si = 1;
        int ei = B;

        while (ei < N) {
            sum = sum - A[si - 1] + A[ei];
            if (sum == C) return 1;
            si++;
            ei++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read array input
        int[] A = readArray(sc);
        
        // * read subarray length and desired sum
        int[] arr = readLengthAndSum(sc); int B = arr[0], C = arr[1];

        // * find subarray with given sum and length
        System.out.println(solve(A, B, C) == 1 ? "\nsuch a subarray exists" : "\nno such subarray exists");
    }
}
