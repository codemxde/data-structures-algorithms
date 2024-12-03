// # Problem Description
// * Write a program to print all odd numbers from 1 to N 
// * where you have to take N as input from user. Here N is inclusive.

// # NOTE
// * Each number should be followed by a space, including the last number.

// # Problem Constraints
// * 1 <= N <= 2000000

// # Inout Format
// * A single line representing N

// # Output Format
// * All odd numbers from 1 to N, each number followed by a space,
// * including the last number.

// # Example
// * I/O: 5, O/P: 1 3 5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int count = 1;

        while (count <= number) {
            System.out.print(count + " ");
            count += 2;
        }
    }
}
