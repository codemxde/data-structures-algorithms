// # Problem Description
// * You are given an integer array A.
// * You have to find the second largest element/value
// * in the array or report that no such element exists.

// # Problem Constraints
// * 1 <= |A| <= 10^5
// * 0 <= A[i] <= 10^9

// # Input Format
// * The first argument is an integer array A.

// # Output Format
// * Return the second largest element.
// * If no such element exist then return -1.

// # Example
// $ Input 1
// * A = [2, 1, 2] 

// $ Output 1
// * 1

// ! Explanantion
// * First largest element = 2
// * Second largest element = 1

// $ Input 2
// * A = [2]

// $ Output 2
// * -1

// ! Explanantion
// * There is no second largest element in the array.

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
        // * Refer to PDF document in same directory

        // # Handling edge case
        // * Returning -1 if only element exists in the array
        if (A.length == 1) {
            return -1;
        } 

        // * calculating maximum and second maximum
        int max = -1;
        int secondMax = -1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                secondMax = max;
                max = A[i];
            } else if (A[i] > secondMax && A[i] < max) {
                secondMax = A[i];
            }
        }

        return secondMax;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading an array
        int[] arr = readArray(sc);

        // * counting elements which have elements greater than themselves
        System.out.println("Second largest value" + (solve(arr) != -1 ? (": " + solve(arr)) : " does not exist"));
    }
}
