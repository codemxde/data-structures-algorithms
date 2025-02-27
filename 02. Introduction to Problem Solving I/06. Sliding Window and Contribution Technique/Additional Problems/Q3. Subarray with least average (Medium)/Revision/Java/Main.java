import java.util.Scanner;

class Revision{

    public static int[] readArray(Scanner sc) {
        System.out.print("enter array size: ");
        int size = sc.nextInt();
        
        System.out.print("enter elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int readInteger(Scanner sc) {
        System.out.print("\nenter integer: ");
        return sc.nextInt();
    }

    public static int calculateWindowSum(int[] A, int B) {
        int windowSum = 0;
        for (int i = 0; i < B; i++) {
            windowSum += A[i];
        }
        return windowSum;
    }

    public static int findSubarrayWithLeastAverage(int[] A, int B) {
        int windowSum = calculateWindowSum(A, B);
        int minSum = windowSum;
        int minIndex = 0;

        int si = 1;
        int ei = B;
        
        while (ei < A.length) {
            windowSum = windowSum - A[si - 1] + A[ei];
            if(windowSum < minSum) {
                minSum = windowSum;
                minIndex = si;
            }
            si++;
            ei++;
        }
        return minIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] A = readArray(sc);
        int B = readInteger(sc);

        System.out.println("\nfirst index of minimum sum subarray: " + findSubarrayWithLeastAverage(A, B));
    }
}