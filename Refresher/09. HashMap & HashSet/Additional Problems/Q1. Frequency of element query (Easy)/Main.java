// # Problem Description
// * SCALER organizes a series of contests aimed at helping
// * learners enhance their coding skills.
// * Each learner can participate in multiple contests,
// * and their participation is represented by integers in an array.
// * The goal is to identify how frequently each learner has
// * participated in these contests.
// * This information will help SCALER determine which learners are
// * participating the least, allowing them
// * to provide targeted support and encouragement.

// * Given an array A that represents the participants of various contests,
// * where each integer corresponds to a specific learner, and an array B
// * containing the learners for whom you want to check participation frequency,
// * your task is to find the frequency of each learner from array B in the array A
// * and return a list containing all these frequencies

// # Problem Constraints
// * 1 <= |A| <= 10^5
// * 1 <= |B| <= 10^5
// * 1 <= A[i] <= 10^5
// * 1 <= B[i] <= 10^5

// # Input Format
// * First argument A is an array of integers.
// * Second argument B is an array of integers denoting the queries.

// # Output Format
// * Return an array of integers containing the frequency
// * of each learner in B as found in array A.

// # Example
// $ Input 1
// * A = [1, 2, 1, 1]
// * B = [1, 2]

// $ Output 1
// * [3, 1]

// ! Explanantion
// * The frequency of learner 1 in the array A is 3
// * (they participated in three contests).
// * The frequency of learner 2 in the array A is 1
// * (they participated in one contest).

// $ Input 2
// * A = [2, 5, 9, 2, 8]
// * B = [3, 2]

// $ Output 2
// * [0, 2]

// ! Explanantion
// * The frequency of learner 3 in the array A is 0
// * (they did not participate in any contest).
// * The frequency of learner 2 in the array A is 2
// * (they participated in two contests).

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void readArraylist(ArrayList<Integer> arr, Scanner sc, String msg) {
        System.out.println(msg + "\n");

        System.out.print("enter list size: ");
        int size = sc.nextInt();

        System.out.print("enter elements: ");
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println();
    }

    public static void mapElementsWithFrequency(HashMap<Integer, Integer> map, ArrayList<Integer> arr) {
        for (Integer element : arr) {
            if (!map.containsKey(element)) {
                map.put(element, 1);
            } else {
                int frequency = map.get(element);
                map.put(element, frequency+1);
            }
        }
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        // * arraylist for storing frequency of elements
        ArrayList<Integer> arr = new ArrayList<>();

        // * hashmap to map elements with their frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // * creating a hashmap of frequencies
        mapElementsWithFrequency(map, A);

        // * iterating over arraylist B to fetch corresponding frequencies
        for (Integer element : B) {
            if (map.containsKey(element)) {
                arr.add(map.get(element));
            } else {
                arr.add(0);
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        // * reading both arraylists
        readArraylist(A, sc, "ArrayList A:");
        readArraylist(B, sc, "ArrayList B:");

        // * creating a frequency of element query
        System.out.println("frequency list: " + solve(A, B));
    }
}

// * 13gulwoodz@gmail.com
// * 031100@Dm // wrong pass
// * 13metumera