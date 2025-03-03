// # Problem Description
// * You are given two matrices A & B of same size,
// * you have to return another matrix which is the sum of A and B.

// # Note:
// * Matrices are of same size means the number of
// * rows and number of columns of both matrices are equal.

// # Problem Constraints
// * 1 <= A.size(), B.size() <= 1000
// * 1 <= A[i].size(), B[i].size() <= 1000
// * 1 <= A[i][j], B[i][j] <= 1000

// # Input Format
// * The first argument is the 2D integer array A
// * The second argument is the 2D integer array B

// # Output Format
// * You have to return a vector of vector of integers
// * after doing required operations.

// # Example
// $ Input 1
// * A = [[1, 2, 3],
// *      [4, 5, 6],
// *      [7, 8, 9]]
// * B = [[9, 8, 7],   
// *      [6, 5, 4],   
// *      [3, 2, 1]]

// $ Output 1
// * [[10, 10, 10],   
// *  [10, 10, 10],   
// *  [10, 10, 10]]

// ! Explanantion
// * A + B = [[1+9, 2+8, 3+7],  
// *          [4+6, 5+5, 6+4],  
// *          [7+3, 8+2, 9+1]]   
// *       = [[10, 10, 10],   
// *          [10, 10, 10],   
// *          [10, 10, 10]].

// $ Input 2
// * A = [[1, 2, 3],   
// *      [4, 1, 2],   
// *      [7, 8, 9]]  
// *
// * B = [[9, 9, 7],   
// *      [1, 2, 4],   
// *      [4, 6, 3]]

// $ Output 2
// * [[10, 11, 10],   
// *  [5,   3,  6],   
// *  [11, 14, 12]]

// ! Explanantion
// * A + B = [[1+9, 2+9, 3+7],  
// *          [4+1, 1+2, 2+4],  
// *          [7+4, 8+6, 9+3]]   
// *       = [[10, 11, 10],   
// *          [5,   3,  6],   
// *          [11, 14, 12]].

import java.util.Scanner;

public class Main {

    public static int[][] readMatrix(Scanner sc, String msg) {
        System.out.println(msg);
        System.out.print("enter row and column sizes: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        // * taking input
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            System.out.print("enter elements for row " + (i+1) + ": ");
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        return arr;
    }

    public static void printMatrix(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        for (int i = 0; i < r; i++) {
            System.out.print("row " + (i+1) + " : [");
            for (int j = 0; j < c; j++) {
                int el = arr[i][j];
                System.out.print(j != c-1 ? el +", ": el + "]\n");
            }
        }
    }

    public static int[][] solve(int[][] A, int[][] B) {
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                B[i][j] += A[i][j];
            }
        }
        return B;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // * read matrix
        int[][] A = readMatrix(sc, "Matrix A:");
        int[][] B = readMatrix(sc, "Matrix B:");

        // * perform matrix addition
        printMatrix(solve(A, B));
    }
}
