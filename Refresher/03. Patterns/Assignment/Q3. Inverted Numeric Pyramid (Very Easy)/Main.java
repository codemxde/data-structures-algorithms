// # Problem Description
// * Take an integer N as input, print the corresponding
// * Numeric Inverted Half Pyramid pattern for N.

// # For example
// * if N = 4 then pattern will be like:

// ! 1 2 3 4
// ! 1 2 3
// ! 1 2
// ! 1

// # Problem Constraints
// * 1 <= N <= 100

// # Input Format
// * First and only line of input contains a single integer N.

// # Output Format
// * Output the Numeric Inverted Half Pyramid pattern corresponding to the given N.

// # Example
// $ Input 1
// * 2

// $ Output 1
// ! 1 2
// ! 1

// $ Input 2
// * 3

// $ Output 2
// ! 1 2 3  
// ! 1 2
// ! 1

import java.util.Scanner;

public class Main {

    public static void print_inverted_numeric_pattern(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(j == N - i - 1 ? j + 1 : j + 1 + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        print_inverted_numeric_pattern(number);
    }
}

// # STATISTICS
// * Status: Correct Answer
// * Runtime: 478ms(Current Best)