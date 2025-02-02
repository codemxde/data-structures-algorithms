// # Problem Description
// * You are given a positive integer A. You have to print
// * the sum of all even numbers in the range [1, A].

// # Problem Constraints
// * 1 <= A <= 1000

// # Input Format
// * First and only line contains a single positive integer A.

// # Output Format
// * Print the required sum in a single line.

// # Example
// $ Input 1
// * 1

// $ Output 1
// * 0

// $ Input 2
// * 4

// $ Output 2
// * 6

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int count = 2;
        int sum = 0;

        while (count <= number) {
            sum += count;
            count += 2;
        }

        System.out.println(sum);
        
    }
}
