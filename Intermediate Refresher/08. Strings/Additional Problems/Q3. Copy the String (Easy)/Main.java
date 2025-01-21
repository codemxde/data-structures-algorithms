// # Problem Description
// * You will be given a constant string (A).
// * You have to return another copy of that input string
// * after removing last character from it.

// # Problem Constraints
// * 1 <= A.size() <= 1000

// # Input Format
// * First argument containing a lowercase constant string A.

// # Output Format
// * You have to return a string as per the question.

// # Example
// $ Input 1
// * scaler

// $ Output 1
// * scale

// ! Explanantion
// * Clearly after putting all the chars index in "scaler"
// * it will become "s19c3a1l12e5r18".

import java.util.Scanner;

public class Main {

    public static String readStringInput(Scanner sc) {
        System.out.print("enter string: ");
        return sc.next();
    }

    public static String solve(final String A) {
        return A.substring(0, A.length() - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading string input
        String str = readStringInput(sc);

        // * remove last character
        System.out.println("post last charcter removal: " + solve(str));
    }
}
