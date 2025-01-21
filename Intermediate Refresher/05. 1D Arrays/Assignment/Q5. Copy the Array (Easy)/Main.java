// # Problem Description
// * You are given a constant array A and an integer B.
// * You are required to return another array where outArr[i] = A[i] + B.

// # Problem Constraints
// * 1 <= A.size() <= 10000
// * 1 <= A[i] <= 10000
// * 1 <= B <= 10000

// # Input Format
// * First argument is a constant array A.
// * Second argument is an integer B.

// # Output Format
// * You have to return an integer array.

// # Example
// $ Input 1
// * A = [1,2,3,2,1]
// * B = 3

// $ Output 1
// * [4,5,6,5,4] 

// $ Input 2
// * A = [1,1,10]
// * B = 6

// $ Output 2
// * [7,7,16] 

import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void printArrayInput(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] + "]" : arr[i] + ", ");
        }
    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int[] solve(final int[] A, int B) {
        int[] arr = new int[A.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = A[i] + B;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];

        readArrayInput(arr, sc);
        int[] resultArr =  solve(arr, number);
        printArrayInput(resultArr);
    }
}
