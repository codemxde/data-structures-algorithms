// # Problem Description
// * Write a program to input two integers A & B from user and print their HCF.

// # Definition of HCF
// * The HCF(Highest Common Factor) or the GCD(greatest common divisor)
// * of two positive integers happens to be the largest positive integer
// * that divides the numbers without leaving a remainder.

// # Problem Constraints
// * 1 <= A,B <= 100000

// # Input Format
// * First line will contain 2 integers A and B

// # Output Format
// * An integer which is the HCF of A & B.

// # Example
// $ Input 1
// * 15
// * 105

// $ Output 1
// * 15

// $ Input 2
// * 24
// * 36

// $ Output 2
// * 12

import java.util.Scanner;

public class Main {

    public static void calculate_hcf(int A, int B) {
        int min = A < B ? A : B;
        int hcf = 1;

        for (int i = 1; i <= min; i++) {
            if (A % i == 0 && B % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        calculate_hcf(A, B);
    }
}
