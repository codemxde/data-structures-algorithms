import java.util.Scanner;;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();

        int start = 4;
        System.out.println("Printing multiples of 4");
        while (start <= number) {
            System.out.println(start);
            start+=4;
        }
    }
}
