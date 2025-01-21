// # Given a number, reverse the number
// * N = 1234, O/P: 4321

import java.util.Scanner;

public class ReverseTheNumber {

    public static void myReverse(int number) {

        String reverseNumber = "";
        while (number > 0) {
            reverseNumber += number % 10;
            number /= 10;
        }
        Integer.parseInt(reverseNumber);
        System.out.println("Reversed Number: " + reverseNumber);
    }

    public static void otherReverse(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            reversedNumber += number % 10;
            reversedNumber *= 10;
            number /= 10;
        }
        reversedNumber /= 10;
        System.out.println("Revered Number Approach 2: " + reversedNumber);
    }

    public static void optimalReverse(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            reversedNumber = (reversedNumber * 10) + (number % 10);
            number /= 10;
        }
        System.out.println("Reversed Number Intructor's Approach: "
         + reversedNumber);
    }
    public static void main(String[] args) {

        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // # My method for reversing number using string concatenation
        myReverse(number);

        // # Another Approach
        otherReverse(number);

        // # Intructor's Approach
        optimalReverse(number);
    }
}
