// # Given an integer N, print all the perfect squares till N
// $ N = 18 , O/P: [1, 4, 9, 16]

import java.util.Scanner;

public class PerfectSquares {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 1;

        System.out.println("\nPrintng perfect squares till " + number);
        while (count * count <= number) {
            System.out.println(count * count);
            count++;
        }
    }
}
