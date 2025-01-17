// # Problem Description
// * You are given an integer array A, you have to return
// * an integer array of same size whose ith element is the
// * frequency count of A[i] in array A 

// # NOTE
// * When comparing two elements of the ArrayList(java), make sure
// * to use .equals() method for accurate comparison.
// * Eg : To compare ith index with jth index use A.get(i).equals(A.get(j)).

// # Problem Constraints
// * 1 <= len(A) <= 1000
// * 1 <= A[i] <= 100


// # Input Format
// * First argument is an array of integers representing array A

// # Output Format
// * You have to return an array of integers as per the question.

// # Example
// $ Input 1
// * A = [1, 2, 5, 1, 5, 1 ]

// $ Output 1
// * [3, 1, 2, 3, 2, 3]

// ! Explanantion
// * Clearly, In the given array we have 1 three times, 2 one time and 5 two times.

import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int checkElementFrequency(int[] arr, int element) {
        int frequency = 0;
        for (int i : arr) {
            if (i == element) {
                frequency++;
            }
        }
        return frequency;
    }

    public static int[] solve(int[] A) {
        int[] frequencyArray = new int[A.length];

        for (int i = 0; i < frequencyArray.length; i++) {
            frequencyArray[i] = checkElementFrequency(A, A[i]);
        }
        return frequencyArray;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] + "]" : arr[i] + ", ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];

        readArrayInput(arr, sc);
        printArray(solve(arr));
    }
}
