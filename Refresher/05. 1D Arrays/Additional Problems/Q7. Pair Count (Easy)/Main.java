// # Problem Description
// * You are given an integer array A and an integer B.
// * You are required to return the count of pairs having sum equal to B.

// # NOTE
// * pair (i,j) and (j,i) are same.

// # Problem Constraints
// * 1 <= A.size() <= 10000
// * 1 <= A[i] <= 10000
// * 1 <= B <= 10000


// # Input Format
// * First argument is an integer array A.
// * Second argument is an integer B.

// # Output Format
// * You have to return an integer representing count of required pairs.

// # Example
// $ Input 1
// * A = [1,2,3,2,1]
// * B = 5

// $ Output 1
// * 2

// ! Explanantion
// * A[1]+A[2] = A[2]+A[3] = 5

// $ Input 2
// * A = [1,1,1]
// * B = 2

// $ Output 2
// * 3

// ! Explanantion
// * A[0]+A[1] = A[0]+A[2] = A[1]+A[2] = 2

import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int solve(int[] A, int B) {
        int pairs = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] + A[j] == B) {
                    pairs++;
                }
            }
        }
        return pairs;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];

        readArrayInput(arr, sc);
        
        int sum = sc.nextInt();
        System.out.println(solve(arr, sum));
    }
}
