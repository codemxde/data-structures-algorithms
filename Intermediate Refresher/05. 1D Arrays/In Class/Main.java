import java.util.Scanner;

public class Main {

    public static void takeArrayInput(int[] arr, Scanner sc) {
        System.out.print("Input Array Contents: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("--------------------------");
    }

    public static void sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array: " + sum);
        System.out.println("--------------------------");
    }

    public static void printMaximumArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum of Array: " + max);
        System.out.println("--------------------------");
    }

    public static void printMinimumArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum of Array: " + min);
        System.out.println("--------------------------");
    }

    public static void checkElementPresent(int[] arr, Scanner sc) {
        System.out.print("Check Integer ? ");
        int K = sc.nextInt();
        boolean isPresent = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == K) {
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent ? K + " is present" : K + " is not present");
        System.out.println("--------------------------");
    }

    public static void checkFrequencyOfInteger(int[] arr, Scanner sc) {
        System.out.print("Check Frequency of ? ");
        int K = sc.nextInt();
        int frequency = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == K) {
                frequency++;
            }
        }
        System.out.println(K + " is present " + frequency + " times");
        System.out.println("--------------------------");
    }

    public static int returnFrequency(int[] arr, int K) {
        int frequency = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == K) {
                frequency++;
            }
        }
        return frequency;
    }

    public static void frequencyCountOfArray(int[] arr) {
        // $ Example
        // * N = 5
        // * A = {1, 2, 3, 4, 5}
        // * Output = {1, 1, 1, 1, 1}

        // * N = 7
        // * A = {1, 1, 2, 1, 3, 1, 3}
        // * Output = {4, 4, 1, 4, 2, 4, 2}

        System.out.print("Printing Frequency Array: [");
        int[] frequencyArr = new int[arr.length];
        for (int i = 0; i < frequencyArr.length; i++) {
            frequencyArr[i] = returnFrequency(arr, arr[i]);
            System.out.print(frequencyArr[i] + (i == arr.length - 1 ? "" : ", "));
        }
        System.out.println("]");
        System.out.println("--------------------------");
    }

    public static void checkStrictlyIncreasing(int[] arr) {
        // $ Example
        // * A[] = {1, 10, 11, 13, 20, 21}
        // * Output = true

        // * A[] = {1, 2, 3, 3, 10, 30, 31, 35}
        // * Output = false (3 -> 3 is not increasing behaviour)

        boolean isStrictlyIncreasing = true;
        String increasing = "Array is Strictly Increasing";
        String notIncreasing = "Array is not Strictly Increasing";
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i+1]){
                isStrictlyIncreasing = false;
                break;
            }
        }
        System.out.println(isStrictlyIncreasing ? increasing : notIncreasing);
    }
    
    public static void main(String[] args) {
        System.out.print("Input size of array: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];

        takeArrayInput(arr, sc);

        // # Q1. Take an integer array as input and print its sum
        sumOfArray(arr);

        // # Q2. Take an integer array as input and print its max
        printMaximumArray(arr);

        // # Q3. Take an integer array as input and print its min
        printMinimumArray(arr);

        // # Q4. Take A[N] as input. Check whether 'K' is present
        checkElementPresent(arr, sc);

        // # Q5. Take A[N] as input. Return frequency of 'K'
        checkFrequencyOfInteger(arr, sc);

        // # Q6. Take A[N] as input. Return frequency of the Array
        frequencyCountOfArray(arr);

        // # Q7. Take an A[N] as input. Check whether it's strictly increasing
        checkStrictlyIncreasing(arr);
    }
}
