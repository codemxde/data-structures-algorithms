// # Problem Description
// * Given an array of integers A and an integer B,
// * find and return the minimum number of swaps required
// * to bring all the numbers less than or equal to B together.

// # Note:
// * It is possible to swap any two elements, not necessarily consecutive.

// # Problem Constraints
// * 1 <= length of the array <= 100000
// * -10^9 <= A[i], B <= 10^9

// # Input Format
// * The first argument given is the integer array A.
// * The second argument given is the integer B.

// # Output Format
// * Return the minimum number of swaps.

// # Example
// $ Input 1
// * A = [1, 12, 10, 3, 14, 10, 5]
// * B = 8

// $ Output 1
// * 2

// ! Explanantion
// * A = [1, 12, 10, 3, 14, 10, 5]
// * After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
// * After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
// * Now, all elements less than or equal to 8 are together.

// $ Input 2
// * A = [5, 17, 100, 11]
// * B = 20

// $ Output 2
// * 1

// ! Explanantion
// * A = [5, 17, 100, 11]
// * After swapping 100 and 11, A => [5, 17, 11, 100].
// * Now, all elements less than or equal to 20 are together.

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
    public static int readInteger(Scanner sc) {
        System.out.print("enter integer to find lesser numbers: ");
        return sc.nextInt();
    }

    public static int solve(int[] A, int B) {
        // # Approach
        // * Refer to PDF 'Approach' listed under the
        // * same directory for detailed break down

        // * checking edge case
        if (A.length == 1) {
            return 0;
        }

        // * calculate total numbers less than B
        int numersLessThanB = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= B) numersLessThanB++;
        }

        // * counting 'bad numbers' in the first window
        int badNumbers = 0;
        int startIndex = 0;
        while (startIndex < numersLessThanB) {
            if (A[startIndex] > B) badNumbers++;
            startIndex++;
        }

        // * sliding window and carry forwarding lowest bad number count
        startIndex = 1;
        int endIndex = numersLessThanB;
        int minSwaps = badNumbers;

        while (endIndex < A.length) {
            // * if previous number was bad, we now have one less bad number
            if (A[startIndex - 1]  > B) {
                badNumbers--;
            }
            // * if incoming number is bad, we now have one more bad number
            if (A[endIndex] > B) {
                badNumbers++;
            }

            // * now that both previous and new elemnts have been judged
            // * we can keep check for window with the least bad numbers
            minSwaps = badNumbers < minSwaps ? badNumbers : minSwaps;
            
            startIndex++;
            endIndex++;
        }

        return minSwaps;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * reading array input
        int[] A = readArray(sc);

        // * reading integer to compare sum with
        int B = readInteger(sc);

        // * finding first index of subarray with length B and least average
        System.out.println("\nminimum number of swaps required: " + solve(A, B));
    }
}
