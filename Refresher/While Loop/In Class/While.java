import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        // # Why do we use loops?
        // Do perform repetitive tasks!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int number = sc.nextInt();
        int count = 0;

        System.out.println("\nPrinting from 0 to " + number);
        while (count < number) {
            count++;
            System.out.println(count);
        }

        System.out.println("\nPrininting from " + number + " till 0");
        while (number >= 0) {
            System.out.println(number);
            number--;
        }
    }
}