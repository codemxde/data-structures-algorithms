// # Problem Description
// * Given a 2D integer array A, return the transpose of A.

// # Transpose Matrix:
// * The transpose of a matrix is the matrix flipped over its main diagonal,
// * switching the matrix's row and column indices.

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
// * Clearly after converting rows to column and columns to rows
// * of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
// * we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].

// $ Input 2
// * A = [[1, 2],[1, 2],[1, 2]]

// $ Output 2
// * [[1, 1, 1], [2, 2, 2]]

// ! Explanantion
// * After transposing the matrix, A becomes [[1, 1, 1], [2, 2, 2]]

// * ----------------------------------------------------------------

// # ADDITIONAL INFO 📖
// * The transpose of a matrix is found by interchanging its
// * rows into columns or columns into rows.

// * [2 -9 3]           [2 13 3 4]
// * [13 11 -17]   =>   [-9 11 6 3]
// * [3 6 15]           [3 -17 5 1]
// * [4 13 1]

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void readMatrixInput(ArrayList<ArrayList<Integer>> list, Scanner sc) {
        System.out.print("enter no of rows: ");
        int rows = sc.nextInt();
        
        System.out.print("enter no of columns: ");
        int columns = sc.nextInt();

        System.out.println();
        for (int r = 0; r < rows; r++) {
            System.out.print("enter elements for row " + (r+1) + ": ");
            ArrayList<Integer> arr = new ArrayList<>();
            for (int c = 0; c < columns; c++) {
                arr.add(sc.nextInt());
            }
            list.add(arr);
        }
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        // # We only need to flip the columns and rows
        // * Iterate column wise, and add all elements
        // * in column as row in tranpose list

        // * Iterating column-wise on input arraylist
        int rows = A.size();
        int columns = A.get(0).size();
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();

        for (int c = 0; c < columns; c++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int r = 0; r < rows; r++) {
                arr.add(A.get(r).get(c));
            }
            transpose.add(arr);
        }
        return transpose;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // * reading matrix as input
        readMatrixInput(list, sc);

        // * calculate transpose of matrix
        System.out.println("transpose matrix: " + solve(list));
    }
}
