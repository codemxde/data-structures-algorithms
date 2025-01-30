// # Problem Description
// * You are given an array A of N integers.
// * Return a 2D array consisting of all the subarrays of the array

// # Note:
// * The order of the subarrays in the resulting 2D array does not matter.

// # Problem Constraints
// * 1 <= N <= 100
// * 1 <= A[i] <= 10^5

// # Input Format
// * First argument A is an array of integers.

// # Output Format
// * Return a 2D array of integers in any order.

// # Example
// $ Input 1
// * A = [1, 2, 3]

// $ Output 1
// * [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]

// ! Explanantion
// * All the subarrays of the array are returned.
// * There are a total of 6 subarrays.

// $ Input 2
// * A = [5, 2, 1, 4]

// $ Output 2
// * [[1 ], [1 4 ], [2 ], [2 1 ], [2 1 4 ], [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4 ] ]

// ! Explanantion
// * All the subarrays of the array are returned.
// * There are a total of 10 subarrays.

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
        System.out.println();
        return arr;
    }

    public static int[] returnSubArrays(int[] arr, int si, int ei) {
        int[] subArray = new int[ei - si + 1];
        int i = 0;

        while (si <= ei) {
            subArray[i] = arr[si];
            i++;
            si++;
        }
        return subArray;
    }
    
    public static int[][] solve(int[] A) {
        int N = A.length;
        int[][] arr = new int[N*(N+1)/2][];
        int index = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                arr[index] = returnSubArrays(A, i, j);
                index++; 
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read array
        int[] arr = readArray(sc);

        // * find all sub arrays
        solve(arr);
    }
}
