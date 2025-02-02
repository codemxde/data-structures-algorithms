// # Problem Description
// * You are given a character string A having length N.
// * The string consists of 2 types of characters:
// * Alphabets : ['a'-'z', 'A'-'Z']
// * Digits: ['0'-'9']
// * You have to tell the count of characters of the maximum occuring character type.

// # Problem Constraints
// * 1 <= N <= 10^5

// # Input Format
// * First and only argument is a character string A.

// # Output Format
// * Return an integer.

// # Example
// $ Input 1
// * A = "HelloUser1"

// $ Output 1
// * 9

// ! Explanantion
// * Count of alphabets = 9(max)
// * Count of digits = 1

// $ Input 2
// * A = "M1234"

// $ Output 2
// * 4

// ! Explanantion
// * Count of alphabets = 1
// * Count of digits = 4(max)

import java.util.Scanner;

public class Main {

    public static String readStringInput(Scanner sc) {
        System.out.print("enter string: ");
        return sc.next();
    }
    
    public static int solve(final String A) {
        int alphabets = 0;
        int digits = 0;

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                alphabets++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            }
        }
        return alphabets > digits ? alphabets : digits;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading string input
        String str = readStringInput(sc);

        // * returning the highest occuring type of character
        System.out.println("highest occuring type count: " + solve(str));
    }
}
