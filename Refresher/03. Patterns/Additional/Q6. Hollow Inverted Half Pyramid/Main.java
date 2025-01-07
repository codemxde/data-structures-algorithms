// # Problem Description
// * Given an integer N as input, print the corresponding
// * Hollow Inverted Half Pyramid pattern for N

// # For example
// * if N = 6 then pattern will be like:

// ! ******
// ! *   *
// ! *  *
// ! * *
// ! **
// ! *

// # Problem Constraints
// * 1 <= N <= 100

// # Input Format
// * First and only line of input contains a single integer N.

// # Output Format
// * Output the Inverted Full Pyramid pattern corresponding to the given N.

// # Example
// $ Input 1
// * 2

// $ Output 1
// ! **
// ! *

// $ Input 2
// * 3

// $ Output 2
// ! ***
// ! **
// ! *

// $ Input 3
// * 4

// $ Output 3
// ! ****
// ! * *
// ! **
// ! *

import java.util.Scanner;

public class Main {

    public static void print_hollow_inverted_half_pyramid(int N) {
        // * Print N stars
        for (int i = 0; i < N; i++) {
            System.out.print("*");
        }
        System.out.println();
        // * Print Middle Section of stars
        for (int i = 0; i < N - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < N - 3 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        // * Print one star
        System.out.print("*");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        print_hollow_inverted_half_pyramid(number);
    }
}
