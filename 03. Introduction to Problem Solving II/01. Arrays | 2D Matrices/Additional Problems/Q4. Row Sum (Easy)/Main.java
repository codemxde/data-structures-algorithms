// # Problem Constraints
// * 1 <= A.size() <= 10^3
// * 1 <= A[i].size() <= 10^3
// * 1 <= A[i][j] <= 10^3

// # Input Format
// * First argument A is a 2D array of integers.(2D matrix).

// # Output Format
// * Return an array containing row-wise sums of original matrix.

// # Example
// $ Input 1
// * [1,2,3,4]
// * [5,6,7,8]
// * [9,2,3,4]

// $ Output 1
// * [10,26,18]

// ! Explanantion
// * Row 1 = 1+2+3+4 = 10
// * Row 2 = 5+6+7+8 = 26
// * Row 3 = 9+2+3+4 = 18

import java.util.Arrays;
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

    public static int[] solve(int[][] A) {
        int[] arr = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < A[0].length; j++) {
                rowSum += A[i][j];
            }
            arr[i] = rowSum;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read matrix
        int[][] A = readMatrix(sc);

        // * calculate each row's sum
        System.out.println("each rows sum : " + Arrays.toString(solve(A)));
    }
}
