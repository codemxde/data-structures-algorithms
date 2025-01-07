// # Problem Description
// * Take an integer N as input, print the corresponding pattern for N.

// # For example
// * if N = 5 then pattern will be like:

// ! *****
// ! *   *
// ! *   *
// ! *   *
// ! *****

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

    public static void print_photo_frame_pattern(int N) {
        for (int i = 0; i < N; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < N - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < N - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < N; i++) {
            System.out.print("*");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        print_photo_frame_pattern(number);
    }
}

// # STATISTICS

// * Status: Correct Answer
// * Runtime: 469ms (Current Best)