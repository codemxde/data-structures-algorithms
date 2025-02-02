// # Problem Description
// * Given an array A and an integer B,
// * find the number of occurrences of B in A.

// # Problem Constraints
// * 1 <= B, A[i] <= 10^9
// * 1 <= length(A) <= 10^5

// # Input Format
// * Given an integer array A and an integer B.

// # Output Format
// * Return an integer, number of occurrences of B in A.

// # Example
// $ Input 1
// * A = [1, 2, 2], B = 2 

// $ Output 1
// * 2

// ! Explanantion
// * Element at index 2, 3 is equal to 2 hence count is 2.

// $ Input 2
// * A = [1, 2, 1], B = 3

// $ Output 2
// * 0

// ! Explanation
// * There is no element equal to 3 in the array.

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
        System.out.print("enter integer: ");
        return sc.nextInt();
    }

    public static int solve(int[] A, int B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading an array
        int[] arr = readArray(sc);

        // * read integer
        int B = readInteger(sc);

        // * finding number of occureneces of 'B' in array
        System.out.println("no of occurences: " + solve(arr, B));
    }
}
