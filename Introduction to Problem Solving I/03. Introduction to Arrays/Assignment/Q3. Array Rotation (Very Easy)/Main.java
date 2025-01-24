// # Problem Description
// * Given an integer array A of size N and an integer B,
// * you have to return the same array after
// * rotating it B times towards the right.

// # Problem Constraints
// * 1 <= N <= 10^5
// * 1 <= A[i] <= 10^9
// * 1 <= B <= 10^9

// # Input Format
// * The first argument given is the integer array A.
// * The second argument given is the integer B.

// # Output Format
// * Return the array A after rotating it B times to the right

// # Example
// $ Input 1
// * A = [1, 2, 3, 4]
// * B = 2

// $ Output 1
// * [3, 4, 1, 2]

// ! Explanantion
// * Rotate towards the right 2 times - [1, 2, 3, 4]
// * => [4, 1, 2, 3] => [3, 4, 1, 2]

// $ Input 2
// * A = [2, 5, 6]
// * B = 1

// $ Output 2
// * [6, 2, 5]

// ! Explanantion
// * Rotate towards the right 1 time - [2, 5, 6] => [6, 2, 5]

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] readArray(Scanner sc) {
        System.out.print("enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int readRotationInteger(Scanner sc) {
        System.out.print("enter integer to rotate by: ");
        return sc.nextInt();
    }

    public static void reverseInRange(int startIndex, int endIndex, int[] arr) {
        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;

            startIndex++;
            endIndex--;
        }
    }

    public static int[] solve(int[] A, int B) {

        // * handling cases when B >= A.length
        B = B % A.length;
        
        // * reveersing entire array
        reverseInRange(0, A.length - 1, A);

        // * revering first 'B' elements
        reverseInRange(0, B - 1, A);

        // * revering remaning elements from index 'B' till last index
        reverseInRange(B, A.length - 1, A);

        return A;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading an array
        int[] arr = readArray(sc);

        // * read rotation integer
        int B = readRotationInteger(sc);

        // * rotate array 'B' times
        System.out.println("after rotation: " + Arrays.toString(solve(arr, B)));
    }
}
