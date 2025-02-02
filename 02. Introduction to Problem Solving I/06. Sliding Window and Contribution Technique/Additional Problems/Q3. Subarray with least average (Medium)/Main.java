// # Problem Description
// * Given an array A of size N, find the
// * subarray of size B with the least average.

// # Problem Constraints
// * 1 <= B <= N <= 10^5
// * -10^5 <= A[i] <= 10^5

// # Input Format
// * First argument contains an array A of integers of size N.
// * Second argument contains integer B.

// # Output Format
// * Return the index of the first element of the subarray
// * of size B that has least average.
// * Array indexing starts from 0.

// # Example
// $ Input 1
// * A = [3, 7, 90, 20, 10, 50, 40]
// * B = 3

// $ Output 1
// * 3

// ! Explanantion
// * Subarray between indexes 3 and 5
// * The subarray {20, 10, 50} has the least average 
// * among all subarrays of size 3.

// $ Input 2
// * A = [3, 7, 5, 20, -10, 0, 12]
// * B = 2

// $ Output 2
// * 4

// ! Explanantion
// * Subarray between [4, 5] has minimum average

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
        System.out.print("enter size of subarray: ");
        return sc.nextInt();
    }

    public static int solve(int[] A, int B) {
        // # Approach
        // * configure a 'sliding window' of length B
        // * 'carry forward' the index of the window with least average
        
        int index = 0;
        int windowSum = A[0];

        // * configuring sum for window
        for (int i = 1; i < B; i++) {
            windowSum += A[i];
        }
        
        double minAverage = (double) windowSum / B;

        // * sliding window and finding average
        int si = 1;
        int ei = B;

        while (ei < A.length) {
            windowSum = windowSum - A[si - 1] + A[ei];
            double average = (double) windowSum / B;
            if (average < minAverage) {
                minAverage = average;
                index = si;
            }
            si++;
            ei++;
        }
        return index;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading array input
        int[] A = readArray(sc);

        // * reading integer to compare sum with
        int B = readInteger(sc);

        // * finding first index of subarray with length B and least average
        System.out.println("\nstart index of subarray with lowest average: " + solve(A, B));
    }
}
