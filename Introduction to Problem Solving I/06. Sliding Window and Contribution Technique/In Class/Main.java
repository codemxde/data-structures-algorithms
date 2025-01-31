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
        int cummulativeSum = 0;
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
                cummulativeSum += sum;
            }
        }
        System.out.println("\nsum of all subarray sums: " + cummulativeSum);
    }

    public static void bruteForceApproach(int[] arr) {
        // # Approach
        // * Consider all Subarrays, and find sum of each
        // * T.C. - O(N^3)

        System.out.println("1. Brute Force Approach\n");
        iterateAllSubarrays(arr);
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
        int cummulativeSum = 0;
        for (int i = 0; i < pSum.length; i++) {
            for (int j = i; j < pSum.length; j++) {
                int subarraySum = 0;
                if (i == 0) {
                    subarraySum = pSum[j];
                } else {
                    subarraySum = pSum[j] - pSum[i - 1];
                }
                System.out.println("sum of subarray " + (i+j+1) + " = " + subarraySum);
                cummulativeSum += subarraySum;
            }
        }
        System.out.println("\nsum of all subarray sums: " + cummulativeSum);
    }

    public static void prefixSumApproach(int[] arr) {
        // # Approach
        // * Create a prefix sum array
        // * Rather than iterating from index i to j, calculate the prefix
        // * sum from [i, j] i,e, pSum[j] - pSum[i-1]
        // * T.C. - O(N^2)

        System.out.println("\n2. Prefix Sum Approach\n");
        int[] pSum = createPrefixSum(arr);
        calculateSumInRange(pSum);
    }

    public static void carryForwardApproach(int[] arr) {
        // # Approach
        // * Dedicated Approach in PDF 'Carry Forward Approach' under
        // * directory 'Q1. Sum of all subarray sums'

        System.out.println("\n3. Carry Forward Approach\n");
        int cummulativeSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                cummulativeSum += sum;
            }
        }
        System.out.println("sum of all subarray sums: " + cummulativeSum);
    }

    public static void contributionTechnique(int[] arr) {
        // # Approach
        // * Detailed breakdown of the approach is present in PDF
        // * 'Contribution Technique Approach' under the directory 
        // * 'Q1. Sum of all subarray sums'

        System.out.println("\n4. Contribution Technique Approach\n");
        int N = arr.length;
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            sum += arr[i] * (N-i) * (i+1);
        }
        System.out.println("sum of all subarray sums: " + sum);
    }

    public static void sumOfAllSubarraySums(int[] arr, Scanner sc) {
        System.out.println("Q1. Given arr[N]. Find sum of all Subarray sums.\n");

        // # 1. Brute Force Approach
        bruteForceApproach(arr);

        // # 2. Prefix Sum Approach
        prefixSumApproach(arr);

        // # 3. Carry Forward
        carryForwardApproach(arr);

        // # 4. Contribution Technique
        contributionTechnique(arr);

        endOfSegment();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * iniialize universal array
        int[] arr = readArray(sc);

        // # Q1. Given arr[ N ]. Find sum of all Subarray sums. (Google, Meta)
        sumOfAllSubarraySums(arr, sc);
    }
}
