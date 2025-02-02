// # Problem Description
// * You have given a string A having Uppercase English letters.
// * You have to find how many times subsequence "AG" is there in the given string.

// # Note:
// * Return the answer modulo 10^9 + 7 as the answer can be very large.

// # Problem Constraints
// * 1 <= length(A) <= 10^5

// # Input Format
// * First and only argument is a string A.

// # Output Format
// * Return an integer denoting the answer.

// # Example
// $ Input 1
// * A = "ABCGAG"

// $ Output 1
// * 3

// ! Explanantion
// * Subsequence "AG" is 3 times in given string

// $ Input 2
// * A = "GAB"

// $ Output 2
// * 0

// ! Explanantion
// * There is no subsequence "AG" in the given string.

import java.util.Scanner;

public class Main {

    public static int solve(String A) {
        // # Approach
        // * rather than carry forwarding the counts of 'a',
        // * I am this time iterating from the last and carry forwarding
        // * the count of 'g' and after encountering 'a' keep on adding
        long countG = 0;
        long pairs = 0;
        
        for (int i = A.length() - 1; i >= 0; i--) {
            char ch = A.charAt(i);
            if (ch == 'G') {
                countG++;
            } else if (ch == 'A') {
                pairs += countG;
            }
        }
        return (int) (pairs % 1000000007);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String str = sc.next();

        // * find no of a-g pairs
        System.out.println("no of a-g pairs: " + solve(str.toUpperCase()));
    }
}
