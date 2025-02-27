import java.util.Scanner;

public class Main {

    public static int[] readArray(Scanner sc) {
        System.out.print("enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("enter elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int readInteger(Scanner sc) {
        System.out.print("\nenter integer: ");
        return sc.nextInt();
    }

    public static int findMinimumSwaps(int[] A, int B) {
        // *  goodNums is our window size
        int goodNumbers = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= B) goodNumbers++;
        }

        // * calculate badNums in first window
        int badNumbers = 0;
        for (int i = 0; i < goodNumbers; i++) {
            if (A[i] > B) badNumbers++;
        }

        int minSwaps = badNumbers;
        int startIndex = 1;
        int endIndex = goodNumbers;
        while (endIndex < A.length) {
            if (A[startIndex - 1] > B) badNumbers--;
            if (A[endIndex] > B) badNumbers++;

            if (badNumbers < minSwaps) minSwaps = badNumbers;

            startIndex++;
            endIndex++;
        }
        return minSwaps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = readArray(sc);
        int B = readInteger(sc);

        System.out.println("\nminimum swaps required: " + findMinimumSwaps(arr, B));
    }
}