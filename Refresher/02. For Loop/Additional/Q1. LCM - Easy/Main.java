// # Problem Description
// * Implement a program that takes two positive integers A and B
// * in the input and prints their LCM.

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
// * 5 10

// $ Output 1
// * 10

// $ Input 2
// * 2 3

// $ Output 2
// * 6

import java.util.Scanner;

public class Main {

    public static void printLCM(int num1, int num2) {
        int max = num1 > num2 ? num1 : num2;
        for (int i = max; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println(i);
                break;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        printLCM(num1, num2);
    }
}
