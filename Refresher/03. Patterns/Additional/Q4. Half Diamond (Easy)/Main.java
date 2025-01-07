// # Problem Description
// * Take an integer N as input, print the corresponding
// * Half Diamond pattern with 2*N - 1 rows.

// # For example
// * if N = 5 then pattern will be like:

// ! *
// ! **
// ! ***
// ! ****
// ! *****
// ! ****
// ! ***
// ! **
// ! *

// # Problem Constraints
// * 2 <= N <= 100

// # Input Format
// * First and only line of input contains a single integer N.

// # Output Format
// * Output the Half Diamond pattern corresponding to the given N.

// # Example
// $ Input 1
// * 2

// $ Output 1
// ! *
// ! **
// ! *

// $ Input 2
// * 3

// $ Output 2
// ! *
// ! **
// ! ***
// ! **
// ! *

import java.util.Scanner;

public class Main {

    public static void print_half_diamond(int N) {
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < N; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte number = sc.nextByte();
        print_half_diamond(number);
    }
}

// # STATISTICS
// * Status: Correct Answer
// * Runtime: 959ms (Current Best)
