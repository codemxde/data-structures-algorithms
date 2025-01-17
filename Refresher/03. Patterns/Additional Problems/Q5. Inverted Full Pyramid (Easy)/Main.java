// # Problem Description
// * Take an integer N as input, and print the corresponding
// * Inverted Full Pyramid pattern for N.

// # For example
// * if N = 5 then pattern will be like:

// ! * * * * *
// !  * * * *
// !   * * *
// !    * *
// !     *

// # Problem Constraints
// * 2 <= N <= 100

// # Input Format
// * First and only line of input contains a single integer N.

// # Output Format
// * Output the Inverted Full Pyramid pattern corresponding to the given N.

// # Example
// $ Input 1
// * 2

// $ Output 1
// ! * *
// !  *

// $ Input 2
// * 3

// $ Output 2
// ! * * *
// !  * * 
// !   *

import java.util.Scanner;

public class Main {

    public static void print_inverted_full_pyramid(int N) {
        for (int i = 0; i < N; i++) {

            // * Prininting Spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // * Printing Stars
            for (int j = 0; j < N - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        print_inverted_full_pyramid(number);
    }
}
