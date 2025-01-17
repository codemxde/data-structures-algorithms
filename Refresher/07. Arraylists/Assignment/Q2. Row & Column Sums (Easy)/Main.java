// # Problem Description
// * You are given a matrix A, you have to return an array
// * containing sum of each row elements followed by
// * sum of each column elements of the matrix.

// # NOTE
// * If the matrix given is of size (N x M), then the array you return
// * would be of size (N + M), where first N elements contain
// * the sum of each N rows, and the next M elements contain
// * the sum of each M columns.


// # Problem Constraints
// * 1 <= A.size() <= 1000
// * 1 <= A[i].size() <= 1000
// * 1 <= A[i][j] <= 1000

// # Input Format
// * First argument is a 2D matrix of integers.

// # Output Format
// * You have to return a 1D list of integers after doing required operations.

// # Example
// $ Input 1
// * A = [[1, 2],[4, 5],[8, 9]]

// $ Output 1
// * [3, 9, 17, 13, 16]

// ! Explanantion
// * Row 1 elements sum = 1 + 2 = 3.
// * Row 2 elements sum = 4 + 5 = 9.
// * Row 3 elements sum = 8 + 9 = 17.
// * Column 1 elements sum = 1 + 4 + 8 = 13.
// * Column 2 elements sum = 2 + 5 + 9 = 16.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void readMatrixInput(ArrayList<ArrayList<Integer>> list, Scanner sc) {
        System.out.print("enter row size: ");
        int rows = sc.nextInt();
        
        System.out.print("enter column size: ");
        int columns = sc.nextInt();

        System.out.println();
        for (int r = 0; r < rows; r++) {
            ArrayList<Integer> arr = new ArrayList<>();
            System.out.print("enter elements for row " + (r+1) + ": ");
            for (int c = 0; c < columns; c++) {
                arr.add(sc.nextInt());
            }
            list.add(arr);
        }
    }

    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        int rows = A.size();
        int columns = A.get(0).size();
        ArrayList<Integer> arr = new ArrayList<>();

        // * firstly, reading row-wise sum
        for (int r = 0; r < rows; r++) {
            int rowSum = 0;
            for (int c = 0; c < columns; c++) {
                rowSum += A.get(r).get(c);
            }
            arr.add(rowSum);
        }

        // * now reading column-wise sum
        for (int c = 0; c < columns; c++) {
            int columnSum = 0;
            for (int r = 0; r < rows; r++) {
                columnSum += A.get(r).get(c);
            }
            arr.add(columnSum);
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // * reading matrix input in arraylist
        readMatrixInput(list, sc);

        // * storing row-wise and column-wise sum in arraylist
        System.out.println("\nrow and column sum: " + solve(list));
    }
}
