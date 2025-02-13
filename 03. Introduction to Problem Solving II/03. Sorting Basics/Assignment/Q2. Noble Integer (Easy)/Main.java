// # Problem Description
// * Given an integer array A, find if an integer p
// * exists in the array such that the number of
// * integers greater than p in the array equals p.

// # Problem Constraints
// * 1 <= |A| <= 2*10^5
// * -10^8 <= A[i] <= 10^8

// # Input Format
// * First and only argument is an integer array A.

// # Output Format
// * Return 1 if any such integer p is present else, return -1

// # Example
// $ Input 1
// * A = [3, 2, 1, 3]

// $ Output 1
// * 1

// ! Explanation
// * For integer 2, there are 2 greater elements in the array..

// $ Input 2
// * A = [1, 1, 3, 3]

// $ Output 2
// * -1

// ! Explanantion
// * There exist no integer satisfying the required conditions.

import java.util.Arrays;
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
        return arr;
    }

    public static void sortArrayDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (arr[j+1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void reverseArray(int[] arr) {
        int si = 0, ei = arr.length - 1;

        while (si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

    public static int solve(int[] A) {
        // sortArrayDescending(A);
        Arrays.sort(A);
        reverseArray(A);
        
        // * edge case
        if (A[0] == 0) return 1;

        int countBigger = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i-1]) countBigger = i;
            if (A[i] == countBigger) return 1;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read input array
        int[] arr = readArray(sc);
        
        // * find number of noble of integers
        System.out.println("total noble integers: " + solve(arr));
    }
}
