import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter values for row " + (i+1) + ": ");
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("----------------------------------------------");
    }

    public static int[][] takeArrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];
        readArrayInput(arr);

        return arr;
    }

    public static void printTopRow(int[][] arr) {
        System.out.println("Q1. Print top row of matrix");
        int columns = arr[0].length;

        System.out.print("[");
        for (int i = 0; i < columns; i++) {
            int element = arr[0][i];
            System.out.print(i == columns - 1 ? element + "]" : element + ", " );
        }
        System.out.println("\n----------------------------------------------");
    }

    public static void printLeftMostColumns(int[][] arr) {
        // * Need to iterate all the rows and print its 0th index element
        System.out.println("Q2. Print leftmost column of matrix");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i][0];
            System.out.print(i == arr.length - 1 ? element + "]" : element + ", ");
        }
        System.out.println("\n----------------------------------------------");
    }

    public static void printMatrixRowbyRow(int[][] arr) {
        System.out.println("Q3. Print matrix row by row");

        int rows = arr.length;
        int columns = arr[0].length;

        for (int i = 0; i < rows; i++) {
            System.out.print("[");
            for (int j = 0; j < columns; j++) {
                int el = arr[i][j];
                System.out.print(j == columns - 1 ? el + "]\n" : el + ", ");
            }
        }
        System.out.println("----------------------------------------------");
    }

    public static void printMatrixColumnbyColumn(int[][] arr) {
        System.out.println("Q4. Print matrix column by column");

        int rows = arr.length;
        int columns = arr[0].length;

        for (int c = 0; c < columns; c++) {
            System.out.print("[");
            for (int r = 0; r < rows; r++) {
                int el = arr[r][c];
                System.out.print(r == rows - 1 ? el + "]\n" : el + ", ");
            }
        }
        System.out.println("----------------------------------------------");
    }

    public static void printSumOfMatrix(int[][] arr) {
        System.out.println("Q5. Print sum of matrix");
        int rows = arr.length;
        int columns = arr[0].length;

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of matrix: " + sum);
        System.out.println("----------------------------------------------");
    }

    public static void printMatrixInWaveform(int[][] arr) {
        System.out.println("Q6. Print matrix in waveform");
        int rows = arr.length;
        int columns = arr[0].length;

        for (int r = 0; r < rows; r++) {
            System.out.print("[");
            if (r % 2 == 0) {
                for (int c = 0; c < columns; c++) {
                    int el = arr[r][c];
                    System.out.print(c == columns - 1 ? el + "]\n" : el + ", ");
                }
            } else {
                for (int c = columns - 1; c >= 0; c--) {
                    int el = arr[r][c];
                    System.out.print(c == 0 ? el + "]\n" : el + ", ");
                }
            }
        }
        System.out.println("----------------------------------------------");
    }

    public static void printRowWiseSum(int[][] arr) {
        System.out.println("Q7. Print row wise sum");
        int rows = arr.length;
        int columns = arr[0].length;

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < columns; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of Row " + (i+1) + ": " + sum);
        }
        System.out.println("----------------------------------------------");
    }

    public static void printColumnWiseMax(int[][] arr) {
        System.out.println("Q8. Print column-wise max");
        int rows = arr.length;
        int columns = arr[0].length;

        for (int c = 0; c < columns; c++) {
            int columnMax = arr[0][c];
            for (int r = 0; r < rows; r++) {
                if (arr[r][c] > columnMax) {
                    columnMax = arr[r][c];
                }
            }
            System.out.println("Max of column " + (c+1) + ": " + columnMax);
        }
        System.out.println("----------------------------------------------");
    }

    public static void main(String[] args) {
        int[][] arr = takeArrayInput();

        // # Q1. Print top row of matrix.
        printTopRow(arr);

        // # Q2. Print leftmost column of matrix
        printLeftMostColumns(arr);

        // # Q3. Print matrix row by row
        printMatrixRowbyRow(arr);

        // # Q4. Print matrix column by column
        printMatrixColumnbyColumn(arr);

        // # Q5. Sum of Matrix
        printSumOfMatrix(arr);

        // # Q6. Waveform printing
        printMatrixInWaveform(arr);

        // # Q7. Print Row Wise Sum
        printRowWiseSum(arr);

        // # Q8. Print column-wise max
        printColumnWiseMax(arr);
    }
}