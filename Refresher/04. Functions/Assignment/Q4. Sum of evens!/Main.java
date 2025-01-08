// # Problem Description
// * You are given an integer A, you need to find and return the sum of
// * all the even numbers between 1 and A.
// * Even numbers are those numbers that are divisible by 2.

// # Problem Constraints
// * 1 <= N <= 500

// # Input Format
// * First and only argument is an integer A.

// # Output Format
// * Return an integer denoting the sum of even numbers between [1, A] (both inclusive).

// # Example
// $ Input 1
// * 5

// $ Output 1
// * 6 (Even numbers between [1, 5] are (2, 4).)

// $ Input 2
// * 2

// $ Output 2
// * 2 (Even numbers between [1, 2] are (2))

import java.util.Scanner;

public class Main {
    
    public static int solve(int A) {
        int sum = 0;
        for (int i = 2; i <= A; i++) {
            sum += (i % 2 == 0 ? i : 0);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(solve(number));
    }
}
