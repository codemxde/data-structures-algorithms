// # Problem Description
// * Given an integer A in the function parameter.
// * Return a 2D array with A rows such that
// * the i-th row has numbers from 1 to i.

// # Problem Constraints
// * 1 <= A <= 10^3

// # Input Format
// * Only argument A is an integer.

// # Output Format
// * Return a 2D array of integers

// # Example
// $ Input 1
// * A = 3

// $ Output 1
// * [[1], [1, 2], [1, 2, 3]]

// ! Explanantion
// * The 2D array contains 3 rows where the rows have 1, 2 and 3 
// * elements respectively.

// $ Input 2
// * A = 4

// $ Output 2
// * [[1], [1, 2], [1, 2, 3], [1, 2, 3, 4]]

// ! Explanantion
// * The 2D array contains 4 rows where the rows have 1, 2, 3 and 4
// * elements respectively.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < A; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                arr.add(j+1);
            }
            list.add(arr);
        }
        return list;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading staircase height
        System.out.print("enter staircase height: ");
        int rows = sc.nextInt();

        // * creating muneric stairacse pattern
        System.out.println(solve(rows));
    }
}
