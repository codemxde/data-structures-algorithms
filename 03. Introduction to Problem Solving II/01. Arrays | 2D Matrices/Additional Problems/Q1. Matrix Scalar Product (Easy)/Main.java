// # Problem Description
// * You are given a matrix A and and an integer B,
// * you have to perform scalar multiplication
// * of matrix A with an integer B.

// # Problem Constraints
// * 1 <= A.size() <= 1000
// * 1 <= A[i].size() <= 1000
// * 1 <= A[i][j] <= 1000
// * 1 <= B <= 1000

// # Input Format
// * First argument is 2D array of integers A representing matrix.
// * Second argument is an integer B.

// # Output Format
// * You have to return a 2D array of
// * integers after doing required operations.

// # Example
// $ Input 1
// * A = [[1, 2, 3],
// *      [4, 5, 6],
// *      [7, 8, 9]]
// * B = 2 

// $ Output 1
// * [[2, 4, 6], 
// *  [8, 10, 12], 
// *  [14, 16, 18]]

// ! Explanantion
// * ==> ( [[1, 2, 3],[4, 5, 6],[7, 8, 9]] ) * 2
// * 
// * ==> [[2*1, 2*2, 2*3],
// * [2*4, 2*5, 2*6],
// * [2*7, 2*8, 2*9]]
// * 
// * ==> [[2,   4,  6], 
// * [8,  10, 12], 
// * [14, 16, 18]]

// $ Input 2
// * A = [[1]]
// * B = 5 

// $ Output 2
// * [[5]]

// ! Explanantion
// * ==> ( [[1]] ) * 5
// * 
// * ==> [[5*1]]
// * 
// * ==> [[5]]

import java.util.Scanner;

public class Main {

    public static int[][] readMatrix(Scanner sc) {
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
        return arr;
    }

    public static int readMultiplier(Scanner sc) {
        System.out.print("\nenter multiplier: ");
        return sc.nextInt();
    }

    public static void printMatrix(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        System.out.println();
        for (int i = 0; i < r; i++) {
            System.out.print("row " + (i+1) + " : [");
            for (int j = 0; j < c; j++) {
                int el = arr[i][j];
                System.out.print(j != c-1 ? el +", ": el + "]\n");
            }
        }
    }

    public static int[][] solve(int[][] A, int B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] *= B;
            }
        }
        return A;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // * read matrix
        int[][] A = readMatrix(sc);

        // * read multipplier
        int B = readMultiplier(sc);

        // * perform scalar multiplication on matrix
        printMatrix(solve(A, B));
    }
}
