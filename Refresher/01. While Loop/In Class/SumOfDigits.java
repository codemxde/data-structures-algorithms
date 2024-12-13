// # Given an Integer N, print sum of digits
// * N = 6581, O/P: 20

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int count = 0;
        while (number > 0) {
            count += number % 10;
            number /= 10;
        }
        System.out.println("\nSum of Digits is: " + count);
    }
}
