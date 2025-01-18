import java.util.Scanner;

public class Main {

    public static void printEndOfSegment() {
        System.out.println("---------------------------------------------");
    }

    public static String takeStringInput(Scanner sc) {
        System.out.print("enter string: ");
        
        // * taking input for one-word only
        String str = sc.next();
        printEndOfSegment();

        return str;
    }

    public static void printCharactersInNewline(String str) {
        System.out.println("Q1. Given a string, print it's characters in new line\n");
        for (int i = 0; i < str.length(); i++) {
            System.out.print("character at index " + i + ": '" + str.charAt(i) + "'\n");
        }
        printEndOfSegment();
    }

    public static void printAsciiInNewLine(String str) {
        System.out.println("Q2. Given a string, print the ASCII of it's characters in new line.\n");
        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            System.out.print("ascii of " + str.charAt(i) + ": '" + ascii + "'\n");
        }
        printEndOfSegment();
    }

    public static void countUppercaseCharacters(String str) {
        System.out.println("Q3. Given a string, print the count of uppercase charcters\n");

        // # Trivia
        // * If a character in uppercase it will be in
        // * range of ['A' to 'Z'] or [65 to 90]
        
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;
            }
        }
        System.out.println("no of uppercase letters: " + count);
        printEndOfSegment();
    }

    public static void printCountOfSpecialCharacters(String str) {
        System.out.println("Q4. Given a string, print the count of special characters\n");
        int specialCharacters = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch >= 'A' && ch <= 'Z' ||
                ch >= 'a' && ch <= 'z' ||
                ch >= '0' && ch <= '9')) {
                specialCharacters++;
            }
        }
        System.out.println("no of special characters: " + specialCharacters);
        printEndOfSegment();
    }

    public static void reverseGivenString(String str) {
        System.out.println("Q5. Given a string, return the reverse of a string.\n");

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("reversed string: " + reverse);
        printEndOfSegment();
    }

    public static void checkPalindrome(String str) {
        System.out.println("Q6. Given a string, check whether its palindrome or not\n");

        boolean isPalindrome = true;
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println(str + (isPalindrome ? " is a palindrome" : " is not a palindrome"));
        printEndOfSegment();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * Taking re-usable string input
        String str = takeStringInput(sc);

        // # Q1. Given a string, print it's characters in new line
        printCharactersInNewline(str);

        // # Q2. Given a string, print the ASCII of it's characters in new line.
        printAsciiInNewLine(str);

        // # Q3. Given a string, print the count of uppercase charcters
        countUppercaseCharacters(str);

        // # Q4. Given a string, print the count of special characters
        printCountOfSpecialCharacters(str);

        // # Q5. Given a string, return the reverse of a string.
        reverseGivenString(str);

        // # Q6. Given a string, check whether its palindrome or not
        checkPalindrome(str);
    }
}
