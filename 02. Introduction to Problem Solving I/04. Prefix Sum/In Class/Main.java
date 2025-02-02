// # Before we start
// * Prefix Sum Array is an array which stores the accumulated sum
// * of all the elemnst up till each index of the original array

// $ pSum[i] = a[0] + a[1] + a[2] + ... + a[i]

// $ Array = [1, 2, 3, 4, 5]
// $ pSum = [1, 3, 6, 10, 15]

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void endOfSegment() {
        System.out.println("----------------------------------------------------");
    }

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

    public static int[][] createMatrix(Scanner sc) {
        System.out.print("enter no of rows in query: ");
        int rows = sc.nextInt();

        int[][] arr = new int[rows][2];

        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print("enter L and R for row " + (i + 1) + ": ");
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        return arr;
    }

    public static void printQuestionStatement(String msg) {
        System.out.println(msg + "\n");
    }

    public static void calculateSumInRange(String str, int[][] queries, int[] pSum) {
        for (int i = 0; i < queries.length; i++) {
            int leftIndex = queries[i][0];
            int rightIndex = queries[i][1];

            int sumInRange = 0;
            if (leftIndex == 0) {
                sumInRange = pSum[rightIndex];
            } else {
                sumInRange = pSum[rightIndex] - pSum[leftIndex - 1];
            }
            System.out.println(str + leftIndex + " to " + rightIndex + ": " + sumInRange);
        }
    }

    public static void solveQuestionOne(Scanner sc) {
        // * Given an array of N integers and Q queries.
        // * For each query calculate thesum of elements in the range - [ L , R ]
        // ! Note: L and R are indices such that L ≤ R.
        // $ Constraints : 1 ≤ N, Q ≤ 10^5

        // * declaring question in console
        endOfSegment();
        printQuestionStatement("Q1. Given an array of N integers and Q queries.\nFor each query calculate thesum of elements in the range - [ L , R ]");

        // * read array input
        int[] arr = readArray(sc);

        // * creating a queries 2D-matrix
        int[][] queries = createMatrix(sc);

        // * creating prefix-sum array from original array
        int[] pSum = new int[arr.length];
        pSum[0] = arr[0];

        for (int i = 1; i < pSum.length; i++) {
            pSum[i] = arr[i] + pSum[i - 1];
        }

        // * calculating sum of elements in query range
        calculateSumInRange("Sum in range ", queries, pSum);
        endOfSegment();
    }

    public static void createPrefixSumFromOriginalArray(Scanner sc) {
        System.out.println("Concept: Modification of original aray into prefix-sum\n");

        // * reading array
        int[] arr = readArray(sc);

        System.out.println("original array: " + Arrays.toString(arr));

        // * creating pSum in original array
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        System.out.println("modified prefix-sum array: " + Arrays.toString(arr));
        endOfSegment();
    }

    public static void solveQuestionTwo(Scanner sc) {
        // * Given an arr[N] and Q queries with start(s) and end(e) index.
        // * For every query print sum of all even indexed elements from s to e.

        printQuestionStatement("Q2. Given an arr[N] and Q queries with start(s) and end(e) index.\nFor every query print sum of all even indexed elements from s to e.");
        
        // * reading array
        int[] arr = readArray(sc);

        // * creating a query matrix
        int[][] queries = createMatrix(sc);

        // # Sum of even indexed element from L to R
        // * Firstly, we create a prefix sum array, where we only
        // * sum the even indexed elements
        // * At the odd indexes, we can store the previous index element.

        // * Creating even prefix sum array
        int[] evenSum = new int[arr.length];
        evenSum[0] = arr[0];

        for (int i = 1; i < evenSum.length; i++) {
            if (i % 2 == 0) {
                evenSum[i] = arr[i] + evenSum[i - 1];
            } else {
                evenSum[i] = evenSum[i - 1];
            }
        }
        System.out.println("even prefix sum array: " + Arrays.toString(evenSum) + "\n");

        // * calculating even indexed sum in matrix range
        calculateSumInRange("even sum in range: ", queries, evenSum);
        endOfSegment();
    }
    
    public static void solveQuestionThree(Scanner sc) {
        // # Questionnaire
        // * For all the queries, find the
        // * sum of odd indexed elements from s to e. 
        
        printQuestionStatement("Q3. For all the queries, find the sum of odd indexed elements from s to e.");

        // * read array
        int[] arr = readArray(sc);

        // * create query matrix
        int[][] queries = createMatrix(sc);

        // # Sum of Odd Indexed Elements from L to R
        // * Similar to the even based approach, we keep on
        // * summing the odd indexed elements.
        // * At even indices, we simply store the previous index element

        // * creating odd-prefix sum array
        int[] oddSum = new int[arr.length];
        oddSum[0] = 0; // as this index will never contribute in any sum range

        for (int i = 1; i < oddSum.length; i++) {
            if (i % 2 == 1) {
                oddSum[i] = arr[i] + oddSum[i - 1];
            } else {
                oddSum[i] = oddSum[i - 1];
            }
        }
        System.out.println("odd prefix sum array: " + Arrays.toString(oddSum) + "\n");

        // * calculating odd indexed sum in matrix range
        calculateSumInRange("odd sum in range ", queries, oddSum);
        endOfSegment();
    }

    public static void countSpecialIndexes(Scanner sc) {
        // * Given an arr[N], count the number of special indices in the array. 
        // # Special Index
        // * Index after removing which,
        // * Sum of even indexed elements = Sum of odd indexed elements. 

        printQuestionStatement("Q4. Given an arr[N], count the number of special indices in the array");

        // * read array
        int[] arr = readArray(sc);
        int N = arr.length;
        
        // * creating prefix-sum even
        int[] pSumEven = new int[N];
        pSumEven[0] = arr[0];

        for (int i = 1; i < N; i++) {
            if (i % 2 == 0) {
                pSumEven[i] = pSumEven[i - 1] + arr[i];
            } else {
                pSumEven[i] = pSumEven[i - 1];
            }
        }

        // * creating prefix-sum odd
        int[] pSumOdd = new int[N];
        pSumOdd[0] = 0;

        for (int i = 1; i < N; i++) {
            if (i % 2 == 1) {
                pSumOdd[i] = pSumOdd[i - 1] + arr[i];
            } else {
                pSumOdd[i] = pSumOdd[i - 1];
            }
        }

        // * count the special indexes
        int count = 0;
        
        // * handling edge case for i = 0
        if (pSumOdd[N - 1] == pSumEven[N - 1] - arr[0]) {
            System.out.println("found special index at i: 0");
            count++;
        }

        for (int i = 1; i < N; i++) {
            int sumOdd = pSumOdd[i - 1] + pSumEven[N - 1] - pSumEven[i];
            int sumEven = pSumEven[i - 1] + pSumOdd[N - 1] - pSumOdd[i];

            if (sumOdd == sumEven) {
                System.out.println("found special index at i = " + i);
                count++;
            }
        }
        System.out.println("\ntotal special indexes: " + count);
        endOfSegment();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // # Q1. Calculate Sum of Elements in range L to R
        solveQuestionOne(sc);

        // # Concept: Create Prefix Sum In Original Aray
        createPrefixSumFromOriginalArray(sc);
        
        // # Q2. Sum of Even indexed Elements
        solveQuestionTwo(sc);

        // # Q3. Sum of Odd Indexed Elements
        solveQuestionThree(sc);

        // # Q4: Special Index (Asked in Google)
        countSpecialIndexes(sc);
    }
}