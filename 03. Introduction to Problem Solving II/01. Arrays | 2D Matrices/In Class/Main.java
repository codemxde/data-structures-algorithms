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
            System.out.print("row " + (i+1) + ": [");
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

    public static void printDiagonalsLeftToRight(int[][] arr) {
        // # Approach
        // * For problem breakdown and analysis, refer to PDF
        // * under the same directory
        System.out.println("4. Print all the elements diagonally from right to left.\n");

        int N = arr.length;
        int M = arr[0].length;

        // * 0th Row Diagnal Elemnts excluding last element
        for (int i = 0; i < M-1; i++) {
            int start = 0;
            int end = i;
            System.out.print("diagonal elements: [");
            while (start < N && end >= 0) {
                int el = arr[start][end];
                System.out.print(end != 0 ? el + ", " : el + "]\n");
                start++;
                end--;
            }
        }

        // * Last Column Elements
        for (int i = 0; i < N; i++) {
            int start = i, end = M-1;
            System.out.print("diagonal elements: [");
            while (start < N) {
                int el = arr[start][end];
                System.out.print(start != N-1 ? el + ", " : el + "]\n");
                start++;
                end--;
            }
        }
    }

    public static void transposeSquareMatrix(int[][] arr) {
        // # Approach
        // * Since it's a square matrix, the length of the transposed
        // * matrix will also be the same. So, we don't need to create
        // * and additional matrix to store the elements in the
        // * tranposed order.
        // * The diagonal elements will remain at the same position, so
        // * we can skip them for the iteration logic

        System.out.println("Q5.1 Transpose of a Square Matrix (Concept)\n");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void transponseMatrix(int[][] arr) {
        // # Approach
        // * Traverse column by column, and keep on adding
        // * entire column elements as a row of the transposed matrix

        System.out.println("Q5.2 Transpose of a Non-Square Matrix (Concept)\n");

        int N = arr.length, M = arr[0].length;
        int[][] transpose = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
    }

    public static void reverseArray(int si, int ei, int[] arr) {
        while (si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

    public static void rotateSquareMatrix(int[][] arr) {
        // # Approach
        // * Transpose the Matrix first, and then reverse
        // * all the elements of each row (what a hack!)

        System.out.println("Q6. Rotate a Square Matrix (Concept)\n");

        // * 1. Transpose Matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // * 2. Reverse Row Elements
        for (int i = 0; i < arr.length; i++) {
            reverseArray(0, arr.length - 1, arr[i]);
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

        // # Q4. Print all the elements diagonally from right to left.
        printDiagonalsLeftToRight(arr); endOfSegment();

        // # Q5. Transpose of a Matrix (Concept)
        // transposeSquareMatrix(arr); printMatrix(arr); endOfSegment();

        // # Q6. Rotate a Square Matrix (Concept)
        rotateSquareMatrix(arr); printMatrix(arr); endOfSegment();
    }
}