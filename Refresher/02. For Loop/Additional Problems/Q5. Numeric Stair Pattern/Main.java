// # Problem Description
// * Take an integer N as input, print the corresponding pattern for N.
// * For example if N = 4 then pattern will be like:

// ! 1
// ! 1 2
// ! 1 2 3
// ! 1 2 3 4

// # NOTE
// * There should be no extra spaces after last integer.

// # Problem Constraints
// * 1 <= N <= 300

// # Input Format
// * First and only line of input contains an integer N.

// # Output Format
// * Output the pattern corresponding to the given N.

// # NOTE:
// * There should be no extra spaces after last integer and before first integer in any row.
// * All integers in any row in the pattern are space separated.

// # Example
// $ Input 1
// * 2

// $ Output 1
// ! 1 
// ! 1 2

// $ Input 2
// * 3

// $ Output 2
// ! 1 
// ! 1 2
// ! 1 2 3

import java.util.Scanner;

public class Main {
    
    public static void printNumericStair(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j == i ? (j+1) : (j+1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printNumericStair(number);
    }
}
