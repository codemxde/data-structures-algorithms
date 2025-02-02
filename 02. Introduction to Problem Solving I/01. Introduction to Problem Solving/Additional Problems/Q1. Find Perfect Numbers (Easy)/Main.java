// # Problem Description
// * You are given an integer A.
// * You have to tell whether it is a perfect number or not.

// # Perfect Number
// * Perfect number is a positive integer which is equal to
// * the sum of its proper positive divisors.

// # Proper Divisor
// * A proper divisor of a natural number is the
// * divisor that is strictly less than the number.

// # Problem Constraints
// * 1 <= A <= 10^6

// # Input Format
// * First and only argument contains a single positive integer A.

// # Output Format
// * Return 1 if A is a perfect number and 0 otherwise.

// # Example
// $ Input 1
// * A = 4

// $ Output 1
// * 0

// ! Explanantion
// * For A = 4, the sum of its proper divisors = 1 + 2 = 3, is not equal to 4.

// $ Input 2
// * A = 6

// $ Output 2
// * 1

// ! Explanantion
// * For A = 6, the sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6. 

import java.util.Scanner;

public class Main {

    public static int readInput(Scanner sc) {
        System.out.print("Enter Number: ");
        return sc.nextInt();
    }

    public static int solve(int A) {
        int sum = 0;
        int num = 1;

        while (num < A && sum <= A) {
            if (A % num == 0) {
                sum += num;
            }
            num++;
        }

        return sum == A ? 1 : 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read input
        int A = readInput(sc);

        // * check if input is a perfect number
        System.out.println("It's " + (solve(A) == 1 ? "" : "not ") + "perfect");
    }
}
