// # Problem Description
// * Implement a program that takes two positive integers
// * A and B in the input and prints their LCM.

// # Definition of LCM
// * The Least Common Multiple or LCM of two numbers say A and B,
// * is denoted as LCM (A,B). And the LCM is the smallest or
// * least positive integer that is divisible by both A and B.

// # Problem Constraints
// * 1 <= A,B <= 200

// # Input Format
// * Two space separated integers A and B in the input.

// # Output Format
// * Output a single integer that is the LCM of A and B.

// # Example
// $ Input 1
// * 5
// * 10

// $ Output 1
// * 10

// $ Input 2
// * 2
// * 3

// $ Output 2
// * 6

import java.util.Scanner;

public class Main {

    public static void calculate_lcm(int A, int B) {
        int largest = A > B ? A : B;
        int lcm = largest;

        for (int i = largest; i <= A * B; i++) {
            if (i % A == 0 && i % B == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        calculate_lcm(A, B);
    }
}
