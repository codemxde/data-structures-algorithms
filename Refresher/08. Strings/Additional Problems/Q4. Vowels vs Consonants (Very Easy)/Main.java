// # Problem Description
// * Write a program to input T strings (S) from user
// * and printcount of vowels and consonants in it.

// # Problem Constraints
// * 1 <= T <= 100
// * 1 <= S.size() <= 1000

// # Input Format
// * First line is T which means number of test cases.
// * Each next T lines contain a lowercase string S.

// # Output Format
// * T lines each containing two space separated integers
// * representing cont of vowels and consonants in input string.

// # Example
// $ Input 1
// * 2
// * interviewbit
// * scaler

// $ Output 1
// * 5 7
// * 2 4

import java.util.Scanner;

public class Main {

    public static void countVowels(String str) {
        int vowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vowels++;
            }
        }
        System.out.println(vowels + " " + (str.length() - vowels));
    }

    public static void readStringInput(Scanner sc, int T) {
        for (int i = 0; i < T; i++) {
            String str = sc.next();
            countVowels(str);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 

        // * reading string input
        readStringInput(sc, T);
    }
}
