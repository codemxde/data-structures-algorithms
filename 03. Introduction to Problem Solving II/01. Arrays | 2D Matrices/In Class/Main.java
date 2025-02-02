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

    public static void printMatrix(int[][] arr) {
        int r = arr.length, c = arr[0].length;
        for (int i = 0; i < r; i++) {
            System.out.print("sum for row " + (i+1) + ": [");
            for (int j = 0; j < c; j++) {
                int ele = arr[i][j];
                System.out.print(j != c - 1 ? ele + ", " : ele + "]\n");
            }
        }
    }

    public static void rowSum(int[][] arr) {
        System.out.println("Q1. Given arr[N][M], print row-wise sum.\n");
        int r = arr.length, c = arr[0].length;
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum += arr[i][j];
            }
            System.out.print("sum for row " + (i+1) + ": " + sum + "\n");
        }
    }

    public static void columnWiseSum(int[][] arr) {
        System.out.println("Q2. Given arr[N][M], print column-wise sum.\n");
        int r = arr.length, c = arr[0].length;
        for (int i = 0; i < c; i++) {
            int sum = 0;
            for (int j = 0; j < r; j++) {
                sum += arr[j][i];
            }
            System.out.print("sum for column " + (c+1) + ": " + sum + "\n");
        }
    }

    public static void printDiagonals(int[][] arr) {
        System.out.println("Q3. Given arr[N][N]. Print Digaonals\n");
        int r = arr.length;

        System.out.print("right diagonal elements of the matrix: [");
        for (int i = 0; i < r; i++) {
            int diagonal = arr[i][i];
            System.out.print(i != r-1 ? diagonal + ", " : diagonal + "]\n");
        }

        System.out.print("left diagonal elements of the matrix: [");
        for (int i = 0; i < r; i++) {
            int diagonal = arr[i][r-i-1];
            System.out.print(i != r-1 ? diagonal + ", " : diagonal + "]\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // * read matrix input
        int[][] arr = readMatrix(sc); endOfSegment();

        // # Q1. Given arr[N][M], print row-wise sum.
        rowSum(arr); endOfSegment();

        // # Q2. Given arr[N][M], print column-wise sum.
        columnWiseSum(arr); endOfSegment();

        // # Q3. Given arr[N][N]. Print Digaonals
        printDiagonals(arr); endOfSegment();
    }
}