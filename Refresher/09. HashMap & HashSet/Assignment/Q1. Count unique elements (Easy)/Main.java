// # Problem Description
// * You are given an array A of N integers.
// * Return the count of elements with frequncy 1 in the given array.

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
// * 1

// ! Explanantion
// * Only the element 4 has a frequency 1.

// $ Input 2
// * A = [3, 3, 3, 9, 0, 1, 0]

// $ Output 2
// * 2

// ! Explanantion
// * The elements 9 and 1 has a frequncy 1.

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static int[] readArray(Scanner sc) {
        System.out.print("enter size of array: ");
        int length = sc.nextInt();

        int[] arr = new int[length];
        System.out.print("enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int solve(int[] A) {
        // * using a hashmap to keep track of frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // * forming a hashmap with elements as keys and frequencyas value
        for (int element : A) {
            if (!map.containsKey(element)) {
                map.put(element, 1);
            } else {
                int count = map.get(element);
                count++;
                map.put(element, count);
            }
        }

        // * iterating hashmap to find elements with frequency 1
        int count = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read array input
        int[] arr = readArray(sc);

        // * counting unique elements
        System.out.println("no of unique elements: " + solve(arr));
    }
}
