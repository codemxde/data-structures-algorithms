// # Problem Description
// * Write a program to print all Natural numbers
// * from N to 1 where you have to take N as input from user

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while (number > 0) {
            System.out.print(number + " ");
            number--;
        }
    }
}