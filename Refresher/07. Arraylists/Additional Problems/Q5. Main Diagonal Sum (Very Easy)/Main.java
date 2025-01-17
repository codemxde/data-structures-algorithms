// # Problem Description
// * You are given a N X N integer matrix.
// * You have to find the sum of all the main diagonal elements of A.

// # Main Diagonal:
// * Main diagonal of a matrix A is a collection
// * of elements A[i, j] such that i = j.

// # Problem Constraints
// * 1 <= N <= 10^3
// * -1000 <= A[i][j] <= 1000

// # Input Format
// * There are 1 lines in the input.
// * First 2 integers R, C are the number of rows and columns.
// * Then R * C integers follow corresponding to the
// * rowwise numbers in the 2D array A.

// # Output Format
// * Return an integer denoting the sum of main diagonal elements.

// # Example
// $ Input 1
// * 3 3 1 -2 -3 -4 5 -6 -7 -8 9

// $ Output 1
// * 15

// ! Explanantion
// * The size of matrix is 3.
// * So, considering the indexing from 0.
// * Main diagonal elements will be A[0][0], A[1][1] and A[2][2]
// * A[1][1] + A[2][2] + A[3][3] = 1 + 5 + 9 = 15

// $ Input 2
// * 2 2 3 2 2 3

// $ Output 2
// * 6

// ! Explanantion
// * The size of matrix is 2.
// * So, considering the indexing from 0.
// * Main diagonal elements will be A[0][0] and A[1][1].
// * A[1][1] + A[2][2] = 3 + 3 = 6

import java.util.ArrayList;
import java.util.List;
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

    public static int solve(final List<ArrayList<Integer>> A) {
        int rows = A.size();
        int columns = A.get(0).size();
        int sum = 0;
        
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (r == c) {
                    sum += A.get(r).get(c);
                }
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // * reading matrix as input
        readMatrixInput(list, sc);

        // * calculate main diagonal sum
        System.out.println("diagonal sum: " + solve(list));
    }
}
