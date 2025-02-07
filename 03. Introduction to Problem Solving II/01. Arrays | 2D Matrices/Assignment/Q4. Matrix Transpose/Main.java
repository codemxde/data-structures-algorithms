// # Problem Description
// * Given a 2D integer array A, return the transpose of A.
// * The transpose of a matrix is the matrix flipped over
// * its main diagonal, switching the matrix's row and column indices.

// # Problem Constraints
// * 1 <= A.size() <= 1000
// * 1 <= A[i].size() <= 1000
// * 1 <= A[i][j] <= 1000

// # Input Format
// * First argument is a 2D matrix of integers.

// # Output Format
// * You have to return the Transpose of this 2D matrix.

// # Example
// $ Input 1
// * A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]

// $ Output 1
// * [[1, 4, 7], [2, 5, 8], [3, 6, 9]]

// ! Explanantion
// * Clearly after converting rows to column and columns
// * to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
// * we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].

// $ Input 2
// * A = [[1, 2],[1, 2],[1, 2]]

// $ Output 2
// * [[1, 1, 1], [2, 2, 2]]

// ! Explanantion
// * After transposing the matrix, A becomes [[1, 1, 1], [2, 2, 2]]

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

    public static int[][] solve(int[][] A) {
        // # Approack
        // * If it was N*N matrix, it could have been transposed
        // * in O(N) time, by swapping values A[i][j] with A[j][i]
        // * excluding the diagonal elements
        // * However, here for A[N][M] we would first need to construct 
        // * A[M][N] and store the rows of the original matrix as the
        // * columns for the transposed matrix

        int N = A.length;
        int M = A[0].length;
        int[][] arr = new int[M][N];

        // * flipping elements over the diagonal
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[j][i] = A[i][j];
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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // * read matrix
        int[][] arr = readMatrix(sc);

        // * transpose the matrix
        printMatrix(solve(arr));
    }
}
