// # Problem Description
// * You are given two integers A and B. You have to find the
// * value of A^B.
// * NOTE: The value of A^B will always be less than or equal to 10^9.

// # Problem Constraints
// * 1 <= A, B <= 1000

// # Input Format
// * First line of the input contains a single integer A.
// * Second line of the input contains a single integer B.

// # Output Format
// * Print a single integer in single line.

// # Example
// $ Input 1
// * 2
// * 3

// $ Output 1
// * 8

// $ Input 2
// * 1
// * 10

// $ Output 2
// * 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int answer = 1;

        while (B > 0) {
            answer *= A;
            B--;
        }
        System.out.println(answer);
    }
}
