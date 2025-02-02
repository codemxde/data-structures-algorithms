// # Problem Description
// * You are given a matrix A and and an integer B,
// * you have to perform scalar multiplication of matrix A with an integer B.

// # Problem Constraints
// * 1 <= A.size() <= 1000
// * 1 <= A[i].size() <= 1000
// * 1 <= A[i][j] <= 1000
// * 1 <= B <= 1000

// # Input Format
// * First argument is 2D array of integers A representing matrix.
// * Second argument is an integer B.

// # Output Format
// * You have to return a 2D array of integers after doing required operations.

// # Example
// $ Input 1
// * A = [[1, 2, 3],
// * [4, 5, 6],
// * [7, 8, 9]]

// * B = 2

// $ Output 1
// * [[2, 4, 6], 
// * [8, 10, 12], 
// * [14, 16, 18]]

// ! Explanantion
// * ==> ( [[1, 2, 3],[4, 5, 6],[7, 8, 9]] ) * 2

// * ==> [[2*1, 2*2, 2*3],
// * [2*4, 2*5, 2*6],
// * [2*7, 2*8, 2*9]]

// * ==> [[2,   4,  6], 
// * [8,  10, 12], 
// * [14, 16, 18]]

// $ Input 2
// * A = [[1]]
// * B = 5

// $ Output 2
// * [[5]]

// ! Explanantion
// * ==> ( [[1]] ) * 5
// * ==> [[5*1]]
// * ==> [[5]]

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

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        int rows = A.size();
        int columns = A.get(0).size();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                A.get(r).set(c, A.get(r).get(c) * B);
            }
        }
        return A;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // * reading matrix input in arraylist
        readMatrixInput(list, sc);

        // * reading multipler
        System.out.print("\nenter multiplier: ");
        int B = sc.nextInt();

        // * performing matrix scalar product
        System.out.println("\n" + solve(list, B));
    }
}
