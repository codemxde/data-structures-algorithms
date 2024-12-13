// # Problem Description
// * Given two integers N and M as inputs, print a rectangle of N * M stars.
// * For example if N = 3, M = 4 then pattern will be like:

// ! ****
// ! ****
// ! ****

// # Problem Constraints
// * 2 <= N, M <= 100

// # Input Format
// * First line of input contains an integers N (no of rows).
// * Second line of input contains an integer M (no of cols).

// # Output Format
// * Output N * M rectangle of stars.

// # Example
// $ Input 1
// * 2
// * 3

// $ Output 1
// ! ***
// ! ***

// $ Input 2
// * 3
// * 1

// $ Output 2
// ! *
// ! *
// ! *

import java.util.Scanner;

public class Main {

    public static void printStars(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        printStars(rows, cols);
    }
}
