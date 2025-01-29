import java.util.Scanner;

public class Main {

    public static void endOfSegment() {
        System.out.println("----------------------------------------------------");
    }

    public static int[] readArrayInput(Scanner sc) {
        System.out.print("enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static String readString(Scanner sc) {
        System.out.print("enter string to count a-g pairs: ");
        return sc.next();
    }

    public static void count_a_g_pairs(Scanner sc) {
        // # Question
        // * Given a string s of lowercase characters, return the
        // * count of pairs (i, j) such that i < j and s[i]
        // * is 'a' and s[j] is 'g'.

        // # Approach
        // * Maintain two variables. One for counting 'a' instances
        // * and another variables that keeps track of total number
        // * of valid 'a-g' pairs
        // * Iterate the array, if the element is 'a', increase countA
        // * If the elemnt is 'g', add countA to the result itself

        System.out.println("Q1. Given a string s of lowercase characters, return the count of pairs (i, j)\nsuch that i < j and s[ i ] is 'a' and s[ j ] is 'g'.\n");

        // * read string
        String str = readString(sc);

        int countA = 0;
        int pairs = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                countA++;
            } else if (str.charAt(i) == 'g') {
                pairs += countA;
            }
        }
        System.out.println("no of a-g pairs: " + pairs);
        endOfSegment();
    }

    public static void printSubArrayElements(int[] arr, int startIndex, int endIndex) {
        System.out.print("\nsub array: [");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(i < endIndex ? arr[i] + ", " : arr[i] + "]\n");
        }
    }

    public static void printSubArray(Scanner sc) {
        System.out.println("Q2. Given an array, si and ei. Print from si to ei.\n");

        // * reading main array
        int[] arr = readArrayInput(sc);

        // * reading start and end index
        System.out.print("\nenter start index: ");
        int startIndex = sc.nextInt();
        System.out.print("enter end index: ");
        int endIndex = sc.nextInt();

        printSubArrayElements(arr, startIndex, endIndex);
        endOfSegment();
    }

    public static void printAllSubArrays(Scanner sc) {
        System.out.println("Q3. Print all the possible sub-arrays of the given array.\n");
        
        // * reading input array
        int[] arr = readArrayInput(sc);

        // * printing all possible sub arays
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                printSubArrayElements(arr, i, j);
            }
        }
        endOfSegment();
    }

    public static void smallestSubArray(Scanner sc) {
        System.out.println("Q4. Given an array of N integers, return the length of smallest subarray\nwhich contains both maximum and minimum elements of the array.\n");

        // * reading input array
        int[] arr = readArrayInput(sc);

        // * finding min and max element
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        // * handling edge case
        if (min == max) {
            System.out.println("\nlength of smallest sub-array with min and max element: 1");
            return;
        }

        // * finding closest min and max to each other
        int maxIndex = -1;
        int minIndex = -1;
        int answer = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                maxIndex = i;
                if (minIndex != -1 && (maxIndex - minIndex + 1) < answer) {
                    answer = maxIndex - minIndex + 1;
                }
            } else if (arr[i] == min) {
                minIndex = i;
                if (maxIndex != 1 && (minIndex - maxIndex + 1) < answer) {
                    answer = minIndex - maxIndex + 1;
                }
            }
        }

        System.out.println("\nlength of smallest sub-array with min and max element: " + answer);
        endOfSegment();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // # Q1. Count 'a-g' pairs
        // count_a_g_pairs(sc);

        // # Q2. Given an array, si and ei, Print from si to ei
        // printSubArray(sc);

        // # Q3. Print all the possible sub-arrays of the given array
        // printAllSubArrays(sc);

        // # Q4. Closest Min-Max Subarray
        smallestSubArray(sc);
    }
}