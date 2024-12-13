// # Problem Description
// * Given an integer N, print the corresponding Inverted Half Pyramid pattern for N.

// # For Example
// * If N = 4 then pattern will be like:
// ! ****
// ! ***
// ! **
// ! *


// # Problem Constraints
// * 1 <= N <= 100

// # Input Format
// * First and only line of input contains an integer N.

// # Output Format
// * Output the pattern corresponding to the given N.

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

import java.util.Scanner;

public class Main {

    public static void print_inverted_pyramid(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        print_inverted_pyramid(number);
    }
}
