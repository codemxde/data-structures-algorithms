// # Problem Description
// * Take an integer N as input, print the corresponding stair pattern for N.
// * For example if N = 4 then stair pattern will be like:

// ! *
// ! **
// ! ***
// ! ****

// # Problem Constraints
// * 1 <= N <= 100

// # Input Format
// * First and only line of input contains a single integer N.

// # Output Format
// * Output the stair pattern corresponding to the given N.

// # Example
// $ Input 1
// * 2

// $ Output 1
// ! *
// ! **

// $ Input 2
// * 3

// $ Output 2
// ! *
// ! **
// ! ***

import java.util.Scanner;

public class Main {

    public static void printStair(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        printStair(rows);
    }
}
