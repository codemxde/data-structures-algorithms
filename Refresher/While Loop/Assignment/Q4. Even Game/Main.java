// # Problem Description
// * Write a program to print all even numbers from 1 to N
// * where you have to take N as input from the user.

// # Note: Use while-loop OR for-loop, according to session flow.

// # Note: You can use int(input()) for obtaining user input of number N.

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

        int count = 2;
        while (count <= number) {
            System.out.print(count + " ");
            count += 2;
        }
    }
}
