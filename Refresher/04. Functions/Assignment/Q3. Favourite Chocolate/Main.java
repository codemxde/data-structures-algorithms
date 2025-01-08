// # Problem Description
// * Alex is fond of chocolates. He has initially A rupees and
// * a single chocolate costs B rupees.

// * But too many chocolates are not good for health, so Alex will
// * not buy more than C chocolates.

// * Find the number of chocolates Alex will buy with the money he has.

// # Input Format
// * The First argument given is an integer A.
// * The Second argument given is an integer B.
// * The Third argument given is an integer C.

// # Constraints
// * 1 <= A, B, C <= 10^6


// # Output Format
// * Return the number of chocolates Alex will buy.

// # Example
// $ Input 1
// * A = 10
// * B = 3
// * C = 4

// $ Output 1
// * 3 (Since Alex has only 10 ruppees, he can buy 3 chocolates.)

// $ Input 2
// * A = 10
// * B = 2
// * C = 2

// $ Output 2
// * 2 (Alex can buy 5 chocolates with the money he has, but he will buy only 2 as more than 2 chocolate can be harmful to him.)

import java.util.Scanner;

public class Main {
    
    public static int solve(int A, int B, int C) {
        int chocolates = A / B;
        return chocolates < C ? chocolates : C;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println(solve(A, B, C));
    }
}
