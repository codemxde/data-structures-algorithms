// # Problem Description
// * You are given two integer matrices A and B having same size
// * (Both having same number of rows (N) and columns (M).
// * You have to subtract matrix B from A and return the resultant matrix.
// * (i.e. return the matrix A - B).

// * If A and B are two matrices of the same order (same dimensions).
// * Then A - B is a matrix of the same order as A and B and its
// * elements are obtained by doing an element wise subtraction of A from B.

// # Problem Constraints
// * 1 <= N, M <= 103
// * -10^9 <= A[i][j], B[i][j] <= 10^9

// # Input Format
// * The first argument is the 2D integer array A
// * The second argument is the 2D integer array B

// # Output Format
// * Return a 2D matrix denoting A - B.

// # Example
// $ Input 1
// * A =  [[1, 2, 3], 
// * [4, 5, 6], 
// * [7, 8, 9]]

// * B =  [[9, 8, 7], 
// * [6, 5, 4], 
// * [3, 2, 1]]

// $ Output 1
// * [[-8, -6, -4],
// *  [-2, 0, 2],
// *  [4, 6, 8]]

// $ Input 2
// * A = [[1, 1]]
 
// * B = [[2, 3]] 

// $ Output 2
// * [[-1, -2]]

// ! Explanantion
// * [[1, 1]] - [[2, 3]] = [[1 - 2, 1 - 3]] = [[-1, -2]]

import java.util.Scanner;

public class Main {

    public static void receiveArrayInput(String msg, int[][] arr, Scanner sc) {
        System.out.println("\n" + msg);
        int R = arr.length;
        int C = arr[0].length;
        for (int i = 0; i < R; i++) {
            System.out.print("Enter elements for row " + (i+1) + ": ");
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] arr) {
        System.out.println("-------------------------");
        int R = arr.length;
        int C = arr[0].length;
        for (int i = 0; i < R; i++) {
            System.out.print("[");
            for (int j = 0; j < C; j++) {
                int el = arr[i][j];
                System.out.print(j == C - 1 ? el + "]\n" : el + ", ");
            }
        }
    }

    public static int[][] solve(int[][] A, int[][] B) {
        int R = A.length;
        int C = A[0].length;
        int[][] arr = new int[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = A[i][j] - B[i][j]; 
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int R = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int C = sc.nextInt();
        int[][] A = new int[R][C];
        int[][] B = new int[R][C];

        receiveArrayInput("Matrix A:", A, sc);
        receiveArrayInput("Matrix B:", B, sc);
        printMatrix(solve(A, B));
    }
}
