// # Problem Description
// * You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.
// * You have to print the odd and even elements of array A in 2 separate lines.

// # NOTE
// * Array elements should have the same relative order as in A.

// # Problem Constraints
// * 1 <= T <= 10
// * 1 <= |A| <= 10^5
// * 1 <= A[i] <= 10^9


// # Input Format
// * First line of the input contains a single integer T.
// * For each test case:
// * First line consists of a single integer |A| denoting the length of array.
// * Second line consists of |A| space separated integers denoting the elements of array A.

// # Output Format
// * For each test case:
// * First line should contain an array of space separated integers
// * containing all the odd elements of array A
// * Second line should contain an array of space separated integers
// * containing all the even elements of array A

// # Example
// $ Input 1
// *  2 
// *  5
// *  1 2 3 4 5
// *  3
// *  4 3 2

// $ Output 1
// * 1 3 5
// * 2 4
// * 3
// * 4 2

// ! Explanantion
// * Test Case 1: 
// * Odd elements in the array(in the order they occur) are: 1, 3, 5.
// * Even elements in the array(in the order they occur) are: 2, 4.

// * Test Case 2 
// * Odd elements in the array(in the order they occur) are: 3.
// * Even elements in the array(in the order they occur) are: 4, 2.

// $ Input 2
// * 2 
// * 3
// * 2 2 2
// * 2
// * 1 1

// $ Output 2
// * 2 2 2
// * 1 1

// ! Explanation
// *  Test Case 1: 
// * There are no odd elements in the array.
// * Even elements in the array(in the order they occur) are: 2, 2, 2.
// *
// * Test Case 2 
// * Odd elements in the array(in the order they occur) are: 1, 1.
// * There are no even elements in the array.

import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void printOddElements(int[] arr) {
        for (int i : arr) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printEvenElements(int[] arr) {
        System.out.println();
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void iterateTestcases(int testcases, Scanner sc) {
        for (int i = 0; i < testcases; i++) {
            int arrayLength = sc.nextInt();
            int[] arr = new int[arrayLength];

            readArrayInput(arr, sc);
            // # For more readable code
            printOddElements(arr);
            printEvenElements(arr);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        iterateTestcases(number, sc);
    }
}
