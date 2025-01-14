// # Problem Description
// * Given an array A, check if it is sorted in non-decreasing order or not.

// # Non-Decreasing
// * Non-decreasing order means that the numbers in a sequence
// * can stay the same or increase, but they cannot decrease.

// # Problem Constraints
// * 1 <= Ai <= 10^9
// * 1 <= |A| <= 10^5


// # Input Format
// * The first and only argument contains an integer array A.

// # Output Format
// * Return 1 if array is sorted else return 0.

// # Example
// $ Input 1
// * A = [1, 2, 2]

// $ Output 1
// * 1

// $ Input 2
// * A = [1, 2, 1] 

// $ Output 2
// * 0

import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int solve(int[] A) {
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i-1]) {
                return 0;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];

        readArrayInput(arr, sc);
        System.out.println(solve(arr));
    }
}
