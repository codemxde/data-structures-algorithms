// # Problem Description
// * Given an integer array A containing N distinct integers,
// * you have to find all the leaders in array A.
// * An element is a leader if it is strictly greater
// * than all the elements to its right side.

// # NOTE:
// * The rightmost element is always a leader.

// # Problem Constraints
// * 1 <= N <= 10^5
// * 1 <= A[i] <= 10^8

// # Input Format
// * There is a single input argument which a integer array A

// # Output Format
// * Return an integer array denoting all the leader elements of the array.

// # Example
// $ Input 1
// * A = [16, 17, 4, 3, 5, 2]

// $ Output 1
// * [17, 2, 5]

// ! Explanantion
// * Element 17 is strictly greater than all the elements on the right side to it.
// * Element 2 is strictly greater than all the elements on the right side to it.
// * Element 5 is strictly greater than all the elements on the right side to it.
// * So we will return these three elements i.e [17, 2, 5], we can also return
// * [2, 5, 17] or [5, 2, 17] or any other ordering.

// $ Input 2
// * A = [5, 4]

// $ Output 2
// * [5, 4]

// ! Explanantion
// * Element 5 is strictly greater than all the elements on the right side to it.
// * Element 4 is strictly greater than all the elements on the right side to it.
// * So we will return these two elements i.e [5, 4], we can also any other ordering.

import java.util.ArrayList;
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
        System.out.println();
        return arr;
    }

    public static void reverseArray(int[] leaderArr, ArrayList<Integer> arr) {
        int N = arr.size();
        for (int i = 0; i < leaderArr.length; i++) {
            leaderArr[i] = arr.get(N - 1 - i);
        }
    }

    public static int[] solve(int[] A) {
        // * list to dynamically add leaders
        ArrayList<Integer> arr = new ArrayList<>();

        // * the last element of an array is alwas a leader
        int N = A.length;
        int leader = A[N - 1];
        arr.add(leader);


        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] > leader) {
                leader = A[i];
                arr.add(leader);
            }
        }

        // * reverse the list
        int[] leaderArr = new int[arr.size()];
        reverseArray(leaderArr, arr);

        return leaderArr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read array input
        int[] arr = readArray(sc);

        // * find leaders in an array
        System.out.println("leaders of the array: " + Arrays.toString(solve(arr)));
    }
}
