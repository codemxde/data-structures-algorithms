// # Problem Description
// * Given an integer array A of size N. In one second,
// * you can increase the value of one element by 1.
// * Find the minimum time in seconds to make all elements of the array equal.

// # Problem Constraints
// * 1 <= N <= 1000000 or 10^6
// * 1 <= A[i] <= 1000

// # Input Format
// * First argument is an integer array A.

// # Output Format
// * Return an integer denoting the minimum time to make all elements equal.

// # Example
// $ Input 1
// * A = [2, 4, 1, 3, 2]

// $ Output 1
// * 8

// ! Explanantion
// * We can change the array A = [4, 4, 4, 4, 4].
// * The time required will be 8 seconds.

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

    public static int solve(int[] A) {
        // # Approach
        // * Since we can only 'increment' by 1, we need to find the
        // * maximum element of the array first
        // * Then, the difference of the maximum element with each element
        // * is the number by which we need to increment or the 'time'
        // * for that element
        // * we need to keep adding the time taken for each element to reach the
        // * maximum value to calculate overall time

        // * Calculating max
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if(A[i] > max) {
                max = A[i];
            }
        }

        // * Calculating minimum overall time
        int minimumTime = 0;
        for (int i = 0; i < A.length; i++) {
            minimumTime += (max - A[i]);
        }
        return minimumTime;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading an array
        int[] arr = readArray(sc);

        // * finding minimum time to make all elements equal
        System.out.println("minimum time spent: " + solve(arr));
    }
}
