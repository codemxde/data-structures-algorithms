// # Problem Description
// * You are given an integer array A, you have to
// * return an integer array of same size whose ith element
// * is the frequency count of A[i] in array A .

// # Note:
// * When comparing two elements of the ArrayList(java),
// * make sure to use .equals() method for accurate comparison.
// * Eg : To compare ith index with jth index use A.get(i).equals(A.get(j)).

// # Problem Constraints
// * 1 <= len(A) <= 1000
// * 1 <= A[i] <= 100

// # Input Format
// * First argument is an array of integers representing array A.

// # Output Format
// * You have to return an array of integers as per the question.

// # Example
// $ Input 1
// * A = [1, 2, 5, 1, 5, 1]

// $ Output 1
// * [3, 1, 2, 3, 2, 3]

// ! Explanantion
// * Clearly, In the given array we have
// * 1 three times, 2 one time and 5 two times.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void readArrayList(ArrayList<Integer> arr, Scanner sc) {
        System.out.print("enter arraylist size: ");
        int size = sc.nextInt();

        System.out.print("enter elements: ");
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
    }

    public static int countFrequency(int element, ArrayList<Integer> A) {
        int count = 0;
        for (Integer integer : A) {
            if (integer == element) {
                count++;
            }
        }
        return count;
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (Integer integer : A) {
            arr.add(countFrequency(integer, A));
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        
        // * reading arraylist input
        readArrayList(arr, sc);

        // * count frequency of elements in an arraylist
        System.out.println("frequency arraylist: " + solve(arr));
    }
}
