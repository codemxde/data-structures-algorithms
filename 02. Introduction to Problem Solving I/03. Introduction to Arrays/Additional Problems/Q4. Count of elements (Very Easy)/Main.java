// # Problem Description
// * Given an array A of N integers. 
// * Count the number of elements that have
// * at least 1 elements greater than itself.

// # Problem Constraints
// * 1 <= N <= 10^6
// * 1 <= A[i] <= 10^9

// # Input Format
// * First and only argument is an array of integers A.

// # Output Format
// * Return the count of elements.

// # Example
// $ Input 1
// * A = [3, 1, 2]

// $ Output 1
// * 2

// ! Explanantion
// * The elements that have at least 1
// * element greater than itself are 1 and 2

// $ Input 2
// * A = [5, 5, 3]

// $ Output 2
// * 1

// ! Explanantion
// * The elements that have at least 1 element greater than itself is 3

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
        // * Either the number itself is the maximum or some maximum exits
        // * for which that element is greater than the element

        // * First calculate max of the array
        // * Then, for each element, if its the max then no elemt exists
        // * which is greater than it
        // * If it is not max, then increase count by 1 as a maximum element exists
        // * which is greater than that element

        int count = 0;

        // * calculating maximum element
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }

        // * checking number of elements for which a maximum exists
        for (int i = 0; i < A.length; i++) {
            if (max > A[i]) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading an array
        int[] arr = readArray(sc);

        // * counting elements which have elements greater than themselves
        System.out.println("no of such elements: " + solve(arr));
    }
}
