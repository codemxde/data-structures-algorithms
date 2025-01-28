import java.util.Scanner;

public class Main {

    public static void endOfSegment() {
        System.out.println("---------------------------------------");
    }

    public static int[] readArrayInput(Scanner sc) {
        System.out.print("enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("enter elemnts: ");
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
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // # Q1. Count 'a-g' pairs
        count_a_g_pairs(sc);
    }
}