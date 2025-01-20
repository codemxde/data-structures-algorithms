import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    // Methods related to HashSet

    public static void addElements(HashSet<Integer> set) {
        set.add(1);
        set.add(2);
        set.add(3);
        // adding multiple instances of 4
        set.add(4);
        set.add(4);
        set.add(4);
        // adding multiple instances of 5
        set.add(5);
        set.add(5);
    }

    public static void clearSet(HashSet<Integer> set) {
        set.clear();
    }

    public static void printEndofSegment() {
        System.out.println("------------------------------------------------");
    }

    public static void readHashset(HashSet<Integer> set, String msg, Scanner sc) {
        System.out.println(msg + "\n");
        System.out.print("enter size of hashset: ");
        int size = sc.nextInt();

        System.out.print("enter elements: ");
        for (int i = 0; i < size; i++) {
            set.add(sc.nextInt());
        }
    }

    public static void findCommonElements(Scanner sc) {
        System.out.println("Q2. Given two hashsets as input. Print their common elements\n");
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        readHashset(set1, "Set 1:", sc); System.out.println();
        readHashset(set2, "Set 2:", sc); System.out.println();

        System.out.print("common elements: ");
        for (Integer element : set2) {
            if (set1.contains(element)) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
        printEndofSegment();
    }

    // Methods related to HashMap

    public static void addElementsInMap(HashMap<String, String> map) {
        map.put("name", "Keshav");
        map.put("age", "23");
        map.put("profession", "Software Developer");
    }

    public static void printMap(HashMap<String, String> map) {
        System.out.println("Printing Map:");

        for(String key : map.keySet()) {
            System.out.println("key: " + key + ", value: " + map.get(key));
        }
    }

    public static int[] readArray(Scanner sc) {
        System.out.println("Q3. Given A[] as input. Return the freq of array as key value pair\n");
        
        System.out.print("enter size of array: ");
        int length = sc.nextInt();

        int[] arr = new int[length];
        System.out.print("enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int countFrequency(int ele, int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (ele == i) {
                count++;
            }
        }
        return count;
    }

    public static void createFrequencyMap(int[] arr) {
        // * declaring a map
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, countFrequency(i, arr));
        }
        
        // * printing map
        System.out.println("\nPrinting Map:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        printEndofSegment();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // # HashSet
        // * declaring and initializing
        HashSet<Integer> set = new HashSet<>();
        
        // * adding elements
        addElements(set);

        // * printing elements
        System.out.println(set);

        // * doing contains check
        System.out.println(set.contains(3) ? "3 is present" : "3 is not present");
        System.out.println(set.contains(7) ? "7 is present" : "7 is not present");

        // * remove check
        set.remove(3); System.out.println(set);

        // * clearing hashset
        clearSet(set);

        // $ Questions for HashSet
        // # Q1. Given A[] as input. Add its elements to hashset and return the hashset
        printEndofSegment();
        readHashset(set, "Q1. Given A[] as input. Add its elements to hashset and return the hashset", sc);
        System.out.println(set);
        printEndofSegment();

        // # Q2. Given two hashsets as input. Print their common elements
        findCommonElements(sc);

        // # HashMap
        // * declaring and initializing
        HashMap<String, String> map = new HashMap<>();

        System.out.println("HashMap\n");

        // * adding key-value pairs
        addElementsInMap(map);

        // * printing map
        printMap(map);

        // * removing key-value from map
        map.remove("profession");

        // * clearing map for re-use
        map.clear();

        // $ Questions for HashMap
        // # Q1. Given A[] as input. Return the freq of array as key value pair
        printEndofSegment();
        int[] arr = readArray(sc);
        createFrequencyMap(arr);
        
    }
}
