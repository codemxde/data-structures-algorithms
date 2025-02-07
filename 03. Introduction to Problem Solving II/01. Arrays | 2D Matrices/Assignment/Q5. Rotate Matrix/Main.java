// # Problem Description
// * You are given a n x n 2D matrix A representing an image.
// * Rotate the image by 90 degrees (clockwise).
// * You need to do this in place.

// # Note:
// * If you end up using an additional array,
// * you will only receive partial score.

// # Problem Constraints
// * 1 <= n <= 1000

// # Input Format
// * First argument is a 2D matrix A of integers

// # Output Format
// * Return the 2D rotated matrix.

// # Example
// $ Input 1
// * [
// *     [1, 2],
// *     [3, 4]
// * ]

// $ Output 1
// * [
// *     [3, 1],
// *     [4, 2]
// * ]

// ! Explanantion
// * After rotating the matrix by 90 degree:
// * 1 goes to 2, 2 goes to 4
// * 4 goes to 3, 3 goes to 1

// $ Input 2
// * [
// *     [1, 2, 3],
// *     [4, 5, 6],
// *     [7, 8, 9]
// * ]

// $ Output 2
// * [
// *     [7, 4, 1],
// *     [8, 5, 2],
// *     [9, 6, 3]
// * ]

// ! Explanantion
// * After rotating the matrix by 90 degree:
// * 1 goes to 3, 3 goes to 9
// * 2 goes to 6, 6 goes to 8
// * 9 goes to 7, 7 goes to 1
// * 8 goes to 4, 4 goes to 2

import java.util.Scanner;

public class Main {

    public static int[][] readMatrix(Scanner sc) {
        System.out.print("enter row and column sizes: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        // * taking input
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            System.out.print("enter elements for row " + (i+1) + ": ");
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void printMatrix(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        for (int i = 0; i < r; i++) {
            System.out.print("row " + (i+1) + " : [");
            for (int j = 0; j < c; j++) {
                int el = arr[i][j];
                System.out.print(j != c-1 ? el +", ": el + "]\n");
            }
        }
    }

    public static void transposeSquareMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverseRowElements(int[] arr) {
        int N = arr.length;
        int start = 0;
        int end = N-1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void solve(int[][] A) {
        // # Approach
        // * For logic building and demonstration, refer
        // * to the PDF listed under the same directory

        // * transposing the square matrix
        transposeSquareMatrix(A);

        // * reverse elements for each row
        for (int i = 0; i < A.length; i++) {
            reverseRowElements(A[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // * read matrix
        int[][] arr = readMatrix(sc);

        // * rotate the matrix 
        solve(arr);
        printMatrix(arr);
    }
}
