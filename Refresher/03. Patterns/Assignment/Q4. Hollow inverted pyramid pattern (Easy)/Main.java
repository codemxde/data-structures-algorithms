// # Problem Description
// * Take an integer N as input, print the corresponding pattern for N

// # For example
// * if N = 5 then pattern will be like:

// ! *        *
// ! **      **
// ! ***    ***
// ! ****  ****
// ! **********

// # Problem Constraints
// * 2 <= N <= 100

// # Input Format
// * First and only line of input contains a single integer N.

// # Output Format
// * Output the Numeric Inverted Half Pyramid pattern corresponding to the given N.

// # Example
// $ Input 1
// * 2

// $ Output 1
// ! * *
// ! ***

// $ Input 2
// * 3

// $ Output 2
// ! *    *
// ! **  **
// ! ******

import java.util.Scanner;

public class Main {
    
    public static void print_hollow_inverted_pyramid(byte N) {
        for (int i = 0; i < N; i++) {
            for (byte j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * (N - i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte number = sc.nextByte();
        print_hollow_inverted_pyramid(number);
    }
}

// # STATISTICS
// * Status: Correct Answer
// * Runtime: 470ms (Current Best)
