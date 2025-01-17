// # Problem Description
// * Write a program that returns the product of all elements present in the array.

// # NOTE
// * The list with elements is already passed as an argument to the function.
// * User don't need to take any input. Just perform the task on the
// * passed arguments and return the required result.

// # Problem Constraints
// * 1 <= |A| <= 100
// * 1 <= A <= 100
// * Note: It is guaranteed that the resultant product will be <= 10^15


// # Input Format
// * An integer array **A** as the function argument.

// # Output Format
// * Product of elements in integer format

// # Example
// $ Input 1
// *  A = [7, 9, 2, 51]

// $ Output 1
// * 6426

// ! Explanantion
// * The product of all the elements is 7 * 9 * 2 * 51 = 6426 is returned.

import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static long solve(int[] arr) {
        // Complete the function template here
        long result = 1;

        for (int i : arr) {
            result *= i;
        }

        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];
        
        readArrayInput(arr, sc);
        System.out.println(solve(arr));
    }
}
