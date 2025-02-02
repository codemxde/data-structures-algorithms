// # Problem Description
// * You are given a function that takes an integer argument A.
// * Return 1 if A is a perfect square otherwise return 0.

// # Perfect Square
// * A perfect square is an integer that is the square of an integer.
// * For example 16 is perfect square as it is the square of an integer 4 (4^2 = 16)

// # Problem Constraints
// * 1 <= A <= 10^8

// # Input Format
// * First argument is an integer A.

// # Output Format
// * Return an integer (0 or 1) based upon the question.

// # Example
// $ Input 1
// * 4

// $ Output 1
// * 1

// $ Input 2
// * 1001

// $ Output 2
// * 0

import java.util.Scanner;

public class Main {

    public static int solve(int A) {
        for (int i = 2; i * i <= A; i++) {
            if (i * i == A) {
                return 1;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(solve(number));
    }
}
