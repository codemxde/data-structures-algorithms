// # Problem Description
// * You are given two matrices A and B of equal dimensions and
// * you have to check whether two matrices are equal or not.

// # Note
// * Both matrices are equal if A[i][j] == B[i][j] for all i and j.

// # Problem Constraints
// * 1 <= A.size(), B.size() <= 1000
// * 1 <= A[i].size(), B[i].size() <= 1000
// * 1 <= A[i][j], B[i][j] <= 1000
// * A.size() == B.size()
// * A[i].size() == B[i].size()

// # Input Format
// * First argument is 2-D array of integers representing matrix A.
// * Second argument is 2-D array of integers representing matrix B.

// # Output Format
// * Return 1 if both matrices are equal or return 0.

// # Example
// $ Input 1
// * A = [[1, 2, 3],
// *      [4, 5, 6],
// *      [7, 8, 9]]

// * B = [[1, 2, 3],
// *      [4, 5, 6],
// *      [7, 8, 9]]

// $ Output 1
// * 1

// ! Explanation
// * Clearly all the elements of both matrices are equal at respective positions.

// $ Input 2
// * A = [[1, 2, 3],
// *      [4, 5, 6],
// *      [7, 8, 9]]

// * B = [[1, 2, 3],
// *      [7, 8, 9],
// *      [4, 5, 6]]

// $ Output 2
// * 0

// ! Explanantion
// * Clearly, there are mismatches at
// * (1, 0), (1, 1), (1, 2), (2, 0), (2, 1) and (2, 2).

// * A = [[1, 2, 3],
// *      [4, 5, 6],
// *      [7, 8, 9]] 

// * B = [[1, 2, 3],
// *      [7, 8, 9],
// *      [4, 5, 6]]

import java.util.Scanner;

public class Main {

    public static void receiveArrayInput(String msg, int[][] arr, Scanner sc) {
        System.out.println("\n" + msg);
        int R = arr.length;
        int C = arr[0].length;
        for (int i = 0; i < R; i++) {
            System.out.print("Enter elements for row " + (i+1) + ": ");
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static int solve(int[][] A, int[][] B) {
        int R = A.length;
        int C = A[0].length;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(A[i][j] != B[i][j]) {
                    return 0;
                }
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int R = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int C = sc.nextInt();
        int[][] A = new int[R][C];
        int[][] B = new int[R][C];

        receiveArrayInput("Matrix A:", A, sc);
        receiveArrayInput("Matrix B:", B, sc);
        System.out.println("------------------------");
        System.out.println(solve(A, B));
    }
}
