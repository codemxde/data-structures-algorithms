import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        // # Given an integer 'n' print all the odd numbers in [1,n]

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 1;
        while (count <= number ) {
            if (count % 2 == 1) {
                System.out.println(count);
            }
            count++;
        }

        // # Optimized Approach
        System.out.println("\nOptimized:");
        int optimumCounter = 1;
        while (optimumCounter <= number) {
            System.out.println(optimumCounter);
            optimumCounter += 2;
        }
    }
}
