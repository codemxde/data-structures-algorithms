// # Problem Description
// * Take an integer N as input, print the corresponding
// * Full Numeric Pyramid pattern for N.

// # For example
// * if N = 5 then pattern will be like:

// ! 0 0 0 0 5 0 0 0 0 
// ! 0 0 0 4 8 12 0 0 0
// ! 0 0 3 6 9 12 15 0 0
// ! 0 2 4 6 8 10 12 14 0 
// ! 1 2 3 4 5 6 7 8 9 

// # Problem Constraints
// * 3 <= N <= 100

// # Input Format
// * First and only line of input contains a single integer N.

// # Output Format
// * Output the pattern corresponding to the given N.

// # Example
// $ Input 1
// * 2

// $ Output 1
// ! ***
// ! * *
// ! ***

// $ Input 2
// * 4

// $ Output 2
// ! ****
// ! *  *
// ! *  *
// ! ****

import java.util.Scanner;

public class Main {

    public static void print_different_number_triangle(int N) {
        for (int i = 0; i < N; i++) {
            // * first patern for 0s, second pattern for num multiples, third again for 0s
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print("0 ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print((N-i) * (j + 1) + " ");
            }
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte number = sc.nextByte();
        print_different_number_triangle(number);
    }
}

// # STATISTICS
// * Status: Correct Answer
// * Runtime: 476ms (Current Best)