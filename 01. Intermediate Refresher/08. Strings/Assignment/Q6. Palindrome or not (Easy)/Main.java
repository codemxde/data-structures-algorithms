// # Problem Description
// * Write a program to check whether the given string is a
// * palindrome or not. Return True if it is palindrome else return False.

// # Note:
// * A string is said to be a palindrome if the reverse of
// * the string is the same as the string itself.

// # Input Format
// * First line will have the number of test cases.
// * For each testcase there will be single line of input consisting of a string.

// # Output Format
// * True if palindrome else False

// # Example
// $ Input 1
// * 1
// * level

// $ Output 1
// * True

// ! Explanantion
// * 'level' when reversed returns 'level'
// * only which are same therefore True is returned.

// $ Input 2
// * 1
// * Scaler

// $ Output 2
// * False

// ! Explanantion
// * 'Scaler' when reversed returns 'relacS' which is not
// * equal to original string therefore False is returned.

import java.util.Scanner;

public class Main {

    public static String readStringInput(Scanner sc) {
        System.out.print("enter string: ");
        return sc.next();
    }

    public static boolean isPalin(String s) {
        // complete the function template
        int startIndex = 0;
        int endIndex = s.length() - 1;

        while (startIndex < endIndex) {
            if (s.charAt(startIndex) != s.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading string input
        String str = readStringInput(sc);

        // * check whether string is palindrome
        System.out.println(str + " is " + (isPalin(str) ? "a palindrome" : "not a palindrome"));
    }
}
