// # Problem Description
// * Given an integer array A.
// * Find and return the frequency of number B in array A.

// # Problem Constraints
// * 1 <= |A| <= 105
// * 1 <= A[i] <= 109
// * 1 <= B <= 109


// # Input Format
// * The first argument is an integer array A.
// * The second argument is an integer B.

// # Output Format
// * Return the frequency of B in the array A.

// # Example
// $ Input 1
// * A = [1, 1, 2, 4, 2]
// * B = 2

// $ Output 1
// * 2

// $ Input 2
// * A = [4, 2, 3, 4, 4]
// * B = 4

// $ Output 2
// * 3

import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int solve(int[] A, int B) {
        int frequency = 0;
        for (int i : A) {
            if (i == B) {
                frequency++;
            }
        }
        return frequency;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];

        readArrayInput(arr, sc);
        int findElement = sc.nextInt();
        System.out.println(solve(arr, findElement));
    }
}
