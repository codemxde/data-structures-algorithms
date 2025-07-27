public class Solution {

    public static void main(String[] args) {
        int[] A = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Maximum contiguous subarray sum: " + maxSubArray(A));
    }

    public static int maxSubArray(int[] A) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            sum += A[i];

            if (sum > maxSum)
                maxSum = sum;

            if (sum < 0)
                sum = 0;
        }

        return maxSum;
    }

    public static void maxSubArrayWithIndexes(int[] A) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        int startIndex = 0, currentStartIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < A.length; i++) {
            sum += A[i];

            if (sum > maxSum) {
                maxSum = sum;

                startIndex = currentStartIndex;
                endIndex = i;
            }

            if (sum < 0) {
                sum = 0;
                currentStartIndex = i + 1;
            }
        }

        System.out.println("Maximum contiguous subarray sum: " + maxSubArray(A) +
                " with startIndex: " + startIndex + " and endIndex: " + endIndex);
    }
}
