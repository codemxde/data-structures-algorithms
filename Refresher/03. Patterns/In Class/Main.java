import java.util.Scanner;

public class Main {
    
    public static void printStar(int N) {
        for (int i = 0; i < N; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int N) {
        System.out.println();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printMatrix(int N, int M) {
        System.out.println();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void  printStaircase(int N) {

        // # For Example, if N = 5
        // ! *
        // ! * *
        // ! * * *
        // ! * * * *
        // ! * * * * *

        System.out.println();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern(int N) {
        // # For Example, if N = 3
        // ! *
        // ! * 2
        // ! * 2 *
        
        // # For Example, if N = 4
        // ! *
        // ! * 2
        // ! * 2 *
        // ! * 2 * 4

        // * Analysis: Print the number in case of even positions

        System.out.println();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if ((j+1) % 2 == 0) {
                    System.out.print(j + 1 + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }

    public static void print_star_and_dash(int N) {
        // # For Example, if N = 3
        // ! * _ *
        // ! * _ *
        // ! * _ *
        
        // # For Example, if N = 4
        // ! * _ _ *
        // ! * _ _ *
        // ! * _ _ *
        // ! * _ _ *

        System.out.println();
        for (int i = 0; i < N; i++) {
            System.out.print("* ");
            for (int j = 0; j < N - 2; j++) {
                System.out.print("_ ");
            }
            System.out.print("* ");
            System.out.println();
        }
    }

    public static void print_inverted_staircase(int N) {
        // # For Example, if N = 3
        // ! * * *
        // ! * *
        // ! *
        
        // # For Example, if N = 4
        // ! * * * *
        // ! * * *
        // ! * *
        // ! *

        System.out.println();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= N - i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print_v_pattern(int N) {
        // # For Example, if N = 3
        // ! *   *
        // ! *  *
        // ! * *
        
        // # For Example, if N = 4
        // ! *    *
        // ! *   *
        // ! *  *
        // ! * *

        System.out.println();
        for (int i = 0; i < N; i++) {
            System.out.print("*");
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }

    public static void print_inclined_staircase(int N) {
       // # For Example, if N = 3
        // !     *
        // !   * *
        // ! * * *
        
        // # For Example, if N = 4
        // !       *
        // !     * *
        // !   * * *
        // ! * * * *

        System.out.println();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void print_concatenated_inverted_pattern(int N) {
        // # For Example, if N = 4
        // ! * * * * * * * *
        // ! * * *     * * *
        // ! * *         * *
        // ! *             *

        System.out.println();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < N - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print_pyramid(int N) {
        // # for Example, if N = 4
        // !         *        
        // !       * * *
        // !     * * * * *
        // !   * * * * * * *
        
        System.out.println();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // # Q1: Given N as input, print * N times
        printStar(number);

        // # Q2: Given N, print a square of N x N size, with *  in each cell
        printSquare(number);

        // # Q2: Given N,M. Print of N x M matrix, with *  in each cell
        System.out.print("\nEnter M(columns): ");
        int M = sc.nextInt();
        printMatrix(number, M);

        // # Q3: Given N, print staircase of size N.
        printStaircase(number);

        // # Q4: Given N, print the pattern
        printPattern(number);

        // # Q6: given N, print the pattern
        print_star_and_dash(number);

        // # Q7: Given N, print inverted staircase pattern
        print_inverted_staircase(number);

        // # Q8: Given N, print the  V pattern
        print_v_pattern(number);

        // # Q9: Given N, print inclined staircase
        print_inclined_staircase(number);

        // # Q10: Given N, print concatenated inverted pattern
        print_concatenated_inverted_pattern(number);

        // # Q11: Given N, print pyramid
        print_pyramid(number);
    }
}
