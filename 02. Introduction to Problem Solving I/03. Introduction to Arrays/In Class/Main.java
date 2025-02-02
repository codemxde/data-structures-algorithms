import java.util.Scanner;

public class Main {

    public static void endOfSegment() {
        System.out.println("---------------------------------------------------");
    }

    public static int[] readArrayIpnut(Scanner sc) {
        System.out.print("Enter size of array: ");
        int length = sc.nextInt();

        // * initialising an array
        int[] arr = new int[length];

        // * reading inputs
        System.out.print("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        endOfSegment();
        return arr;
    }

    public static void printArrayElements(String msg, int[] arr) {
        System.out.println(msg);
        
        System.out.print("Elements: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i < arr.length - 1 ? arr[i] + ", " : arr[i] + "]\n");
        }
        endOfSegment();
    }

    public static void reverseArray(int[] arr) {
        System.out.println("CONCEPT: Q2. Reverse the given array\n");

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        printArrayElements("", arr);
    }

    public static void reverseArrayPartially(int[] arr, Scanner sc) {
        System.out.println("CONCEPT: Q3. Reverse part of an array\n");

        System.out.print("Enter starting index: ");
        int startIndex = sc.nextInt();
        System.out.print("Enter ending index: ");
        int endIndex = sc.nextInt();

        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;

            startIndex++;
            endIndex--;
        }
        printArrayElements("", arr);
    }

    public static void rotateArrayBruteForce(int[] arr, Scanner sc) {
        System.out.println("CONCEPT: Q4. Rotate an array by an integer K\n");
        System.out.println("1. Brute Force Approach");

        System.out.print("Enter K: ");
        int K = sc.nextInt();

        // # Thought Process
        // * We need to save the value of the current last element
        // * Then, shift all the indexes from start, one position towards right
        // * Set the value of first element as saved value of previously last element

        // * With this one rotation has been observed

        // * We need to repeat this process 'K' times to ensure rotation by 'K' times

        int length = arr.length;

        // * Rotating array 'K' times
        for (int i = 0; i < K; i++) {
            int last = arr[length - 1];
            for (int j = length - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = last;
        }
        printArrayElements("", arr);
    }

    public static void reverseIt(int startIndex, int endIndex, int[] arr) {
        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;

            startIndex++;
            endIndex--;
        }
    }

    public static void rotateArray(int[] arr, Scanner sc) {
        // # Thought Process
        // * K = K % N, as after K = N, the arrays representaion start repeating
        // * STEP 1: Reverse the entire array
        // * STEP 2: Separately reverse first K elememnts
        // * STEP 3: Finally, separately reverse remaning N-K elements

        System.out.println("2. OPTIMIZED APPROACH");
        System.out.print("Enter K: ");
        int K = sc.nextInt() % arr.length;

        // * Reversing the entire array
        reverseIt(0, arr.length - 1, arr);

        // * Reversing first 'K' elements
        reverseIt(0, K - 1, arr);

        // * Reversing remaning elements from index 'K' till 'N-1'
        reverseIt(K, arr.length - 1, arr);
        
        printArrayElements("", arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * Declarin and Initialising reusabe array
        int[] arr = readArrayIpnut(sc);

        // # Q1. Print all elements of the array
        printArrayElements("Q1. Print all elements of the array\n", arr);

        // # CONCEPT: Q2. Reverse the given array
        reverseArray(arr);

        // # CONCEPT: Q3. Reverse part of an array
        reverseArrayPartially(arr, sc);

        // # CONCEPT: Q4. Rotate an array by an integer K
        rotateArrayBruteForce(arr, sc);
        rotateArray(arr, sc);
    }
}