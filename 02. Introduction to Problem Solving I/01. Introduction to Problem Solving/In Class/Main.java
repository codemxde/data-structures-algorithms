import java.util.Scanner;

public class Main {

    public static void endOfSegment() {
        System.out.println("---------------------------------------------------------");
    }

    public static int calculateFactors(int N) {
        int factors = 0;

        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                if (i == N/i) {
                    factors++;
                } else {
                    factors += 2;
                }
            }
            if (factors > 2) {
                break;
            }
        }
        return factors;
    }

    public static void countFactors(Scanner sc) {
        System.out.println("Q1. Given N. Find the count of factors of N. (N > 0)\n");
        
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        System.out.println("Total Factors: " + calculateFactors(N));
        endOfSegment();
    }

    public static void checkPrime(Scanner sc) {
        System.out.println("Q2. Given N. Check if it's prime or not.\n");
        
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        System.out.println("Number is" + (calculateFactors(N) == 2 ? "" : " not") + " prime");
        endOfSegment();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // # Q1. Given N. Find the count of factors of N. (N > 0)
        countFactors(sc);

        // # Q2. Given N. Check if it's prime or not.
        checkPrime(sc);
    }
}
