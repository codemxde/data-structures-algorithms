// # Problem Description
// * Write a program to input N numbers array, a number X and a number Y
// * from user and insert an element Y in it at specified position X.
// * X is based on 1-based indexing

// # Note:
// * When an element is inserted at position X, all elements
// * that were already present at position >= X, gets shifted to
// * one position right, not replaced.

// # Problem Constraints
// * 1 <= N <= 100
// * 1 <= A[i] <= 1000
// * 1 <= X <= N
// * 1 <= Y <= 1000

// # Input Format
// * First line is N which represents number of elements.
// * Second line contains N space separated integers.
// * Third line is X position where Y has to be inserted.
// * Fourth line is Y which is the value to be inserted.

// # Output Format
// * N+1 space separated integers of the input array after
// * inserting the element at required position.

// # Example
// $ Input 1
// * 5
// * 2 3 1 4 2
// * 3
// * 5

// $ Output 1
// * 2 3 5 1 4 2
// * (Clearly after inserting 5 at 3rd position, new array is 2 3 5 1 4 2.)

import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int[] insertAtPosition(int[] arr, Scanner sc) {
        int index = sc.nextInt() - 1;
        int number = sc.nextInt();
        
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = number;
        for (int i = index + 1; i < newArr.length; i++) {
            newArr[i] = arr[i-1];
        }

        return newArr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];

        readArrayInput(arr,sc);
        int[] newArr = insertAtPosition(arr, sc);
        printArray(newArr);
    }
}
