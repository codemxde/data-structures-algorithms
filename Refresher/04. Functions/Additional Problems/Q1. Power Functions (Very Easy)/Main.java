// # Problem Description
// * You are given two integers A and B.
// * You have to find the value of A^B.

// # NOTE
// * The value of answer is always less than or equal to 10^9

// # Problem Constraints
// * 1 <= A, B <= 1000

// # Input Format
// * First parameter is an integer A.
// * Second parameter is an integer B.

// # Output Format
// * Return an integer

// # Example
// $ Input 1
// * A = 2
// * B = 3

// $ Output 1
// * 8 (For A = 2 and B = 3, the value of 2^3 = 2 * 2 * 2 = 8.)

// $ Input 2
// * A = 1
// * B = 10

// $ Output 2
// * 1 (For A = 1 and B = 10, the value of 1^10 = 1.)

import java.util.Scanner;

public class Main {
    
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int power(final int A, final int B) {
        return (int) Math.pow(A, B);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(power(A, B));  
    }
}
