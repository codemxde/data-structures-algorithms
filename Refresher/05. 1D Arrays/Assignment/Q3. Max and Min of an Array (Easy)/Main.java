// # Problem Description
// * Take input an array A of size N and write a program to
// * print maximum and minimum elements of the input.
// * The only line of the input would contain a single integer N
// * that represents the length of the array followed by the
// * N elements of the input array A.

// # Problem Constraints
// * 1 <= N <= 1000
// * 1 <= A <= 1000

// # Input Format
// * The first line contains a single integer N representing
// * the length of the array A followed by N elements of the array A.

// # Output Format
// * A single line output containing two space-separated integers.
// * The first integer is the maximum value of the array.
// * The second integer is the minimum value of the array. 
// * There is no space after the minimum value in the output format. 
// * There is only a single space between the maximum and minimum value.

// # Example
// $ Input 1
// * 5 1 2 3 4 5

// $ Output 1
// * 5 1

// $ Input 2
// * 4 10 50 40 80

// $ Output 2
// * 80 10

// # Note:
// * There is no space after the minimum value in the output format.
// * There is only a single space between the maximum and minimum value.

import java.util.Scanner;

public class Main {

    public static void readArrayInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void printMaxmiumAndMinimum(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max + " " + min);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];

        readArrayInput(arr, sc);
        printMaxmiumAndMinimum(arr);
    }
}
