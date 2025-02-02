import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[][] readMatrix(Scanner sc) {
        System.out.print("enter no of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            System.out.print("enter elements for row " + (i + 1) +": ");
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void endOfSegment() {
        System.out.println("-----------------------------------------------------");
    }

    public static void rowSum(int[][] arr, Scanner sc) {
        System.out.println("Q1. Given arr[N][M], print row-wise sum.\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read matrix input
        int[][] arr = readMatrix(sc); endOfSegment();

        // # Q1. Given arr[N][M], print row-wise sum.
        rowSum(arr, sc);
    }
}