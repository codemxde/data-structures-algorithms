// # Problem Description
// * You are given a positive integer A denoting the radius of a circle.
// * You have to calculate the area of the circle.

// # Note:
// * The formula for the area of a circle is Area = πr²,
// * where r is the radius of the circle. You can use the value of PI as 3.1416
// * Round up the final answer up to 2 decimal places.
// * You can use round(area, 2) it for rounding area to 2 decimal places

// # Problem Constraints
// * 1 <= A <= 1000

// # Input Format
// * First and only argument is an integer A.

// # Output Format
// * Return final answer upto 2 decimal places, denoting the area of the circle.

// # Example
// $ Input 1
// * 8

// $ Output 1
// * 201.06

// $ Input 2
// * 15

// $ Output 2
// * 701.86

import java.util.Scanner;

public class Main {

    public static double solve(int A) {
        double floor = Math.floor(3.1416 * A * A * 100);
        return floor / 100.0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(solve(number));
    }
}
