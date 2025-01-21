// # Problem Description
// * Given an integer A, you need to find the count of it's factors.
// * Factor of a number is the number which
// * divides it perfectly leaving no remainder.
// * Example : 1, 2, 3, 6 are factors of 6

// # Problem Constraints
// * 1 <= A <= 10^9

// # Input Format
// * First and only argument is an integer A.

// # Output Format
// * Return the count of factors of A.

// # Example
// $ Input 1
// * 5

// $ Output 1
// * 2

// ! Explanantion
// * Factors of 5 are 1 and 5.

// $ Input 2
// * 10

// $ Output 2
// * 4

// ! Explanantion
// * Factors of 10 are 1, 2, 5 and 10.

import java.util.Scanner;

public class Main {

    public static int readInteger(Scanner sc) {
        System.out.print("Enter A: ");
        return sc.nextInt();
    }

    public static int solve(int A) {
        int factors = 0;
        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                if (i == A/i) {
                    factors++;
                } else {
                    factors += 2;
                }
            }
        }
        return factors;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading integer
        int A = readInteger(sc);

        // * count factors of A
        System.out.println("Total Factors: " + solve(A));
    }
}
