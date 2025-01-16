import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> storeInputRating(Scanner sc) {
        System.out.println("Q1. Keep taking integer input untill negative input is provided.\n");
        ArrayList<Integer> ratings = new ArrayList<>();
        while (true) {
            System.out.print("Enter Rating: ");
            int val = sc.nextInt();
            if (val < 0) {
                break;
            }
            ratings.add(val);
        }
        System.out.println();
        return ratings;
    }

    public static void printList(ArrayList<Integer> list) {
        System.out.print("\n[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i == list.size() - 1 ? list.get(i) + "]" : list.get(i) + ", " );
        }
        list.clear();
        System.out.println("\n------------------------------------------------------------");
    }

    public static void readArrayList(String msg, ArrayList<Integer> list, Scanner sc) {
        System.out.println(msg + "\n");
        System.out.print("Enter length of list: ");
        int length = sc.nextInt();

        for (int i = 0; i < length; i++) {
            System.out.print("Enter input: ");
            list.add(sc.nextInt());
        }
    }

    public static void checkMultiplesInList(ArrayList<Integer> list, Scanner sc) {
        // $ Example
        // * Input : [1, 5, 3, 0, 7]
        // * Output : [5, 0, 7]

        ArrayList<Integer> multipleList = new ArrayList<>();
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 5 == 0 || list.get(i) % 7 == 0) {
                multipleList.add(list.get(i));
            }
        }
        list.clear();
        printList(multipleList);
    }

    public static void multiplesOfIntegerList(ArrayList<Integer> list, Scanner sc) {
        System.out.println("Q3. Given two integers A, B. Return Arraylist containing first B multiples of A\n");
        System.out.print("Enter A: ");
        int A = sc.nextInt();
        System.out.print("Enter B: ");
        int B = sc.nextInt();

        for (int i = 1; i <= B; i++) {
            list.add(A * i);
        }
        printList(list);
    }

    public static void readtwoDimensionalList(ArrayList<ArrayList<Integer>> list, Scanner sc) {
        System.out.println("Exercise: Taking two dimensional ArrayList as input");

        // * Reading 1D lists
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        readArrayList("\nReading ArrayList 1", arr1, sc);
        readArrayList("\nReading ArrayList 2", arr2, sc);

        // * Adding arraylists into nested arraylist
        list.add(arr1);
        list.add(arr2);

        // * Prinitng nested arraylist
        System.out.println(list);

        // * Clearing lists
        arr1.clear();arr2.clear();list.clear();

        System.out.println("------------------------------------------------------------");
    }

    public static void readNonMatrixWithList(String msg, ArrayList<ArrayList<Integer>> list, Scanner sc) {
        System.out.println(msg + "\n");
        
        System.out.print("Enter no of rows: ");
        int rows = sc.nextInt();

        for (int r = 0; r < rows; r++) {
            System.out.print("\nEnter no of columns for row " + (r+1) + ": ");
            int columns = sc.nextInt();

            System.out.print("Enter elements for row " + (r+1) + ": ");
            ArrayList<Integer> arr = new ArrayList<>();
            for (int c = 0; c < columns; c++) {
                arr.add(sc.nextInt());
            }
            list.add(arr);
        }
    }

    public static void printNestedList(ArrayList<ArrayList<Integer>> list) {
         // * Printing Nested ArrayList
         System.out.println("\n" + list);

         // * Clearing list
         list.clear();
 
         System.out.println("------------------------------------------------------------");
    }

    public static void printListLineByLine(ArrayList<ArrayList<Integer>> list) {
        System.out.println();
        for (ArrayList<Integer> arrayList : list) {
            System.out.println(arrayList);
        }

        // * Clearing list
        list.clear();
 
        System.out.println("------------------------------------------------------------");
    }

    public static void printNumericStaircaseList(ArrayList<ArrayList<Integer>> list, Scanner sc) {
        // * Input
        // * N = 3

        // * Output
        // * [[1],
        // *  [1, 2],
        // *  [1, 2, 3]]

        System.out.println("Given N as input, return numeric staircase as ArrayList\n");

        System.out.print("Enter staircase height: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                arr.add(j+1);
            }
            list.add(arr);
            arr = new ArrayList<>();
        }

        System.out.println("Demo print: " + list);

        // * ArrayList is ready, next task is to print in numeric staircase pattern
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i == list.size() - 1 ? list.get(i) + "]\n" : list.get(i) + ",\n");
        }

        // * Clearing list
        list.clear();

        System.out.println("------------------------------------------------------------");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // # Q1. Keep taking integer input untill negative input is provided.
        // System.out.println(storeInputRating(sc) + "\n------------------------------------------------------------");

        // $ Declaring re-usable lists
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();

        // # Exercise: Take Arraylist as input and print contents
        // readArrayList("Exercise: Take Arraylist as input and print contents", list, sc);
        // printList(list);

        // # Q2. Given Arraylist as input, return an Arraylist of the multiples of 5 or 7.
        // readArrayList("Q2. Given Arraylist as input, return an Arraylist of the multiples of 5 or 7.", list, sc);
        // checkMultiplesInList(list, sc);

        // # Q3. Given two integers A, B. Return Arraylist containing first B multiples of A
        // multiplesOfIntegerList(list, sc);

        // # Exercise: Taking two dimensional ArrayList as input
        // readtwoDimensionalList(list2d, sc);

        // # Exercise: Taking Non-Matrix Input using ArrayList
        // readNonMatrixWithList("Exercise: Taking Non-Matrix Input using ArrayList", list2d, sc); // what's with the weird ass names 🥹
        // printNestedList(list2d);

        // # Q4. Given 2D ArrayList as input, print it line by line
        // readNonMatrixWithList("Q4. Given 2D ArrayList as input, print it line by line", list2d, sc);
        // printListLineByLine(list2d);

        // # Q5. Given N as input, return numeric staircase as ArrayList
        printNumericStaircaseList(list2d, sc);
    }
}
