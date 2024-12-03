// # Problem Description
// * Take T (number of test cases) as input.
// * For each test case, take integer N as input and
// * Print the count of digits of that number.

// # Problem Constraints
// * 1 <= T <= 1000
// * 0 <= N <= 100000000

// # Input Format
// * The first line is the number T which denotes the
// * total number of test cases.

// * Next T lines contain an integer N for which you have to
// * print the number of digits.

// # Output Format
// * For T different Numbers, Print the number of digits in separate lines.

// # Example
// $ Input 1
// * 2
// * 0
// * 1

// $ Output 1
// * 1
// * 1

// $ Input 2
// * 2 
// * 100
// * 10101

// $ Output 2
// * 3
// * 5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();

        while (test_cases > 0) {
            int number = sc.nextInt();
            int digits = 1;

            while (number > 9) {
                digits++;
                number /= 10;
            }
            System.out.println(digits);
            test_cases--;
        }
    }
}
