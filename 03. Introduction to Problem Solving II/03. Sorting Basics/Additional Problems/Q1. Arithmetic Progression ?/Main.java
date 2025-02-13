// # Problem Description
// * Given an integer array A of size N.
// * Return 1 if the array can be arranged to form
// * an arithmetic progression, otherwise return 0.

// # Arithmetic Progression
// * A sequence of numbers is called an arithmetic progression
// * if the difference between any two consecutive elements is the same.

// # Problem Constraints
// * 2 <= N <= 10^5
// * -10^9 <= A[i] <= 10^9

// # Input Format
// * The first and only argument is an integer array A of size N.

// # Output Format
// * Return 1 if the array can be rearranged to form an
// * arithmetic progression, otherwise return 0.

// # Example
// $ Input 1
// * A = [3, 5, 1]

// $ Output 1
// * 1

// ! Explanation
// * We can reorder the elements as [1, 3, 5] or [5, 3, 1] with
// * differences 2 and -2 respectively, between each consecutive elements.

// $ Input 2
// * A = [2, 4, 1]

// $ Output 2
// * 0

// ! Explanantion
// * There is no way to reorder the elements to obtain an arithmetic progression.

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

    public static int solve(int[] A) {
        Arrays.sort(A);
        int diff = A[1] - A[0];

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i+1] - A[i] != diff) return 0;
        }

        return 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read input array
        int[] arr = readArray(sc);

        // * check if array can be an arithmetic progression
        System.out.println(solve(arr) == 1 ? "Array is an AP" : "Not an AP");
    }
}
