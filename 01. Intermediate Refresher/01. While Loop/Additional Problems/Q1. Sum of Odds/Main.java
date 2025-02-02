// # Problem Description
// * Take an integer A as input. You have to print the sum of
// * all odd numbers in the range [1, A].

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
// * 1

// $ Input 2
// * 4

// $ Output 2
// * 4

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 1;
        int sum = 0;

        while (count <= number) {
            sum += count;
            count +=2 ;
        }
        System.out.println(sum);
    }
}