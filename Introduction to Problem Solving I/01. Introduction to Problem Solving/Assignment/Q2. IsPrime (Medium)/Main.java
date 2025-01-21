// # Problem Description
// * Given a number A. Return 1 if A is prime and return 0 if not. 

// # Note : 
// * The value of A can cross the range of Integer.

// # Problem Constraints
// * 1 <= A <= 10^9

// # Input Format
// * First and only argument is an integer A.

// # Output Format
// * Return 1 if A is prime else return 0.

// # Example
// $ Input 1
// * 5

// $ Output 1
// * 1

// ! Explanantion
// * 5 is a prime number.

// $ Input 2
// * 10

// $ Output 2
// * 0

// ! Explanantion
// * 10 is not a prime number.

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
        return factors == 2 ? 1 : 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading integer
        int A = readInteger(sc);

        // * count factors of A
        System.out.println(solve(A) == 1 ? "Prime" : "Not Prime");
    }
}
