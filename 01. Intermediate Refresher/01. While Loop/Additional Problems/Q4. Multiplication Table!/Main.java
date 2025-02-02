// # Problem Description
// * Take a number A as input, print its multiplication table
// * having the first 10 multiples.

// # Problem Constraints
// * 1 <= A <= 1000

// # Input Format
// * First line of the input contains a single integer A.

// # Output Format
// * Print 10 lines, ith line containing ith multiple.

// # Example
// $ Input 1
// * 2

// $ Output 1
// * 2 * 1 = 2
// * 2 * 2 = 4
// * 2 * 3 = 6
// * 2 * 4 = 8
// * 2 * 5 = 10
// * 2 * 6 = 12
// * 2 * 7 = 14
// * 2 * 8 = 16
// * 2 * 9 = 18
// * 2 * 10 = 20

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int multiplier = 1;

        while (multiplier < 11) {
            System.out.println(number + " * " + multiplier + " = " + (number * multiplier));
            multiplier++;
        }
    }
}
