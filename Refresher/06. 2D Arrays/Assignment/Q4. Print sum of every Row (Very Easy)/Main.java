// # Problem Description
// * Write a program to input an N X M matrix A
// * from user and print sum of every row.

// # Problem Constraints
// * 1 <= N <= 100
// * 1 <= M <= 100
// * 1 <= A[i][j] <= 10000

// # Input Format
// * Two values denoting N and M,
// * Next N lines contain M space separated integers representing the matrix A.

// # Output Format
// * Print sum of each row space separated.

// # Example
// $ Input 1
// * 3 4
// * 1 2 3 4
// * 5 6 7 8
// * 9 2 4 1

// $ Output 1
// * 10 26 16

// ! Explanantion
// * 0th row sum -> 1+2+3+4 = 10
// * 1st row sum -> 5+6+7+8 = 26
// * 2nd row sum-> 9+2+4+1 = 16 

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

    public static void printEachRowSum(int[][] arr) {
        int R = arr.length;
        int C = arr[0].length;

        for (int r = 0; r < R; r++) {
            int sum = 0;
            for (int c = 0; c < C; c++) {
                sum += arr[r][c];
            }
            System.out.print(sum + " ");
        }
    }
    
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];

        readArrayInput(arr, sc);
        printEachRowSum(arr);
    }
}
