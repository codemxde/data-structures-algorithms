import java.util.Scanner;

public class Main {
    public static void endOfSegment() {
        System.out.println("-----------------------------------------------------------");
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

    public static void iterateAllSubarrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                // * iterate from i->j for each subarray sum
                String subarray = "[";
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    int ele = arr[k];
                    sum += ele;
                    subarray += k != j ? ele + ", " : ele + "]";
                }
                System.out.println("sum of subarray " + subarray + " = " + sum);
            }
        }
    }

    public static int[] createPrefixSum(int[] arr) {
        int[] pSum = new int[arr.length];
        pSum[0] = arr[0];

        for (int i = 1; i < pSum.length; i++) {
            pSum[i] = arr[i] + pSum[i - 1];
        }
        return pSum;
    }

    public static void calculateSumInRange(int[] pSum) {
        for (int i = 0; i < pSum.length; i++) {
            for (int j = i; j < pSum.length; j++) {
                int subarraySum = 0;
                if (i == 0) {
                    subarraySum = pSum[j];
                } else {
                    subarraySum = pSum[j] - pSum[1 - 1];
                }
                System.out.println("sum of subarray " + (i+j+1) + " = " + subarraySum);
            }
        }
    }

    public static void sumOfAllSubarraySums(int[] arr, Scanner sc) {
        System.out.println("Q1. Given arr[N]. Find sum of all Subarray sums.\n");

        // # 1. Brute Force Approach
        // * Consider all Subarrays, and find sum of each
        // * T.C. - O(N^3)

        System.out.println("1. Brute Force Approach\n");
        iterateAllSubarrays(arr);

        // # 2. Prefix Sum Approach
        // * Create a prefix sum array
        // * Rather than iterating from index i to j, calculate the prefix
        // * sum from [i, j] i,e, pSum[j] - pSum[i-1]
        // * T.C. - O(N^2)

        System.out.println("\n2. Prefix Sum Approach\n");
        int[] pSum = createPrefixSum(arr);
        calculateSumInRange(pSum);

        // # 3. Carry Forward

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * iniialize universal array
        int[] arr = readArray(sc);

        // # Q1. Given arr[ N ]. Find sum of all Subarray sums. (Google, Meta)
        sumOfAllSubarraySums(arr, sc);
    }
}
