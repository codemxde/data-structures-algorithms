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
// * 8 (Primes <= 19 are 2, 3, 5, 7, 11, 13, 17, 19)

// $ Input 2
// * 1

// $ Output 2
// * 0 (There are no primes <= 1)

import java.util.Scanner;

public class Main {

    public static boolean isPrime(int N) {
        int count = 0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                if (i == N/i) {
                    count ++;
                } else {
                    count+= 2;
                }
            }
        }
        return count == 2;
    }
    
    public static int solve(int A) {
        int primes = 0;
        for (int i = 2; i <= A; i++) {
            if (isPrime(i)) {
                primes++;
            }
        }
        return primes;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(solve(number));
    }
}
