// # Problem Description
// * Write a program to print all negative numbers
// * from input array A of size N.
// * Take integer N and N elements of the array as input from user.

// # Problem Constraints
// * 1 <= N <= 1000  
// * -1000 <= A <= 1000


// # Input Format
// * A single line representing N followed by N integers of the array A

// # Output Format
// * A single line containing elements from the input array
// * which are negative in the same order.

// # NOTE
// * Keep a space character (' ') at the end of the line.

// # Example
// $ Input 1
// * 5 1 -5 2 -8 -4

// $ Output 1
// * -5 -8 -4

// * all the negative elements of [5 1 -5 2 -8 -4] are [-5 -8 -4]

// $ Input 2
// * 4 -1 0 -8 -1

// $ Output 2
// * -1 -8 -1 

// * all the negative elements of [4 -1 0 -8 -1] are [-1 -8 -1]

import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void printNegativeIntegers(int[] arr) {
        for (int i : arr) {
            if (i < 0) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];

        readArrayInput(arr, sc);
        printNegativeIntegers(arr);
    }
}
