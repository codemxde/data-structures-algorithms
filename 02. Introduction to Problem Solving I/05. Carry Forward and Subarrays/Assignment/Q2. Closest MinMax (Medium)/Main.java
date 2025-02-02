// # Problem Description
// * Given an array A, find the size of the smallest subarray such that
// * it contains at least one occurrence of the maximum value of the array
// * and at least one occurrence of the minimum value of the array.

// # Problem Constraints
// * 1 <= |A| <= 2000

// # Input Format
// * First and only argument is vector A

// # Output Format
// * Return the length of the smallest subarray which has at least
// * one occurrence of minimum and maximum element of the array

// # Example
// $ Input 1
// * A = [1, 3, 2]

// $ Output 1
// * 2

// ! Explanantion
// * Take the 1st and 2nd elements as they are the
// * minimum and maximum elements respectievly.

// $ Input 2
// * A = [2, 6, 1, 6, 9]

// $ Output 2
// * 3

// ! Explanantion
// * Take the last 3 elements of the array.

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

    public static int solve(int[] A) {
        // # Observation
        // * If a subarray exists such that it contains both
        // * min and max elements and is also the smallest of the ones,
        // * then the min/max elements must be the initial and end elements
        // * enclosing the minimum number of elements necessary.

        // # Approach
        // * Firstly, find the minimum and the maximum element of the array
        // * If both min and ma are same, then return 1, as be default the subarray
        // * will enclose only one element which is both the min and max
        // * If not same, iterate through the array once more, and this time
        // * carry forward the indexes of where maximum and minimum are being found.
        // * Keep updating the difference between both indexes, given that it is smaller 
        // * than the current difference

        int min = A[0];
        int max = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            } else if (A[i] < min) {
                min = A[i];
            }
        }

        // * handling edge case
        if (max == min) {
            return 1;
        }

        // * finding closest min-max
        int minIndex = -1;
        int maxIndex = -1;
        int minLength = A.length;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == max) {
                maxIndex = i;
                if (minIndex != -1 && maxIndex - minIndex + 1 < minLength) {
                    minLength = maxIndex - minIndex + 1;
                }
            } else if (A[i] == min) {
                minIndex = i;
                if (maxIndex != -1 && minIndex - maxIndex + 1 < minLength) {
                    minLength = minIndex - maxIndex + 1;
                }
            }
        }
        return minLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read input array
        int[] arr = readArray(sc);
        
        // * finding closest min and max
        System.out.println("length of smallest subarray with min and max: " + solve(arr));
    }
}