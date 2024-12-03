// # Problem Description
// * Write a program that asks the user to input a number T,
// * indicating the number of test cases. Then, for each test case,
// * ask for input a number N and print the first and last digits of N.

// # Problem Constraints
// * 1 <= T <= 1000
// * 0 <= N <= 100000000

// # Input Format
// * First line is T which means number of test cases.
// * Each next T lines contain an integer N.

// # Output Format
// * T lines each containing two space separated integers
// * representing first and last digits of the input integer.

// # Example
// $ Input 1
// * 2
// * 5
// * 1001

// $ Output 1
// * 5 5
// * 1 1

// $ Input 2
// * 2 
// * 10023
// * 1589

// $ Output 2
// * 1 3
// * 1 9

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();

        while (test_cases > 0) {
            int number = sc.nextInt();
            int lastDigit = number % 10;
             while (number > 9) {
                number /= 10;
             }
             int firstNumber = number;
             System.out.println(firstNumber + " " + lastDigit);
            test_cases--;
        }
    }
}
