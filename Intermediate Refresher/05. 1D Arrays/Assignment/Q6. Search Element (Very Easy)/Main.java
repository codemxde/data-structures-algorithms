// # Problem Description
// * You are given an integer T (number of test cases).
// * You are given array A and an integer B for each test case.
// * You have to tell whether B is present in array A or not.

// # Problem Constraints
// * 1 <= T <= 10
// * 1 <= A <= 105
// * 1 <= A[i], B <= 109


// # Input Format
// * First line of the input contains number of test cases as single integer T .
// * Next, each of the test case consists of 3 lines:
// * First line contains a single integer A denoting the length of array
// * Second line contains A integers denoting the array elements
// * Third line contains a single integer B

// # Output Format
// * For each test case, print on a separate line
// * 1 if the element exists, else print 0.

// # Example
// $ Input 1
// * 1 
// * 5 
// * 4 1 5 9 1
// * 5

// $ Output 1
// * 1

// $ Input 2
// * 1
// * 3 
// * 7 7 2
// * 1 

// $ Output 2
// * 0

import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void checkElementExists(int[] arr, int findElement) {
        boolean isPresent = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findElement) {
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent ? 1 : 0);
    }

    public static void iterateTestcases(int testCases, Scanner sc) {
        for (int i = 0; i < testCases; i++) {
            int arrayLength = sc.nextInt();
            int[] arr = new int[arrayLength];
            readArrayInput(arr, sc);

            int findElement = sc.nextInt();
            checkElementExists(arr, findElement);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        iterateTestcases(testCases, sc);
    }
}
