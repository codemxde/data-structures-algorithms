// # Problem Description
// * Write a program to print the input array A of size N
// * in reverse order where you have to take integer N and
// * further N elements as input from user.

// # Note:
// * This question requires you to read multiple numbers from input.
// * The first number represents N, which indicates how many more numbers follow.
// * The remaining numbers are converted to integers using the map() function.
// * Since this concept will be covered later in the module,
// * we encourage you to do some independent research and write your code accordingly.
// * You may also refer to the following article for further guidance: link

// # Problem Constraints
// * 1 <= N <= 1000  
// * 1 <= A <= 1000

// # Input Format
// * A single line representing N followed by N integers of the array A

// # Output Format
// * A single line containing N space separated integers representing elements
// * of the input array in reverse order.  
// * NOTE - Keep a space character (' ') at the end of the line.

// # Example
// $ Input 1
// * 5 1 2 3 4 5

// $ Output 1
// * 5 4 3 2 1 

// $ Input 2
// * 4 10 50 40 80

// $ Output 2
// * 80 40 50 10 

import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void printArrayInReverse(int[] arr) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            System.out.print(arr[N-i-1] + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];

        readArrayInput(arr, sc);
        printArrayInReverse(arr);
    }
}
