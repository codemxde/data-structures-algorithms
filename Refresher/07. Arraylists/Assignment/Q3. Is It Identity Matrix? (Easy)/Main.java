// # Problem Description
// * You are given a N X N square integer matrix A.
// * You have to tell whether A is an identity matrix or not.

// # Identity Matrix
// * Identity matrix is a special square matrix whose
// * main diagonal elements are equal to 1 and all other elements are 0.


// # Problem Constraints
// * 2 <= N <= 103
// * A[i][j] equals 0 or 1.

// # Input Format
// * The first argument is a 2D integer array denoting the matrix A

// # Output Format
// * Return 1 if A is an identity matrix, else return 0.

// # Example
// $ Input 1
// * [[1, 0], [0, 1]]

// $ Output 1
// * 1

// ! Explanantion
// * All the main diagonal elements in A are 1, all other elements are 0.
// * So, A is an identity matrix.

// $ Input 2
// * [[0, 0, 1], [0, 1, 0], [1, 0, 0]]

// $ Output 2
// * 0

// ! Explanantion
// * All the main diagonal elements in A are not 1,
// * also all other elements are not equal to 0.
// * So, A is not an identity matrix.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void readIdentityMatrixInput(ArrayList<ArrayList<Integer>> list, Scanner sc) {
        System.out.print("enter matrix size: ");
        int size = sc.nextInt();

        System.out.println();
        for (int r = 0; r < size; r++) {
            ArrayList<Integer> arr = new ArrayList<>();
            System.out.print("enter elements (0 or 1) for row " + (r+1) + ": ");
            for (int c = 0; c < size; c++) {
                arr.add(sc.nextInt());
            }
            list.add(arr);
        }
    }

    public static int solve(final List<ArrayList<Integer>> A) {
        int rows = A.size();
        int columns = A.get(0).size();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if ((r == c && A.get(r).get(c) != 1) || (r != c && A.get(r).get(c) != 0)) {
                    return 0;
                }
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // * reading matrix input in arraylist
        readIdentityMatrixInput(list, sc);

        // * check if identity matrix
        System.out.println(solve(list) == 1 ? "\nidentity matrix" : "\nnot an identity matrix");
    }
}
