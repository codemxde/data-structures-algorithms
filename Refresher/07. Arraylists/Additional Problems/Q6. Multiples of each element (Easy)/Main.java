// # Problem Description
// * Given 2 arrays of integers A and B
// * Return a 2D array of integers such that i-th row
// * of the array contains list of values in A such that
// * A[j]%B[i]==0 in A in sequential order

// # Problem Constraints
// * 1 <= |A| <= 103
// * 1 <= |B| <= 103
// * 1 <= A[i] <= 105
// * 1 <= B[i] <= 105

// # Input Format
// * The two arguments A and B are array of integers.

// # Output Format
// * Return a 2D array of integers.

// # Example
// $ Input 1
// * A = [1, 2, 3, 4]
// * B = [1, 2]

// $ Output 1
// * [ [1, 2, 3, 4 ], [ 2, 4] ]

// ! Explanantion
// * The elements that are multiples of 1 are [1, 2, 3, 4] and elements
// * that are multiples of 2 are [2, 4].

// $ Input 2
// * A = [2, 5, 9, 3, 8]
// * B = [3, 2]

// $ Output 2
// * [ [9, 3 ], [ 2, 8] ]

// ! Explanantion
// * The elements that are multiples of 3 are [9, 3] and elements
// * that are multiples of 2 are [2, 8].

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void readArrayList(ArrayList<Integer> arr, Scanner sc, String msg) {
        System.out.print("\nenter arraylist size for " + msg + ": ");
        int size = sc.nextInt();

        System.out.print("enter elements: ");
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < B.size(); i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) % B.get(i) == 0) {
                    arr.add(A.get(j));
                }
            }
            list.add(arr);
        }
        return list;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        
        // * reading arraylist input
        readArrayList(A, sc, "A");
        readArrayList(B, sc, "B");

        // * calculating mu;tiples of each element
        System.out.println("\narraylist of multiples: " + solve(A, B));

    }
}
