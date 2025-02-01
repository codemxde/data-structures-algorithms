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

    public static void subarraysWithLengthK(Scanner sc) {
        // # Observation (refer lecture notes)
        // * Say N = 6
        // * Number of subarrays with length = 1 → 6 or [N]
        // * Number of subarrays with length = 2 → 5 or [N - 1]
        // * Number of subarrays with length = 3 → 4 or [N - 2]
        // * Number of subarrays with length = 4 → 3 or [N - 3]
        // * Number of subarrays with length = 5 → 2 or [N - 4]
        // * Number of subarrays with length = 6 → 1 or [N - 5]
        
        // # Or we can say
        // * Number of subarrays with length = K → [N - K + 1]

        System.out.println("Q2. Number of subarrays with length K\n");

        System.out.print("enter length of array: ");
        int N = sc.nextInt();

        System.out.print("enter subarray length: ");
        int K = sc.nextInt();

        System.out.println("\nnumber of subarrays with length " + K + " → " + (N - K + 1));
        endOfSegment();
    }

    public static void subarrayIndexesOfLengthK(int[] arr, Scanner sc) {
        // # Approach
        // * Maintain two pointer indexes, 'si' and 'ei'
        // * initialise 'si' with '0' and 'ei' with 'K-1'
        // * What we have now created is a 'window' or subarray
        // * which encompasses 'K' elemnts.
        // * Next, we 'slide' this window , by incrementing both
        // * 'si' and 'ei' by '1' untill the end of the array is reached.
        // * By doing so, we would have arrived at at the start and
        // * end indexes of all the subarrays with length 'K'

        // # Time and Space
        // * T.C. - O(N-K+1), whhich is equal to the no of subarrays with length 'K'
        // * S.C. - O(1)

        System.out.println("Q3. Print si and ei of every subarray of length k.\n");
        
        // * read 'K'
        System.out.print("enter length, to find all start and end indexes: ");
        int K = sc.nextInt();
        
        // * handling edge case
        if (K > arr.length) {
            System.out.println("no such indexes exist for given length");
        }
        
        // * creating a window of length 'K'
        int si = 0;
        int ei = K - 1;

        // * printing all 'si' and 'ei' for all subarrays with length 'K'
        while (ei < arr.length) {
            System.out.println("start and end indexes for subarray " + (si + 1) + ": " + "(" + si + "," + ei + ")");
            si++;
            ei++;
        }
        endOfSegment();
    }

    public static void prefixSumApproach(int[] arr, int K) {
        // # Approach
        // * We already know the start and end indexes of all subarrays
        // * with length 'K'. We just need to 'carry forward' the maximum sum
        // * in all of the 'windows'
        // * To calculate each subarray sum between 'si' and 'ei' we need
        // * to first construct a prefix sum array

        // # Time and Space
        // * T.C - O(N)
        // * S.C - O(N), due to prefix sum array

        System.out.println("\n1. Prefix Sum Approach");

        // * create prefix sum array
        int[] pSum = createPrefixSum(arr);

        // * finding maximum sum
        int maxSum = pSum[K-1];
        int si = 1;
        int ei = K;

        while (ei < arr.length) {
            if (pSum[ei] - pSum[si - 1] > maxSum) {
                maxSum = pSum[ei] - pSum[si - 1];
            }
            si++;
            ei++;
        }
        System.out.println("maximum sum of subarray with length K = " + maxSum);
    }

    public static void slidingWindowApproach(int[] arr, int K) {
        // # Approach
        // * Calculate the sum of the first 'K' elements
        // * configure a sliding window with length 'K'
        // * as you keep on sliding, delete the value of the last 'si'
        // * and add the value of new 'ei' elements to get updated 'sum'
        // * value for 'current window'
        // * carry forward the maximum sum for all the 'windows'

        // # Time and Space
        // * T.C - O(N), what if K = 1, whole array iteration required
        // * S.C - O(1), improvement from O(N) from prefix-sum technique

        System.out.println("\n2. Sliding Window Approach");

        // * calculating sum of first 'K' elements
        int windowSum = 0;
        for (int i = 0; i < K; i++) {
            windowSum += arr[i];
        }

        // * configuring sliding window
        int si = 1;
        int ei = K;
        int maxSum = windowSum;

        while (ei < arr.length) {
            windowSum = windowSum - arr[si - 1] + arr[ei];
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
            si++;
            ei++;
        }
        System.out.println("maximum sum of subarray with length K = " + maxSum);
    }

    public static void maxSubarraySumOfLengthK(int[] arr, Scanner sc) {
        System.out.println("Q4. Given arr[N]. Print maximum subarray sum of subarray\nwith length K\n");

        // * read input for 'K'
        System.out.print("enter subarray length: ");
        int K = sc.nextInt();

        // # 1. Prefix Sum Approach
        prefixSumApproach(arr, K);

        // # 2. Sliding Widow Approach
        slidingWindowApproach(arr, K);

        endOfSegment();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * iniialize universal array
        int[] arr = readArray(sc);

        // # Q1. Given arr[N]. Find sum of all Subarray sums. (Google, Meta)
        sumOfAllSubarraySums(arr, sc);

        // # Q2. Number of subarrays with length K
        subarraysWithLengthK(sc);

        // # Q3. Print si and ei of every subarray of length k.
        subarrayIndexesOfLengthK(arr, sc);

        // # Q4. Given arr[N]. Print maximum subarray sum of subarray with length k
        maxSubarraySumOfLengthK(arr, sc);
    }
}
