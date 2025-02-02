// # Problem Description
// * Given an array A of N integers.
// * Construct prefix sum of the array in the given array itself.

// # Problem Constraints
// * 1 <= N <= 10^5
// * 1 <= A[i] <= 10^3

// # Input Format
// * Only argument A is an array of integers.

// # Output Format
// * Return an array of integers denoting
// * the prefix sum of the given array.

// # Example
// $ Input 1
// * A = [1, 2, 3, 4, 5]

// $ Output 1
// * [1, 3, 6, 10, 15]

// ! Explanantion
// * The prefix sum array of [1, 2, 3, 4, 5] is [1, 3, 6, 10, 15].

// $ Input 2
// * A = [4, 3, 2]

// $ Output 2
// * [4, 7, 9]

// ! Explanantion
// * The prefix sum array of [4, 3, 2] is [4, 7, 9].

import java.util.Arrays;
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

    public static int[] solve(int[] A) {
        for (int i = 1; i < A.length; i++) {
            A[i] = A[i - 1] + A[i];
        }
        return A;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading array
        int[] arr = readArray(sc);

        // * creating prefix sum in original array
        System.out.println("prefix-sum array: " + Arrays.toString(solve(arr)));
    }
}
