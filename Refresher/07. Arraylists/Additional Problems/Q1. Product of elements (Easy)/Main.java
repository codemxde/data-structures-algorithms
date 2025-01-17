// # Problem Description
// * Write a program that returns the product
// * of all elements present in the array.

// # Note:
// * The list with elements is already passed as an argument to the function.
// * User don't need to take any input.
// * Just perform the task on the passed arguments and return the required result.

// # Problem Constraints
// * 1 <= |A| <= 100
// * 1 <= A <= 100

// # Note:
// * It is guaranteed that the resultant product will be <= 10^15

// # Input Format
// * An integer array A as the function argument.

// # Output Format
// * Product of elements in integer format

// # Example
// $ Input 1
// * A = [7, 9, 2, 51]

// $ Output 1
// * 6426

// ! Explanantion
// * The product of all the elements is 7 * 9 * 2 * 51 = 6426 is returned.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void readArrayList(ArrayList<Integer> arr, Scanner sc) {
        System.out.print("enter arraylist size: ");
        int size = sc.nextInt();

        System.out.print("enter elements: ");
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
    }

    public static long solve(ArrayList<Integer> arr) {
        // Complete the function template here
        long result = 1;
        for (Integer integer : arr) {
            result *= integer;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        // * reading arraylist input
        readArrayList(arr, sc);

        // * calculating product of all elements
        System.out.println("product: " + solve(arr));
    }
}
