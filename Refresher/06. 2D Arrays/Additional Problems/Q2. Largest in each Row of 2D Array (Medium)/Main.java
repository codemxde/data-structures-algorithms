// # Problem Description
// * Given a 2D array A of N rows and M columns.
// * Find value of largest element in each row.

// # Problem Constraints
// * 1 <= N, M <= 1000
// * 1 <= Ai <= 10^9

// # Input Format
// * The first argument A is a 2D array of integers

// # Output Format
// * Return an array of length N, in which every index i
// * contains the maximun value of the ith row in the 2D matrix.

// # Example
// $ Input 1
// * A = [[1, 2], [1, 3]]

// $ Output 1
// * [2, 3]

// ! Explanantion
// * In the first row 2 is maximum value.
// * In the second row 3 is maximum value.

// $ Input 2
// * A = [[1, 2, 3]]

// $ Output 2
// * [3]

// ! Explanantion
// * In the first and only row 3 is maximum value.

import java.util.Scanner;

public class Main {

    public static void receiveArrayInput(int[][] arr, Scanner sc) {
        int R = arr.length;
        int C = arr[0].length;
        for (int i = 0; i < R; i++) {
            System.out.print("Enter elements for row " + (i+1) + ": ");
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void printSumArray(int[] arr) {
        System.out.println("-------------------------");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] + "]" : arr[i] + ", ");
        }
    }

    public static int[] solve(int[][] A) {
        int[] arr = new int[A.length];
        int R = A.length;
        int C = A[0].length;
        for (int i = 0; i < R; i++) {
            int max = A[i][0];
            for (int j = 0; j < C; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
            arr[i] = max;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int A = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int B = sc.nextInt();
        int[][] arr = new int[A][B];       

        receiveArrayInput(arr, sc);
        printSumArray(solve(arr));
    }
}
