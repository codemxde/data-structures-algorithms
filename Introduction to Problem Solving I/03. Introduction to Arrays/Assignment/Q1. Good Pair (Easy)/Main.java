// # Problem Description
// * Given an array A and an integer B. A pair(i, j) in
// * the array is a good pair if i != j and (A[i] + A[j] == B).
// * Check if any good pair exist or not.

// # Problem Constraints
// * 1 <= A.size() <= 10^4
// * 1 <= A[i] <= 10^9
// * 1 <= B <= 10^9

// # Input Format
// * First argument is an integer array A.
// * Second argument is an integer B.

// # Output Format
// * Return 1 if good pair exist otherwise return 0.

// # Example
// $ Input 1
// * A = [1,2,3,4]
// * B = 7

// $ Output 1
// * 1

// ! Explanantion
// * (i,j) = (3,4)

// $ Input 2
// * A = [1,2,4]
// * B = 4

// $ Output 2
// * 0

// ! Explanantion
// * No pair has sum equal to 4.

// $ Input 3
// * A = [1,2,2]
// * B = 4

// $ Output 3
// * 1

// ! Explanantion
// * (i,j) = (2,3)

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
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] + A[j] == B) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading an array
        int[] arr = readArray(sc);

        // * read integer
        int B = readInteger(sc);

        // * find good pair
        System.out.println("Good Pair " + (solve(arr, B) == 1 ? "exists!" : "does not exist"));
    }
}