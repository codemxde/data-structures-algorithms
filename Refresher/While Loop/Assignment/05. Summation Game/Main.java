// # Problem Description
// * Write a program to find sum all Natural numbers from
// * 1 to N where you have to take N as input from user

// # Problem Constraints
// * 1 <= N <= 1000

// # Inout Format
// * A single line representing N

// # Output Format
// * A single integer showing sum of all Natural numbers from 1 to N

// # Example
// * I/O: 5, O/P: 15

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        int sum = 0;
        int count = 1;

        while (count <= number) {
            sum += count;
            count++;
        }
        System.out.println(sum);
    }
}
