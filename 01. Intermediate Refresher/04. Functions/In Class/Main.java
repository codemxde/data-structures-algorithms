import java.util.Scanner;

public class Main {

    public static void calculate_sum_of_digits(int N) {
        int sum = 0;
        while (N > 0) {
            sum += (N % 10);
            N /= 10;
        }
        System.out.println("Sum of Digits: " + sum);
    }

    public static boolean integer_even_or_not(int N) {
        return N % 2 == 0;
    }

    public static String determine_height(int N) {
        String result = "large";
        if (N < 10) {
            result = "small";
        } else if ( N >= 10 && N <= 20) {
            result = "medium";
        }

        return result;
    }

    public static double calculate_area_rectangle(double a, double b) {
        return a * b;
    }

    public static double calculate_area_cirle(double radius) {
        return Math.PI * radius * radius;
    }

    public static boolean countFactors(int N) {
        int factors = 0;
        for (int i = 1; i*i <= N; i++) {
            if (N % i == 0) {
                if (i == N/i) {
                    factors++;
                } else {
                    factors+=2;
                }
            }
        }
        return factors == 2;
    }

    public static void print_primes(int N) {
        for (int i = 1; i < N; i++) {
            if (countFactors(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // # Example: Calculate sum of all digits of a number
        calculate_sum_of_digits(number);

        // # Q1. Given N, return whether integer is even or not
        System.out.println(number + " is " + (integer_even_or_not(number) ? "even" : "odd"));

        // # Q2. Given N, return whether height is small, medium or large
        System.out.println("Height is: " + determine_height(number));

        // # Q3. Gievn two doubles, return area of rectangle
        double a = 1.45;
        double b = 4.78;
        System.out.println("Area of rectangle is: " + calculate_area_rectangle(a, b));

        // # Q4. Given double radius, return area of circle
        double radius = 7.39;
        System.out.println("Area of circle is: " + calculate_area_cirle(radius));

        // # Q5. Given N, print all prime numbers from 1 to N
        print_primes(number);
    }
}
