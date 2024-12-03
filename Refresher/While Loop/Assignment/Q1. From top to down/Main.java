// # Problem Description
// * Write a program that takes a positive integer N as input
// * from the user and prints all natural numbers from 1 to N,
// * with each number followed by a space (including the last number).

// # Problem Constraints
// * 1 <= N <= 1000000

// # Inout Format
// * A single line representing N

// # Output Format
// * N space separated integers from 1 to N, with each number
// * followed by a space, including the last number.

// # Example
// * I/O: 5, O/P: 1 2 3 4 5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int count = 0;

        while (count < number) {
            count++;
            System.out.print(count + " ");
        }
    }
}