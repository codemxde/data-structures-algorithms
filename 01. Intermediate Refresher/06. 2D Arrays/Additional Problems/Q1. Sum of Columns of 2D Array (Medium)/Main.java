// # Problem Description
// * Given a 2D integer array C[][] of A rows and B columns.
// * Return an integer array of size B that represents
// * the sums of the columns of the 2D array C.

// # Problem Constraints
// * 1 <= A,B <= 10^3
// * 1 <= C[i][j] <= 10^3

// # Input Format
// * The first argument is a single integer A.
// * The second argument is a single integer B.
// * The third argument is a 2D integer array C.

// # Output Format
// * Return an integer array of size B that represents
// * the sums of the columns of the 2D array C.

// # Example
// $ Input 1
// * A = 3
// * B = 2
// * C = [[4, 1], [1, 3], [6, 2]]

// $ Output 1
// * [11, 6]

// ! Explanantion
// * Column 1 : 4 + 1 + 6 = 11
// * Column 2 : 1 + 3 + 2 = 6

// $ Input 2
// * A = 2
// * B = 2
// * C = [[1, 1], [4, 1]]

// $ Output 2
// * [5, 2]

// ! Explanantion
// * Column 1 : 4 + 1 = 5
// * Column 2 : 1 + 1 = 2

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

    public static int[] solve(int A, int B, int[][] C) {
        int[] arr = new int[B];
        for (int c = 0; c < B; c++) {
            int sum = 0;
            for (int r = 0; r < A; r++) {
                sum += C[r][c];
            }
            arr[c] = sum;
        }
        return arr;
    }

    public static void printSumArray(int[] arr) {
        System.out.println("-------------------------");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] + "]" : arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int A = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int B = sc.nextInt();
        int[][] arr = new int[A][B];       

        receiveArrayInput(arr, sc);
        printSumArray(solve(A, B, arr));
    }
}