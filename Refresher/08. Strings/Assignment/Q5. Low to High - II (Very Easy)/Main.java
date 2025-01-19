// # Problem Description
// * You are given lowercase string (S) and you have to
// * return a string that is the uppercase form of S.

// # Problem Constraints
// * 1 <= S.size() <= 1000

// # Input Format
// * First and only argument containing a lowercase string S.

// # Output Format
// * You have to return uppercase form of input string.

// # Example
// $ Input 1
// * interviewbit

// $ Output 1
// * INTERVIEWBIT

// ! Explanantion
// * Clearly, uppercase of interviewbit is INTERVIEWBIT.

// $ Input 2
// * scaler

// $ Output 2
// * SCALER

// ! Explanantion
// * Clearly, uppercase of scaler is SCALER.

import java.util.Scanner;

public class Main {

    public static String readStringInput(Scanner sc) {
        System.out.print("enter string: ");
        return sc.next();
    }

    public static String solve(String A) {
        return A.toUpperCase();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading string input
        String str = readStringInput(sc);

        // * returning uppercase of input string
        System.out.println("uppercased: " + solve(str));
    }
}
