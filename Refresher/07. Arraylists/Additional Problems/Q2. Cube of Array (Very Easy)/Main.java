// # Problem Description
// * You are provided with an integer array A.
// * Return another array B of size same as that of A
// * such that B[i] = A[i]3 for 1 <= i <= |A| (1 based indexing).

// # Problem Constraints
// * 1 <= |A| <= 10^6
// * 1 <= A[i] <= 10^6

// # Input Format
// * The first and only argument is an integer array A.

// # Output Format
// * Return array B.

// # Example
// $ Input 1
// * A = [2, 6, 8, 1]

// $ Output 1
// * [8, 216, 512, 1]

// ! Explanantion
// *  Cubes of numbers 2, 6, 8 and 1 are 8, 216, 512 and 1 respectively

// $ Input 2
// * A = [5]

// $ Output 2
// * [125]

// ! Explanantion
// * Cubes of number 5 is 125.

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

    public static ArrayList<Long> solve(ArrayList<Integer> A) {
        ArrayList<Long> arr = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            long ele = A.get(i);
            arr.add(ele*ele*ele);
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        
        // * reading arraylist input
        readArrayList(arr, sc);

        // * calculating cube of arraylist
        System.out.println("cubed arraylist: " + solve(arr));
    }
}
