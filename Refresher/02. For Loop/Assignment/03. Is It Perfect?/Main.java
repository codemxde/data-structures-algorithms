// # Problem Description
// * Given the Number of Test Cases as T,
// * For each test case, take an integer N as input, you have to tell
// * whether it is a perfect number or not.

// # Perfect Number?
// * A perfect number is a positive integer that is equal to
// * the sum of its proper positive divisors (excluding the number itself). 
// * A positive proper divisor divides a number without leaving any remainder.

// # Problem Constraints
// * 1 <= T <= 10
// * 1 <= N <= 10^6

// # Input Format
// * The first line of the input contains a single integer T.
// * Each of the next T lines contains a single integer N.

// # Output Format
// * For each testcase, print YES if the given integer is perfect,
// * else print NO, in a separate line

// # Example
// $ Input 1
// * 2
// * 4
// * 6

// $ Output 1
// * NO
// * YES

// $ Input 2
// * 1
// * 3

// $ Output 2
// * 1
// * NO

import java.util.Scanner;

public class Main {
    
    public static void isPerfect(int n) {
        String res =  "NO";
        int sum = 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n/i) {
                    sum += i;
                } else {
                    sum += (i + n/i);
                }
            }
        }

        if (sum == n) {
            res = "YES";
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for (int i = 0; i < tests; i++) {
            int number = sc.nextInt();
            isPerfect(number);
        }
    }
}
