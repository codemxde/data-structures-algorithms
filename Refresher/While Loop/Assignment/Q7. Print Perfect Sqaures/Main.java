// # Problem Description
// * Take an input of a number A from the user.
// * Print all perfect squares less than or equal to A.

// # NOTE
// * Perfect squares are integers whose square root is an integer.
// * (For Example: 16 is perfect square as √16 = 4, or 4^2 = 16)

// # Problem Constraints
// * 1 <= N <= 10^4

// # Inout Format
// * A single line consisting of a integer A.

// # Output Format
// * Print perfect squares less than or equal to A in a
// * single line in a space-separated manner.

// # Example
// * I/O: 20, O/P: 1 4 9 16

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        int perfectSquare = 1;
        while (perfectSquare * perfectSquare <= number) {
            System.out.print((perfectSquare * perfectSquare) + " ");
            perfectSquare++;
            
        }
    }
}
