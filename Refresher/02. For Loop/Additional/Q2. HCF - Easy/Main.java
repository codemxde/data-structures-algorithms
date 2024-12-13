// # Problem Description
// * Write a program to input two integers A & B
// * from user and print their HCF.

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
// * 15 105

// $ Output 1
// * 15

// $ Input 2
// * 24 36

// $ Output 2
// * 12

import java.util.Scanner;

public class Main {

    public static void calculateHCF(int num1, int num2) {
        int min = num1 < num2 ? num1 : num2;
        int hcf = 1;
        for (int i = min; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
                break;
            }
        }
        System.out.println(hcf);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        calculateHCF(number1, number2);
    }
}
