// # Problem Description
// * You are given a 2D integer matrix A, return a 1D integer array
// * containing column-wise sums of original matrix.

// # Problem Constraints
// * 1 <= A.size() <= 10^3
// * 1 <= A[i].size() <= 10^3
// * 1 <= A[i][j] <= 10^3

// # Input Format
// * First argument is a 2D array of integers.(2D matrix).

// # Output Format
// * Return an array containing column-wise sums of original matrix.

// # Example
// $ Input 1
// * [1,2,3,4]
// * [5,6,7,8]
// * [9,2,3,4]

// $ Output 1
// * {15,10,13,16}

// ! Explanantion
// * Column 1 = 1+5+9 = 15
// * Column 2 = 2+6+2 = 10
// * Column 3 = 3+7+3 = 13
// * Column 4 = 4+8+4 = 16

import java.util.Arrays;
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

    public static int[] solve(int[][] A) {
        int r = A.length;
        int c = A[0].length;
        
        // * calculating column wise sum and storing
        int[] arr = new int[c];
        for (int i = 0; i < c; i++) {
            int sum = 0;
            for (int j = 0; j < r; j++) {
                sum += A[j][i];
            }
            arr[i] = sum;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // * read matrix
        int[][] arr = readMatrix(sc);

        // * find and store column sums
        System.out.println("column wise seum : " + Arrays.toString(solve(arr)));
    }
}