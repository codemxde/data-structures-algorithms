import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void endOfSegment() {
        System.out.println("------------------------------------------");
    }

    public static int[] readArray(Scanner sc) {
        System.out.print("enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        endOfSegment();
        return arr;
    }
    
    // Methods related to Insertion ⬇️

    public static void insertAtBeginning(int[] arr, Scanner sc) {
        System.out.println("01. Insert element at the beginning of array\n");
        
        System.out.print("enter element to insert: ");
        int element = sc.nextInt();

        System.out.println("\narray before insertion: " + Arrays.toString(arr));

        int[] newArr = new int[arr.length + 1];
        newArr[0] = element;

        // # NOTE
        // * Since to recreate the new array I traverse the entire array once,
        // * The T.C of this algorithm is O(N) or linear

        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        System.out.println("array ater insertion: " + Arrays.toString(newArr));
        endOfSegment();
    }

    public static void insertAtEnd(int[] arr, Scanner sc) {
        System.out.println("02. Insert element at the end of array\n");
        
        System.out.print("enter element to insert: ");
        int element = sc.nextInt();

        System.out.println("\narray before insertion: " + Arrays.toString(arr));

        int[] newArr = new int[arr.length + 1];
        newArr[arr.length] = element;

        // # NOTE
        // * Since to recreate the new array I traverse the entire array once,
        // * The T.C of this algorithm is O(N) or linear

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        System.out.println("array ater insertion: " + Arrays.toString(newArr));
        endOfSegment();
    }

    public static void insertAtIndex(int[] arr, Scanner sc) {
        System.out.println("03. Insert element at any random position in array\n");

        System.out.print("enter position for insertion: ");
        int index = sc.nextInt() - 1;

        System.out.print("enter element to insert: ");
        int element = sc.nextInt();

        System.out.println("\narray before insertion: " + Arrays.toString(arr));

        // * initialising new array
        int[] newArr = new int[arr.length + 1];

        // * inserting first 'index - 1' elements
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        // * inserting new element at given position
        newArr[index] = element;

        // * inserting remaning elements
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println("array ater insertion: " + Arrays.toString(newArr));
        endOfSegment();
    } 
    
    // Methods related to Deletion ⬇️

    public static void deleteAtBeginning(int[] arr, Scanner sc) {
        System.out.println("01. Delete element at the beginning of array\n");

        System.out.println("\narray before deletion: " + Arrays.toString(arr));

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }

        System.out.println("array ater deletion: " + Arrays.toString(newArr));
        endOfSegment();
    }

    public static void deleteAtEnd(int[] arr, Scanner sc) {
        System.out.println("02. Delete element at the end of array\n");

        System.out.println("\narray before deletion: " + Arrays.toString(arr));

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }

        System.out.println("array ater deletion: " + Arrays.toString(newArr));
        endOfSegment();
    }

    public static void deleteAtIndex(int[] arr, Scanner sc) {
        System.out.println("03. Delete element at any random position in array\n");

        System.out.print("enter position for deletion: ");
        int index = sc.nextInt() - 1;

        System.out.println("\narray before deletion: " + Arrays.toString(arr));

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        for (int i = index; i < newArr.length; i++) {
            newArr[i] = arr[index + 1];
        }

        System.out.println("array ater deletion: " + Arrays.toString(newArr));
        endOfSegment();
    }
    
    public static void main(String[] args) {
        // # Time complexity for inserting/deleting at the beginning of the array?
        // * O(1)
        // $ O(N) - Ans
        // * O(logN)
        // * O(N^2)

        // # Following is the code to Insert/Delete in Array
        Scanner sc = new Scanner(System.in);

        // * reading an array
        int[] arr = readArray(sc);

        // # INSERTION
        endOfSegment(); System.out.println("INSERTION\n");

        // * insert at beggining in array
        insertAtBeginning(arr, sc); // T.C. => O(N)

        // * insert at the end of an array
        insertAtEnd(arr, sc); // T.C. => O(N)

        // * insert at random position in array
        insertAtIndex(arr, sc); // T.C. => O(N)

        // # DELETION
        endOfSegment(); System.out.println("DELETION\n");
        
        // * delete at beggining of array
        deleteAtBeginning(arr, sc);

        // * delete at end of array
        deleteAtEnd(arr, sc);

        // * delete at random position in array
        deleteAtIndex(arr, sc);
    }   
}
