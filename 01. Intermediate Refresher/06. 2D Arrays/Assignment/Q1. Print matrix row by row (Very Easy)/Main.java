// # Problem Description
// * Given a matrix of N rows and M columns, print it row by row.
// * Firstly print 0th row, then 1st row, 2nd row and so on.

// # Problem Constraints
// * 1 <= N <= 100
// * 1 <= M <= 100
// * 1 <= mat[i][j] <= 10000

// # Input Format
// * Two values denoting N and M,
// * Next N lines contain M space separated integers representing the matrix Mat

// # Output Format
// * N lines denoting each row.
// * Note: Ensure there is a space character (' ') at the end of the line.

// # Example
// $ Input 1
// * 3 4
// * 10 20 30 40
// * 50 60 70 80
// * 90 100 110 120

// $ Output 1
// * 10 20 30 40
// * 50 60 70 80
// * 90 100 110 120

// ! Explanantion
// * 0th row -> 10 20 30 40
// * 1st row -> 50 60 70 80
// * 2nd row -> 90 100 110 120

import java.util.Scanner;

public class Main {

    public static int[][] initializeArray(Scanner sc) {
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        return new int[rows][columns];
    }

    public static void readArrayInput(int[][] arr, Scanner sc) {
        int R = arr.length;
        int C = arr[0].length;

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                arr[r][c] = sc.nextInt();
            }
        }
    }

    public static void printMatrixRowByRow(int[][] arr) {
        int R = arr.length;
        int C = arr[0].length;

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static void readAndPrintMatrix(Scanner sc) {
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = initializeArray(sc);
        readArrayInput(arr, sc);
        printMatrixRowByRow(arr);

        // # Very Quick Alternative (Not included in submission)
        // readAndPrintMatrix(sc);
    }
}