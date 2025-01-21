// # Problem Description
// * You are given an integer N you need to print
// * all the Prime Numbers between 1 and N.

// # Prime Number
// * Numbers that have only 2 factors: 1 and themselves.
// * For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.

// # Problem Constraints
// * 1 <= N <= 300

// # Input Format
// * First and only line of input contains an integer N.

// # Output Format
// * Print all the prime numbers between between 1 and N each in a new line.

// # Example
// $ Input 1
// * 5

// $ Output 1
// * 2
// * 3
// * 5

// $ Input 2
// * 10

// $ Output 2
// * 2
// * 3
// * 5
// * 7

import java.util.Scanner;

public class Main {
    
    public static int countFactors(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i == num/i) {
                    count++;
                } else {
                    count += 2;
                }
            }
            if (count > 2) {
                break;
            }
        }
        return count;
    }

    public static void printPrimes(int n) {
        for (int i = 1; i <= n; i++) {
            if (countFactors(i) == 2) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printPrimes(number);
    }
}
