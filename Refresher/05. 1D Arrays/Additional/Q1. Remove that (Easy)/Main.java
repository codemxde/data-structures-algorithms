// # Problem Description
// * Write a program to input N numbers array,
// * A from the user and an integer X and print the array\
// * by deleting element at specified position X.

// # Note
// * The first element is located at position 1,
// * the second element is located at position 2, and so on.

// # Problem Constraints
// * 2 <= N <= 100
// * 1 <= A[i] <= 1000
// * 1 <= X <= N


// # Input Format
// * First line is N which means number of elements.
// * Second line contains N space separated integers.
// * Third line is X position which has to be deleted.

// # Output Format
// * N-1 space separated integers of the input array after
// * deleting the element at required position.

// # Example
// $ Input 1
// * 5
// * 2 3 1 4 2
// * 3

// $ Output 1
// * 2 3 4 2

// * Clearly after removing the element at position 3 (2 3 1 4 2),
// * the remaining array is 2 3 4 2.

// $ Input 2
// * 2
// * 4 5
// * 2

// $ Output 2
// * 4

// * After removing the element at position 2 (4 5), the remaining array is 4.

import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void removeInputPosition(int[] arr, Scanner sc) {
        int index = sc.nextInt() - 1;
        int[] resultArr = new int[arr.length - 1];

        for (int i = 0; i < index; i++) {
            resultArr[i] = arr[i];
        }
        for (int i = index; i < resultArr.length; i++) {
            resultArr[i] = arr[i + 1];
        }
        printArray(resultArr);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];

        readArrayInput(arr, sc);
        removeInputPosition(arr, sc);
    }
}
