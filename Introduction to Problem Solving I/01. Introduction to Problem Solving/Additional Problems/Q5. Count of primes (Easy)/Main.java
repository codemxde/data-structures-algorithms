// # Problem Description
// * You will be given an integer n.
// * You need to return the count of prime numbers less than or equal to n.

// # Problem Constraints
// * 0 <= n <= 10^3

// # Input Format
// * Single input parameter n in function.

// # Output Format
// * Return the count of prime numbers less than or equal to n.

// # Example
// $ Input 1
// * 19

// $ Output 1
// * 8

// ! Explanantion
// * Primes <= 19 are 2, 3, 5, 7, 11, 13, 17, 19

// $ Input 2
// * 1

// $ Output 2
// * 0

// ! Explanantion
// * There are no primes <= 1 

import java.util.Scanner;

public class Main {

    public static int readInput(Scanner sc) {
        System.out.print("Enter Number: ");
        return sc.nextInt();
    }

    public static int countFactors(int N) {
        int factors = 0;

        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                if (i == N/i) {
                    factors++;
                } else {
                    factors += 2;
                }
            }
        }
        return factors;
    }

    public static int solve(int A) {
        int primes = 0;

        for (int i = 1; i <= A; i++) {
            if (countFactors(i) == 2) {
                primes++;
            }
        }
        return primes;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read input
        int A = readInput(sc);

        // * count number of primes
        System.out.println("Total numbers of primes: " + solve(A));
    }
}
