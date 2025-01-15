// # Problem Description
// * Given an N x N matrix, print the elements of the matrix
// * in a wave form row-wise. For the first row, traverse from
// * left to right, for the second row, traverse from right to left,
// * and continue this alternating pattern for the remaining rows.

// # Problem Constraints
// * 1 <= N <= 10^3
// * 0 <= Mat[i][j] <= 10^9

// # Input Format
// * First line is an integer N
// * Next N lines contain N space separated integers representing the matrix Mat

// # Output Format
// * A single line containing N*N integers of matrix Mat in wave form (row wise)

// # Note:
// * Ensure there is a space character (' ') at the end of the line.

// # Example
// $ Input 1
// * 3
// * 4 1 2 
// * 7 4 4 
// * 3 7 4

// $ Output 1
// * 4 1 2 4 4 7 3 7 4

// ! Explanantion
// * We will first iterate the 1st row from left to right and print the elements, 
// * then we will iterate the 2nd row from right to left and print the elements,
// * then we will iterate the 3rd row from left to right and print the elements.
// * This looks like a wave.

// $ Input 2
// * 2
// * 1 2
// * 3 4

// $ Output 2
// * 1 2 4 3

// ! Explanation
// * We will first iterate the 1st row from left to right and print the elements, 
// * then we will iterate the 2nd row from right to left and print the elements.
// * This looks like a wave.

import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[][] arr, Scanner sc) {
        int R = arr.length;
        int C = arr[0].length;

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                arr[r][c] = sc.nextInt();
            }
        }
    }

    public static void printWaveRowWise(int[][] arr) {
        int R = arr.length;
        int C = arr[0].length;

        for (int r = 0; r < R; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < C; c++) {
                    System.out.print(arr[r][c] + " ");
                }
            } else {
                for (int c = C - 1; c >= 0; c--) {
                    System.out.print(arr[r][c] + " ");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[][] arr = new int[number][number];

        readArrayInput(arr, sc);
        printWaveRowWise(arr);
    }
}
