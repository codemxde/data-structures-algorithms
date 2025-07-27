public class Solution {

    public static int[] solve(int A, int[][] B) {
        int[] moneyInEachBeggarPot = new int[A];

        for (int i = 0; i < B.length; i++) {
            int startIndex = B[i][0] - 1, endIndex = B[i][1];
            int amountDonated = B[i][2];

            moneyInEachBeggarPot[startIndex] += amountDonated;

            if (endIndex < A) {
                moneyInEachBeggarPot[endIndex] -= amountDonated;
            }
        }

        finalMoneyInEachBeggarPot(moneyInEachBeggarPot);

        return moneyInEachBeggarPot;
    }

    public static void finalMoneyInEachBeggarPot(int[] A) {
        for (int i = 1; i < A.length; i++) {
            A[i] += A[i - 1];
        }
    }

}
