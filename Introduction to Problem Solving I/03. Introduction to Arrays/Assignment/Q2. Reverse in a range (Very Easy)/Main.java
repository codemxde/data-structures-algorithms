// # Problem Description
// * Given an array A of N integers and
// * also given two integers B and C.
// * Reverse the elements of the array A
// * within the given inclusive range [B, C].

// # Problem Constraints
// * 1 <= N <= 10^5
// * 1 <= A[i] <= 10^9
// * 0 <= B <= C <= N - 1

// # Input Format
// * The first argument A is an array of integer.
// * The second and third arguments are integers B and C

// # Output Format
// * Return the array A after reversing in the given range.

// # Example
// $ Input 1
// * A = [1, 2, 3, 4]
// * B = 2
// * C = 3

// $ Output 1
// * [1, 2, 4, 3]

// ! Explanantion
// * We reverse the subarray [3, 4].

// $ Input 2
// * A = [2, 5, 6]
// * B = 0
// * C = 2

// $ Output 2
// * [6, 5, 2]

// ! Explanantion
// * We reverse the entire array [2, 5, 6].

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
        return arr;
    }

    public static int[] readIndexes(Scanner sc) {
        int[] arr = new int[2];

        System.out.print("enter start index: ");
        arr[0] = sc.nextInt();
        
        System.out.print("enter end index: ");
        arr[1] = sc.nextInt();
        
        return arr;
    }

    public static int[] solve(int[] A, int B, int C) {
        while (B < C) {
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;

            B++;
            C--;
        }
        return A;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading an array
        int[] arr = readArray(sc); 

        // * read reverse indexes
        int[] indexes = readIndexes(sc);
        int B = indexes[0];
        int C = indexes[1];

        // * reverse the array in given range
        System.out.println("after reversal: " + Arrays.toString(solve(arr, B, C)));
    }
}
