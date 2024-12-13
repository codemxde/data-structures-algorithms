// # Given a Number, print it's Digits
// $ N = 146 , O/P: 1 4 6

import java.util.Scanner;

public class PrintDigits {

    static void printDigitsByString(int number) {
        String digits = Integer.toString(number);
        int index = 0;

        System.out.println("\nPrinting Digits!");
        while (index < digits.length()) {
            System.out.println(digits.charAt(index));
            index++;
        }

        // # Printing in Reverse!
        System.out.println("\nPrinitng in Reverse!");
        index--;
        while (index >= 0) {
            System.out.println(digits.charAt(index));
            index--;
        }
    }

    static void printDigits(int number) {
        System.out.println("\nPrinitng in optimized manner");
        while (number > 0) {
            System.out.println(number%10);
            number /= 10;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        // # My implementation (not optimized)
        printDigitsByString(number);

        // # Optimized Approach
        printDigits(number);
    }
}
