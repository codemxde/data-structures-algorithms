// # Problem Description
// * You are given two matrices A & B of same size,
// * you have to return another matrix which is the sum of A and B.

// # Note:
// * Matrices are of same size means the number of
// * rows and number of columns of both matrices are equal.

// # Problem Constraints
// * 1 <= A.size(), B.size() <= 1000 1 <= A[i].size(),
// * B[i].size() <= 1000 1 <= A[i][j], B[i][j] <= 1000

// # Input Format
// * The first argument is the 2D integer array A
// * The second argument is the 2D integer array B

// # Output Format
// * You have to return a vector of vector of integers
// * after doing required operations.

// # Example
// $ Input 1
// * A = [[1, 2, 3],   
// * [4, 5, 6],   
// * [7, 8, 9]]  

// * B = [[9, 8, 7],   
// * [6, 5, 4],   
// * [3, 2, 1]]

// $ Output 1
// * [[10, 10, 10],   
// * [10, 10, 10],   
// * [10, 10, 10]]

// ! Explanantion
// * A + B = [[1+9, 2+8, 3+7],  
// * [4+6, 5+5, 6+4],  
// * [7+3, 8+2, 9+1]]   
// * = [[10, 10, 10],   
// * [10, 10, 10],   
// * [10, 10, 10]].

// $ Input 2
// * A = [[1, 2, 3],   
// * [4, 1, 2],   
// * [7, 8, 9]]  
// * 
// * B = [[9, 9, 7],   
// * [1, 2, 4],   
// * [4, 6, 3]]

// $ Output 2
// * [[10, 11, 10],   
// * [5,   3,  6],   
// * [11, 14, 12]]

// ! Explanantion
// * A + B = [[1+9, 2+9, 3+7],  
// * [4+1, 1+2, 2+4],  
// * [7+4, 8+6, 9+3]]   
// * = [[10, 11, 10],   
// * [5,   3,  6],   
// * [11, 14, 12]].

import java.util.Scanner;

public class Main {

    public static void readMatrixInput(String msg, int[][] arr, Scanner sc) {
        System.out.println("\n" + msg);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter elements for row " + (i+1) + ": ");
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static int[][] solve(int[][] A, int[][] B) {
        int[][] arr = new int[A.length][A[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = A[i][j] + B[i][j];
            }
        }
        return arr;
    }

    public static void printMatrix(int[][] arr) {
        int R = arr.length;
        int C = arr[0].length;
        System.out.println("--------------------------------");
        for (int i = 0; i < R; i++) {
            System.out.print("[");
            for (int j = 0; j < C; j++) {
                int el = arr[i][j];
                System.out.print(j == C - 1 ? el + "]\n" : el + ", ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int columns = sc.nextInt();

        int[][] A = new int[rows][columns];
        int[][] B = new int[rows][columns];

        readMatrixInput("Matrix A:", A, sc);
        readMatrixInput("Matrix B:", B, sc);
        printMatrix(solve(A, B));
    }
}
