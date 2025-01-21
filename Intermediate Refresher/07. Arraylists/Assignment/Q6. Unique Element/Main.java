// # Problem Description
// * Given an Array of integers A, every element in it
// * is repeated twice except one, find that unique element.

// # Problem Constraints
// * 1<= Length of array A <= 10^3
// * 0<= Ai <=1000

// # Input Format
// * First argument A is the given array.

// # Output Format
// * Return an Integer X, such that X occurs once in the A.

// # Example
// $ Input 1
// * A = [1, 4, 3, 5, 2, 3, 5, 1, 4]

// $ Output 1
// * 2

// ! Explanantion
// * In Example 1:
// * All the elements except for 2 occurs twice in the array.
// * Hence 2 is the unique element.

// $ Input 2
// * A = [9, 10, 7, 10, 9, 1, 5, 1, 5]

// $ Output 2
// * 7

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void readArrayList(ArrayList<Integer> arr, Scanner sc) {
        System.out.print("enter size of arraylist: ");
        int size = sc.nextInt();

        System.out.print("enter elements: ");
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
    }

    public static int countFrequency(int element, ArrayList<Integer> arr) {
        int frequency = 0;
        for (Integer integer : arr) {
            if (integer == element) {
                frequency++;
            }
        }
        return frequency;
    }

    public static int solve(ArrayList<Integer> A) {
        int uniqueElement = 0;
        for (Integer integer : A) {
            if (countFrequency(integer, A) == 1) {
                uniqueElement = integer;
            }
        }
        return uniqueElement;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        // * reading arraylist input
        readArrayList(arr, sc);

        // * finding unique element
        System.out.println("unique element: " + solve(arr));
    }
}
