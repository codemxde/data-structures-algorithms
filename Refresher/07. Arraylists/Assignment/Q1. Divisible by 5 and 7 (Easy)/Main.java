// # Problem Description
// * Write a program that returns the list of elements
// * that are present in the given list and are divisible by 5 and 7.

// # Problem Constraints
// * 1 <= A.size() <= 105
// * 1 <= A[i] <= 105

// # Input Format
// * The only argument is an Integer Array A.

// # Output Format
// * Return an Integer Array, denoting the elements that are
// * divisible by 5 and 7 from the given list.

// # Example
// $ Input 1
// * A = [5, 7, 70, 50, 35]

// $ Output 1
// * [70, 35]

// ! Explanantion
// * Only 35 and 70 are divisible by 5 and 7 from the list [5, 7, 70, 50, 35]
// * Therefore the list consisting of only these two elements is returned.

// $ Input 2
// * A = [105, 57]

// $ Output 2
// * [105]

// ! Explanantion
// * 105 is divisible by (5 and 7).

import java.util.ArrayList;
import java.util.List;
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

    public static List<Integer> divisible(List<Integer> A) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (Integer integer : A) {
            if (integer % 5 == 0 && integer % 7 == 0) {
                arr.add(integer);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        
        // * Reading ArrayList from User Input
        readArrayList(arr, sc);

        // * Checking Divisibility by 5 and 7 and returning new ArrayList
        System.out.println("divisible elements: " + divisible(arr));
    }
}