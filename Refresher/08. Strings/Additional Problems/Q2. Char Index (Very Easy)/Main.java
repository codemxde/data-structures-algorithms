// # Problem Description
// * Shivam has a string A of size N containing only lowercase characters.
// * He will update the string by inserting a number after
// * every char which will be the index of that char.
// * For E.g.: if string is azd then it will be updated as
// * a1z26d4 since index of a is 1, of z is 26 and of d is 4.
// * You have to tell how the string will look like afterwards,

// # Problem Constraints
// * 1 <= A.size() <= 1000
// * a <= A[i] <= z

// # Input Format
// * First argument is string A.

// # Output Format
// * You have to return an string as per the question.

// # Example
// $ Input 1
// * scaler

// $ Output 1
// * s19c3a1l12e5r18

// ! Explanantion
// * Clearly after putting all the chars index in "scaler"
// * it will become "s19c3a1l12e5r18".

import java.util.Scanner;

public class Main {

    public static String readStringInput(Scanner sc) {
        System.out.print("enter string: ");
        return sc.next();
    }

    public static String solve(String A) {
        String result = "";
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            int diff = ch - 'a' + 1;
             result += String.valueOf(ch) + diff;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading string input
        String str = readStringInput(sc);

        // * adding alphabet index after each character
        System.out.println("post index adition: " + solve(str));
    }
}
