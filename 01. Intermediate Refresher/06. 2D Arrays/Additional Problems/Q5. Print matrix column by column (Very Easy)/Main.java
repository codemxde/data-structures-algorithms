// # Problem Description
// * Given a matrix of N rows and M columns, print it column by column.
// * Firstly print 0th column, then 1st column, 2nd column and so on.

// # Note
// * Make sure to receive the matrix input row by row.

// # Problem Constraints
// * 1 <= N <= 100
// * 1 <= M <= 100
// * 1 <= mat[i][j] <= 10000

// # Input Format
// * Two values denoting N and M,
// * Next N lines contain M space separated integers
// * representing the matrix Mat

// # Output Format
// * M lines denoting each column
// # Note:
// * Ensure there is a space character (' ') at the end of the line.

// # Example
// $ Input 1
// * 3 4
// * 10 20 30 40
// * 50 60 70 80
// * 90 100 110 120

// $ Output 1
// * 10 50 90
// * 20 60 100
// * 30 70 110
// * 40 80 120

// ! Explanation
// * 0th column -> 10 50 90
// * 1st column -> 20 60 100
// * 2nd column -> 30 70 80
// * 3rd column -> 40 80 120

import java.util.Scanner;

public class Main {

    public static void readMatrixInput(int[][] arr, Scanner sc) {
        int R = arr.length;
        int C = arr[0].length;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] arr) {
        int R = arr.length;
        int C = arr[0].length;

        for (int c = 0; c < C; c++) {
            for (int r = 0; r < R; r++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R][C];
        
        readMatrixInput(arr, sc);
        printMatrix(arr);
    }
}
