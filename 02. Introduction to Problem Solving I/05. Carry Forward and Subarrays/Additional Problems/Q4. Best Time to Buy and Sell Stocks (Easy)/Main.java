// # Problem Description
// * Say you have an array, A, for which the ith element is
// * the price of a given stock on day i.
// * If you were only permitted to complete at most one transaction
// * (ie, buy one and sell one share of the stock), design
// * an algorithm to find the maximum profit.

// * Return the maximum possible profit.

// # NOTE:
// * The rightmost element is always a leader.

// # Problem Constraints
// * 0 <= A.size() <= 700000
// * 1 <= A[i] <= 10^7

// # Input Format
// * The first and the only argument is an array of integers, A.

// # Output Format
// * Return an integer, representing the maximum possible profit.

// # Example
// $ Input 1
// * A = [1, 2]

// $ Output 1
// * 1

// ! Explanantion
// * Buy the stock on day 0, and sell it on day 1.

// $ Input 2
// * A = [1, 4, 5, 2, 4]

// $ Output 2
// * 4

// ! Explanantion
// * Buy the stock on day 0, and sell it on day 2.

import java.util.Scanner;

public class Main {

    public static int[] readArray(Scanner sc) {
        System.out.print("enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        return arr;
    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int maxProfit(final int[] A) {
        // # Approach
        // * carry forward the min elemnt
        // * whenever you find a non-min element, calculate the difference
        // * and keep on updating the maximum difference

        // * handling edge case, for empty array
        if (A.length == 0) {
            return 0;
        }

        int min = A[0];
        int maximumProfit = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            } else if (A[i] - min > maximumProfit) {
                maximumProfit = A[i] - min;
            }
        }
        return maximumProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading stocks aray
        int[] stocks = readArray(sc);

        // * calculate maximum profit 
        System.out.println("maximum profit achiebavle: " + maxProfit(stocks));
    }
}