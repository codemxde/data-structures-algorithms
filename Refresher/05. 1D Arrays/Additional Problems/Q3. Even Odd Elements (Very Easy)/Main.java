// # Problem Description
// * You are given T(number of test cases) integer arrays.
// * For each array A, you have to find the value of
// * absolute difference between the counts of even and odd elements in the array.

// # Problem Constraints
// * 1 <= T <= 10
// * 1 <= |A| <= 10^5
// * 1 <= A[i] <= 10^9


// # Input Format
// * First line contains a single integer T.
// * Each of the next T lines begin with an integer denoting
// * the length of the array A (|A|), followed by |A| integers
// * which indicate the elements in the array.

// # Output Format
// * For each test case, print an integer in a separate line.

// # Example
// $ Input 1
// * 1 
// * 4 1 2 3 4 

// $ Output 1
// * 0

// ! Explanantion
// * For 1st test case: 
// * The array is [1, 2, 3, 4].
// * Number of even elements = 2 
// * Number of odd elements = 2
// * |Number of even elements - Number of odd elements| = |2 - 2| = 0 

// $ Input 2
// * 2
// * 4 2 3 5 1
// * 1 4

// $ Output 2
// * 2
// * 1

// ! Explanation
// *  For 1st test case:
// * The array is [2, 3, 5, 1].
// * Number of even elements = 1 
// * Number of odd elements = 3
// * |Number of even elements - Number of odd elements| = |1 - 3| = |-2| = 2.

// * For 2nd test case:
// * The array is [4]
// * Number of even elements = 1 
// * Number of odd elements = 0
// * |Number of even elements - Number of odd elements| = |1 - 0| = |1| = 1 

import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void printAbsoluteDifference(int[] arr) {
        int odd = 0;
        int even = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(even > odd ? even - odd : odd - even);
    }

    public static void iterateTestcases(int testcases, Scanner sc) {
        for (int i = 0; i < testcases; i++) {
            int arrayLength = sc.nextInt();
            int[] arr = new int[arrayLength];

            readArrayInput(arr, sc);
            // # For more readable code
            printAbsoluteDifference(arr);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();

        iterateTestcases(testcases, sc);
    }
}
