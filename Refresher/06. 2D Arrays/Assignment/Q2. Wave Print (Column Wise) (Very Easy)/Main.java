// # Problem Description
// * Write a program to input an integer N and a N*N matrix
// * Mat from user and print the matrix in wave form (column wise)
// * See example for clarifications regarding wave print.

// # NOTE
// * Ensure there is a space character (' ') at the end of the line.

// # Problem Constraints
// * 1 <= N <= 10^3
// * 0 <= Mat[i][j] <= 10^9

// # Input Format
// * First line is an integer N
// * Next N lines contain N space separated integers representing the matrix Mat

// # Output Format
// * A single line containing N*N integers of matrix Mat in wave form (column wise)

// # Example
// $ Input 1
// * 3
// * 4 1 2 
// * 7 4 4 
// * 3 7 4 

// $ Output 1
// * 4 7 3 7 4 1 2 4 4 

// ! Explanantion
// * We will first iterate the 1st column from top to bottom and print the elements, 
// * then we will iterate the 2nd column from botton to top and print the elements,
// * then we will iterate the 3rd column from top to bottom and print the elements.

// $ Input 2
// * 2
// * 1 2
// * 3 4

// $ Output 2
// * 1 3 4 2

// ! Explanation
// * We will first iterate the 1st column from top to bottom and print the elements, 
// * then we will iterate the 2nd column from bottom to top and print the elements.

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

    public static void columnWiseWavePrint(int[][] arr) {
        int R = arr.length;
        int C = arr[0].length;

        for (int c = 0; c < C; c++) {
            if (c % 2 == 0) {
                for (int r = 0; r < R; r++) {
                    System.out.print(arr[r][c] + " ");
                }  
            } else {
                for (int r = R - 1; r >= 0; r--) {
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
        columnWiseWavePrint(arr);
    }
}
