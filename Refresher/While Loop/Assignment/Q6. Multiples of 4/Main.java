// # Problem Description
// * Given an integer input N, print all multiples of 4
// * less than or equal to N.

// # Problem Constraints
// * 1 <= N <= 10000

// # Inout Format
// * A single line representing N

// # Output Format
// * Space separated integers representing multiples of 4
// * less than or equal to N.

// # Example
// * I/O: 22, O/P: 4 8 12 16 20

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int multiple = 4;

        while (multiple <= number) {
            System.out.print(multiple + " ");
            multiple += 4;
        }
    }
}
