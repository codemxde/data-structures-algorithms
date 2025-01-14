// # Problem Description
// * Write a function to check if the given array A has
// * consecutive duplicate elements or not.
// * Return True if there are consecutive duplicate elements in the list
// * else return False.

// # Consecutive Duplicates
// * Here by consecutive duplicates, we mean duplicates that are
// * present at consecutive indices in the array

// # Problem Constraints
// * 1 <= N <= 10^5
// * 1 <= A[i] <= 10^9

// # Input Format
// * An integer array A as the function argument.

// # Output Format
// * Return True or False

// # Example
// $ Input 1
// * 1
// * 4
// * 1 2 3 3

// $ Output 1
// * true

// ! Explanantion
// * As there are 3 3 in the list i.e. at indices 2 and 3, there True is returned.

// $ Input 2
// * 1
// * 2
// * 1 2

// $ Output 2
// * false

// ! Explanantion
// * There are no consecutive duplicate elements in the list.

import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static boolean solve(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];

        readArrayInput(arr, sc);
        System.out.println(solve(arr));
    }
}
