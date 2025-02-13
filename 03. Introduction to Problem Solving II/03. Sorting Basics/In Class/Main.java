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

    public static void endOfSegment() {
        System.out.println("********************************************************");
    }

    public static int countNobleIntegers(int[] arr) {
        System.out.println("Q1. Count the number of noble integers in an array");
        int countSmaller = 0;
        int nobleIntegers = 0;

        // * handling edge case
        if (arr[0] == 0) nobleIntegers++;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                countSmaller = i;
            }
            if (countSmaller == arr[i]) nobleIntegers++;
        }
        return nobleIntegers;
    }

    public static void selectionSort(Scanner sc) {
        // # Approach
        // * Iterate over each element. For each element, further
        // * iterate on the rest of the elements to find the minimum
        // * element. Once found, swap the min element with the current
        // * element. Keep repeating this patterm for each N-1 elements

        System.out.println("SELECTION SORT ALGORITHM\n");

        // * read new array
        int[] arr = readArray(sc);

        // * sorting the array using selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minEle = arr[i];
            int minIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < minEle) {
                    minIndex = j;
                    minEle = arr[j];
                } else {
                    break;
                }
            }

            int temp = arr[i];
            arr[i] = minEle;
            arr[minIndex] = temp;
        }
        System.out.println("\nSorted Array: " + Arrays.toString(arr));
    }

    public static void insertionSort (Scanner sc) {
        // # Approach
        // * Start from index 1, iterate all the way back and keep
        // * swapping till the element is at it's correct position
        // * Keep on repeating this behaviour untill the end of the array

        System.out.println("INSERTION SORT ALGORITHM\n");

        // * read new unsorted array
        int[] arr = readArray(sc);

        // * sorting the array
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j+1]) {
                    // * swap elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\nSorted Array: " + Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read array input
        int[] arr = readArray(sc); endOfSegment();

        // * Q1. Count the number of noble integers in an array
        System.out.println("total noble integers: " + countNobleIntegers(arr)); endOfSegment();

        // # Selection Sort Algorithm
        selectionSort(sc); endOfSegment();

        // # Insertion Sort Algorithm
        insertionSort(sc);
    }
}
