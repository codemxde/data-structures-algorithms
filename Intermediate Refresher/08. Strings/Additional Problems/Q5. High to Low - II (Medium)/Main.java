// # Problem Description
// * You are given uppercase string (S) and you have to
// * return a string that is the lower case form of S.

// * Uppercase strings are those which have
// * all letters in uppercase (Example: MACHINE)

// * Lowercase strings are those which have
// * all letters in lowercase (Example: machine)

// # Problem Constraints
// * 1 <= S.size() <= 1000

// # Input Format
// * First and only argument containing a uppercase string S.

// # Output Format
// * You have to return lowercase form of input string.

// # Example
// $ Input 1
// * INTERVIEWBIT

// $ Output 1
// * interviewbit

// $ Input 2
// * SCALER

// $ Output 2
// * scaler

import java.util.Scanner;

public class Main {

    public static String readStringInput(Scanner sc) {
        System.out.print("enter string: ");
        return sc.next();
    }

    public static String solve(String A) {
        return A.toLowerCase();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // * reading string input
        String str = readStringInput(sc);

        // * converting to lowercase
        System.out.println("post lowercase conversion: " + solve(str));
    }
}
