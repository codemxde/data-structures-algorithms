// # Problem Description
// * Write a program to print sum of elements of the input array A of size N.

// # Note:
// * User is supposed to write a program from scratch to
// * add the elements of the input array and print the result.

// # Problem Constraints
// * 1 <= N <= 1000
// * 1 <= A <= 1000

// # Input Format
// * - The first integer N denotes the number of integers in the array.
// * - The next N integers denotes the element of the array A.

// # Output Format
// * A single integer containing sum of elements from the input array.

// # Example
// $ Input 1
// * 5 1 2 3 4 5

// $ Output 1
// * 15

// $ Input 2
// * 4 10 50 40 80

// $ Output 2
// * 180

import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void sumOfElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];

        readArrayInput(arr, sc);
        sumOfElements(arr);
    }
}
