// # Problem Description
// * Given an array A of length N, return the subarray from B to C.

// # Problem Constraints
// * 1 <= N <= 10^5
// * 1 <= A[i] <= 10^9
// * 0 <= B <= C < N

// # Input Format
// * The first argument A is an array of integers
// * The remaining argument B and C are integers.

// # Output Format
// * Return a subarray

// # Example
// $ Input 1
// * A = [4, 3, 2, 6]
// * B = 1
// * C = 3

// $ Output 1
// * [3, 2, 6]

// ! Explanantion
// * The subarray of A from 1 to 3 is [3, 2, 6].

// $ Input 2
// * A = [4, 2, 2]
// * B = 0
// * C = 1

// $ Output 2
// * [4, 2]

// ! Explanantion
// * The subarray of A from 0 to 1 is [4, 2].

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

    public static int[] readIndexes(Scanner sc) {
        int[] arr = new int[2];

        System.out.print("enter start and end indexes: ");
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        return arr;
    }

    public static int[] solve(int[] A, int B, int C) {
        int[] arr = new int[C - B + 1];
        
        int i = 0;
        while (B <= C) {
            arr[i] = A[B];
            i++;
            B++;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read array
        int[] arr = readArray(sc);

        // * read indexes for subarray
        int[] indexes = readIndexes(sc); int B = indexes[0], C = indexes[1];

        // * printing subarray using input indexes
        System.out.println("subarray: " + Arrays.toString(solve(arr, B, C)));
    }
}
