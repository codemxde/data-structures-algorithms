// # Problem Description
// * Given an array A of N integers, return
// * the number of unique elements in the array.

// # Problem Constraints
// * 1 <= N <= 10^5
// * 1 <= A[i] <= 10^9

// # Input Format
// * First argument A is an array of integers.

// # Output Format
// * Return an integer.

// # Example
// $ Input 1
// * A = [3, 4, 3, 6, 6]

// $ Output 1
// * 3

// ! Explanantion
// * The distinct elements of the array are 3, 4 and 6.

// $ Input 2
// * A = [3, 3, 3, 9, 0, 1, 0]

// $ Output 2
// * 4

// ! Explanantion
// * The distinct elements of the array are 3, 9, 0 and 1.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void readArraylist(ArrayList<Integer> arr, Scanner sc) {
        System.out.print("enter list size: ");
        int size = sc.nextInt();

        System.out.print("enter elements: ");
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
    }

    public static int solve(ArrayList<Integer> A) {
        // * initialising a hashset for unique elements only
        HashSet<Integer> set = new HashSet<>();

        for (Integer integer : A) {
            set.add(integer);
        }
        return set.size();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        // * reading arraylist
        readArraylist(arr, sc);

        // * counting distinct elements
        System.out.println("no of distinct elements: " + solve(arr));
    }
}
