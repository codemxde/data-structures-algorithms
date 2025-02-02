// # Problem Description
// * Given an array A of size N.
// * You need to find the sum of
// * Maximum and Minimum element in the given array.

// # Problem Constraints
// * 1 <= N <= 10^5
// * -10^9 <= A[i] <= 10^9

// # Input Format
// * First argument A is an integer array.

// # Output Format
// * Return the sum of maximum and minimum element of the array

// # Example
// $ Input 1
// * A = [-2, 1, -4, 5, 3]

// $ Output 1
// * 1

// ! Explanantion
// * Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1. 

// $ Input 2
// * A = [1, 3, 4, 1]

// $ Output 2
// * 5

// ! Explanantion
// * Maximum Element is 4 and Minimum element is 1. (4 + 1) = 5.

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
        // * iterate each element, either it would be the maximum
        // * or it would be the minumum
        // * only time they would be same is when all the elements in
        // * the array are equal

        int max = A[0];
        int min= A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            } else if (A[i] < min) {
                min = A[i];
            }
        }
        return max + min;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading an array
        int[] arr = readArray(sc);

        // * counting elements which have elements greater than themselves
        System.out.println("sum of maximum and minum values are: " + solve(arr));
    }
}
