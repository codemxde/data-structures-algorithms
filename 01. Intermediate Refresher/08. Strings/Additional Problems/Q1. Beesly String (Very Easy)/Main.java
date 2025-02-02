// # Problem Description
// * Mr. Jim likes playing with strings a lot, soMrs. Pam gifted him
// * a string A which has some very unique magical powers.
// * The string consists of lowercase latin letters 'p','a' and 'm' only.

// * In one wish, Mr Jim can perform one of the following operations:
// * Remove exactly one occurrence of 'p' and exactly
// * one occurrence of 'm', from anywhere inside string A.
// * Remove exactly one occurrence of 'a' and exactly
// * one occurrence of 'm', from anywhere inside string A.

// * Now Mr. Jim wants to know if after some number of
// * wishes is it possible to make string A empty.

// * Return 1 if it is possible to make string A empty
// * after some number of operations otherwise Return 0.

// # Problem Constraints
// * 1 ≤ |A| ≤ 10^5

// # Input Format
// * The first argument is a string, A.

// # Output Format
// * Return 1, if it is possible to make string A empty.
// * Otherwise return 0.

// # Example
// $ Input 1
// * A = "mpampamm" 

// $ Output 1
// * 1

// ! Explanantion
// * We can reduce the string to null in the following sequence of steps:
// * 1) mpampamm : initial state
// * 2) mampam   : removing 2nd and 8th character
// * 3) mpam     : removing 1st and 2nd character
// * 4) am       : removing 1st and 2nd character
// * 5)          : removing 1st and 2nd character
// * So the answer is 1.

// $ Input 2
// * A = "pampampam" 

// $ Output 2
// * 0

// ! Explanantion
// * It is not possible to empty the string using any sequence of steps.

import java.util.Scanner;

public class Main {

    public static String readStringInput(Scanner sc) {
        System.out.print("enter string: ");
        return sc.next();
    }

    public static int solve(String A) {
        int aCount = 0;
        int mCount = 0;
        int pCount = 0;

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            if (ch == 'm') {
                mCount++;
            } else if (ch == 'a') {
                aCount++;
            } else if (ch == 'p') {
                pCount++;
            }
        }

        return aCount + pCount == mCount ? 1 : 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading string input
        String str = readStringInput(sc);

        // * check beesly's string
        System.out.println(solve(str) == 1 ? "possible to make empty" : "not possible");
    }
}
