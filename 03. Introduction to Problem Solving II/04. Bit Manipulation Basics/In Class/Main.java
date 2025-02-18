import java.util.Scanner;

public class Main {

    public static void convertBinaryToDecimal(Scanner sc) {
        System.out.print("enter binary: ");
        int binary = sc.nextInt();
        int power = 1;
        int decimal = 0;

        while (binary > 0) {
            int digit = binary % 10;
            decimal += digit * power;
            binary /= 10;
            power *= 2;
        }
        System.out.println("decimal representation of input: " + decimal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // # Q1. Convert Binary to Decimal
        convertBinaryToDecimal(sc);

        // # Q2. Convert Decimal to Binary
        // * Solved under 'Go' directory

        // # Q3. Q3. Add Two Binary Numbers
        // * Solved under 'Go' directory
    }
}