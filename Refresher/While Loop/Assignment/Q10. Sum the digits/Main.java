// # Problem Description
// * You take a number of test cases, denoted by T as input.
// * For each test case, you should take integers N as input.
// * Your task is to calculate and print the sum of the digits
// * of the given number N.

// # Problem Constraints
// * 1 <= T <= 1000
// * 0 <= N <= 100000000

// # Input Format
// * The first line is the number T which denotes the
// * total number of test cases.

// * Next T lines contain an integer N 

// # Output Format
// * T lines each containing one integer representing
// * the sum of the digits of the input integer.

// # Example
// $ Input 1
// * 2
// * 5
// * 1001

// $ Output 1
// * 5
// * 2

// $ Input 2
// * 2 
// * 123
// * 1589

// $ Output 2
// * 6
// * 23

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();

        while (test_cases > 0) {
            int number = sc.nextInt();
            int sumOfDigits = 0;

            while (number > 0) {
                sumOfDigits += (number %10);
                number /= 10;
            }

            System.out.println(sumOfDigits);

            test_cases--;
        }
    }
}
