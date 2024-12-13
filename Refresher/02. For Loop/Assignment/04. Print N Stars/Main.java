// # Problem Description
// * Given an integer N, print N stars in a single line.
// * For example if N = 5 then pattern will be like:
// ! *****

// # Problem Constraints
// * 2 <= N <= 100

// # Input Format
// * Single line input contains a single integer N.

// # Output Format
// * Output N stars in a single line.

// # Example
// $ Input 1
// * 2

// $ Output 1
// ! **

// $ Input 2
// * 3

// $ Output 2
// ! ***

import java.util.Scanner;

public class Main {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printStars(number);
    }
}
