// # Problem Description
// * Print a pattern consisting of N rows, where each row contains
// * an asterisk (*) at the beginning and end of the line, with N-2 spaces in between.

// # The Pattern should look like:

// * *<N-2 Spaces>*
// * Print the above pattern for a total of N Rows.
// * Refer Example ouput, for better clarification.


// # Problem Constraints
// * 2 <= N <= 100

// # Input Format
// * First and only line of input contains an integer N.

// # Output Format
// * Output the pattern corresponding to the given N.

// # Example
// $ Input 1
// * 2

// $ Output 1
// ! ** 
// ! **

// $ Input 2
// * 4

// $ Output 2
// ! *  *
// ! *  *
// ! *  *
// ! *  *

import java.util.Scanner;

public class Main {

    public static void print_two_line_star_pattern(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        print_two_line_star_pattern(number);
    }
}
