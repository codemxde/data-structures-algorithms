// # Problem Description
// * You are given a N X N integer matrix.
// * You have to find the sum of all the minor diagonal elements of A.

// # Minor Diagonal
// * Minor diagonal of a M X M matrix A is a
// * collection of elements A[i, j] such that
// * i + j = M + 1 (where i, j are 1-based).

// # Problem Constraints
// * 1 <= N <= 10^3
// * -1000 <= A[i][j] <= 1000

// # Input Format
// * First and only argument is a 2D integer matrix A.

// # Output Format
// * Return an integer denoting the sum of minor diagonal elements.

// # Example
// $ Input 1
// * A = [[1, -2, -3],
// *      [-4, 5, -6],
// *      [-7, -8, 9]]

// $ Output 1
// * -5

// ! Explanantion
// * A[1][3] + A[2][2] + A[3][1] = (-3) + 5 + (-7) = -5

// $ Input 2
// * A = [[3, 2],
// *      [2, 3]]

// $ Output 2
// * 4

// ! Explanantion
// * A[1][2] + A[2][1] = 2 + 2 = 4

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

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int solve(final int[][] A) {
        int N = A.length;
        int minorSum = 0;
        for (int i = 0; i < N; i++) {
            minorSum += A[i][N-i-1];
        }
        return minorSum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read matrix
        int[][] A = readMatrix(sc);

        // * calculate minor diagnal sum
        System.out.println("minor diagonla sum: " + solve(A));
    }
}
