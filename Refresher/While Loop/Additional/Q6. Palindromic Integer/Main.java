// # Problem Description
// * You are given an integer A as input and you need to determine
// * whether it is a palindrome or not.

// * A palindrome integer is one whose digits, when reversed,
// * result in the same number.

// * For example, 121 is a palindrome because its reverse is also 121,
// * but 123 is not a palindrome because its reverse is 321.

// * Note: The given integer will not have any leading zeros.

// # Problem Constraints
// * 1 <= A <= 10^6

// # Input Format
// * First line of the input contains a single integer A.

// # Output Format
// * Print Yes if it is palindromic, else print No.

// # Example
// $ Input 1
// * 120

// $ Input 2
// * 1001

// $ Input 3
// * 131


// $ Output 1
// * No

// $ Output 2
// * Yes

// $ Output 3
// * Yes

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number;
        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }
        if (reversedNumber == original) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
