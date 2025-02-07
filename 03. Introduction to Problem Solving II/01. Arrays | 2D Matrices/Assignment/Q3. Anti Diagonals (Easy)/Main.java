// # Problem Description
// * Give a N * N square matrix A, return an array of
// * its anti-diagonals. Look at the example for more details.

// # Problem Constraints
// * 1<= N <= 1000
// * 1<= A[i][j] <= 1e9

// # Input Format
// * Only argument is a 2D array A of size N * N.

// # Output Format
// * Return a 2D integer array of size (2 * N-1) * N,
// * representing the anti-diagonals of input array A.
// * The vacant spaces in the grid should be assigned to 0.

// # Example
// $ Input 1
// * 1 2 3
// * 4 5 6
// * 7 8 9

// $ Output 1
// * 1 0 0
// * 2 4 0
// * 3 5 7
// * 6 8 0
// * 9 0 0

// ! Explanantion
// * The first anti diagonal of the matrix is [1 ],
// * the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
// * The second anti diagonal of the matrix is [2, 4 ],
// * the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
// * The third anti diagonal of the matrix is [3, 5, 7 ],
// * the rest spaces shoud be filled with 0 making the row as [3, 5, 7].
// * The fourth anti diagonal of the matrix is [6, 8 ],
// * the rest spaces shoud be filled with 0 making the row as [6, 8, 0].
// * The fifth anti diagonal of the matrix is [9 ],
// * the rest spaces shoud be filled with 0 making the row as [9, 0, 0].

// $ Input 2
// * 1 2
// * 3 4

// $ Output 2
// * 1 0
// * 2 3
// * 4 0

// ! Explanantion
// * The first anti diagonal of the matrix is [1 ],
// * the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
// * The second anti diagonal of the matrix is [2, 4 ],
// * the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
// * The third anti diagonal of the matrix is [3, 0, 0 ],
// * the rest spaces shoud be filled with 0 making the row as [3, 0, 0].

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

    public static int[][] diagonal(int[][] A) {
        int N = A.length;
        int[][] antiDiagonals = new int[2*N-1][N];

        // * spanning the diagonls of the 0th row
        for (int i = 0; i < N; i++) {
            int rowIndex = 0;
            int columnIndex = i;
            int[] arr = new int[N];
            while (columnIndex >= 0 && rowIndex < N) {
                arr[rowIndex] = A[rowIndex][columnIndex];
                rowIndex++;
                columnIndex--;
            }
            antiDiagonals[i] = arr;
        }

        int matrixIndex = N;
        // * spanning diagonals of the last column
        for (int i = 1; i < N; i++) {
            int rowIndex = i;
            int columnIndex = N-1;
            int[] arr = new int[N];
            int arrIndex = 0;
            while (rowIndex < N && columnIndex >=0) {
                arr[arrIndex] = A[rowIndex][columnIndex];
                rowIndex++;
                columnIndex--;
                arrIndex++;
            }
            antiDiagonals[matrixIndex] = arr;
            matrixIndex++;
        }

        return antiDiagonals;
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

        // * store anti diagonals
        printMatrix(diagonal(arr));
    }
}
