// # Problem Description
// * You are given a positive integer A denoting the radius of a sphere.
// * You have to calculate the volume of the sphere.
// * Volume of a sphere having radius R is given by (4 * π * R^3) / 3.

// # Note:
// * Since, the answer can be a real number, you have to return the ceil value of
// * the volume. Ceil value of a real number X is the smallest integer that is
// * greater than or equal to X.

// # Problem Constraints
// * 1 <= A <= 400

// # Input Format
// * First and only argument is an integer A.

// # Output Format
// * Return a single integer denoting the ceil value of volume of the sphere.

// # Example
// $ Input 1
// * 1

// $ Output 1
// * 5

// $ Input 2
// * 4

// $ Output 2
// * 269

import java.util.Scanner;

public class Main {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int solve(final int A) {
        return (int) Math.ceil(Math.PI * 4 / 3 * A * A * A);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(solve(number));
    }
}
