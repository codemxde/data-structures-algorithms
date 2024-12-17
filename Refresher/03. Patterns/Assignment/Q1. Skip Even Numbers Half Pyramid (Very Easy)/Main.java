// # Problem Description
// * Take an integer N as input, print the corresponding pattern for N.

// # For example
// * if N = 5 then pattern will be like:
// ! 1
// ! 1_
// ! 1_3
// ! 1_3_
// ! 1_3_5

// # Note
// * Here '_' represents space for explanation purpose only.
// * You have to print space in your code.

// # Problem Constraints
// * 1 <= N <= 100

// # Input Format
// * First and only line of input contains a single integer N.

// # Output Format
// * Output the pattern corresponding to the given N.

// # Example
// $ Input 1
// * 2

// $ Output 1
// ! 1
// ! 1

// $ Input 2
// * 3

// $ Output 2
// ! 1
// ! 1 
// ! 1  3

import java.util.Scanner;

public class Main {

    public static void print_half_pyramid(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        print_half_pyramid(number);
    }
}

// ! STATISTICS
// * Status: Correct Answer
// * Runtime: 483ms
