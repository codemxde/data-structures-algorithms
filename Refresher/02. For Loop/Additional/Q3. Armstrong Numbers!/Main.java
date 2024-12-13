// # Problem Description
// * You are given an integer N you need to print all the
// * Armstrong Numbers between 1 to N. (N inclusive).

// # Armstrong Number
// * If sum of cubes of each digit of the number is equal to the
// * number itself, then the number is called an Armstrong number.
// * For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).

// # Note
// * All the test cases in this problem are limited to 3 digit numbers.

// # Problem Constraints
// * 1 <= N <= 500

// # Input Format
// * First and only line of input contains an integer N.

// # Output Format
// * Output all the Armstrong numbers in range [1,N] each in a new line.

// # Example
// $ Input 1
// * 5

// $ Output 1
// * 1

// $ Input 2
// * 200

// $ Output 2
// * 153

import java.util.Scanner;

public class Main {

    public static int calculate_cubed_sum_of_digits(int num) {
        int cubed_sum = 0;
        while (num > 0) {
            cubed_sum += Math.pow(num%10, 3);
            num /= 10;
        }
        return cubed_sum;
    }
    
    public static void find_armstrong_number(int N) {
        for (int i = 1; i <= N; i++) {
            if (calculate_cubed_sum_of_digits(i) == i) {
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        find_armstrong_number(number);
    }
}
