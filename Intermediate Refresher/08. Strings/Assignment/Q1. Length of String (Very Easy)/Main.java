// # Problem Description
// * Write a program to input an integer T and then each of
// * T lines will have a string (S).
// * You have to print T lines each containing length of input string.

// # Problem Constraints
// * 1 <= T <= 100
// * 1 <= S.size() <= 1000

// # Input Format
// * First line is T which means number of test cases.
// * Each next T lines contain a string S.

// # Output Format
// * T lines each containing an integer representing length of the input string.

// # Example
// $ Input 1
// * 2
// * scaler
// * interviewbit

// $ Output 1
// * 6
// * 12

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // * I can't use sysout's here as the problem has a main function
        Scanner sc = new Scanner(System.in);

        // * taking no of testcases input
        int T = sc.nextInt();

        // * iterating and reading strings as input
        for (int i = 0; i < T; i++) {
            String str =  sc.next();
            System.out.println(str.length());
        }
    }
}
