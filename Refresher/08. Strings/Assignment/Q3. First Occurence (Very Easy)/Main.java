// # Problem Description
// * You are given a character string A, having
// * length N and an integer ASCII code B.
// * You have to tell the leftmost occurrence of the character
// * having ASCII code equal to B, in A or report that it does not exist.

// # Problem Constraints
// * 1 <= N <= 105
// * A[i] ∈ ['a'-'z']
// * 97 <= B <= 122

// # Input Format
// * First argument is a character string A.
// * Second argument is an integer B.

// # Output Format
// * If there exists an occurrence, return the leftmost
// * index(0 - based), else return -1.

// # Example
// $ Input 1
// * A = "aabbcc"
// * B = 98 

// $ Output 1
// * 2

// ! Explanantion
// * Character having ASCII code equal to 98 = 'b' 
// * Leftmost index of character 'b' in "aabbcc" is 2.

// $ Input 2
// * A = "abc"
// * B = 100

// $ Output 2
// * -1

// ! Explanantion
// * Character having ASCII code equal to 100 = 'd'
// * Character 'd' is not present in "abc".

import java.util.Scanner;

public class Main {

    public static String readStringInput(Scanner sc) {
        System.out.print("enter string: ");
        return sc.next();
    }

    public static int solve(final String A, final int B) {
        for (int i = 0; i < A.length(); i++) {
            int ch = A.charAt(i);
            if (ch == B) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading string input
        String str = readStringInput(sc);

        // * reading integer input
        System.out.print("enter integer to check leftmost occurence of: ");
        int B = sc.nextInt();

        // * checking first occurence
        System.out.println(solve(str, B));
    }
}
