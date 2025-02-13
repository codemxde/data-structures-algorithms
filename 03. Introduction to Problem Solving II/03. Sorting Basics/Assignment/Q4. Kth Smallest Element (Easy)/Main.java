// # Problem Description
// * Find the Bth smallest element in given array A .

// # NOTE:
// * Users should try to solve it in less than equal to B swaps.

// # Problem Constraints
// * 1 <= |A| <= 100000
// * 1 <= B <= min(|A|, 500)
// * 1 <= A[i] <= 109

// # Input Format
// * The first argument is an integer array A.
// * The second argument is integer B.

// # Output Format
// * Return the Bth smallest element in given array.

// # Example
// $ Input 1
// * A = [2, 1, 4, 3, 2]
// * B = 3

// $ Output 1
// * 2

// ! Explanation
// * 3rd element after sorting is 2.

// $ Input 2
// * A = [1, 2]
// * B = 2

// $ Output 2
// * 2

// ! Explanantion
// * 2nd element after sorting is 2.

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

    public static int kthsmallest(final int[] A, int B) {
        for (int i = 0; i < B; i++) {
            int minEle = A[i];
            int minIndex = i;
            for (int j = i+1; j < A.length; j++) {
                if (A[j] < minEle) {
                    minEle = A[j];
                    minIndex = j;
                }
            }
            int temp = A[i];
            A[i] = minEle;
            A[minIndex] = temp;
        }
        return A[B-1];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read input array
        int[] arr = readArray(sc);

        // * read B
        System.out.print("enter B: ");
        int B = sc.nextInt();
        
        // * find the kth smallest element
        System.out.println(B + "th smallest integer: " + kthsmallest(arr, B));
    }
}
