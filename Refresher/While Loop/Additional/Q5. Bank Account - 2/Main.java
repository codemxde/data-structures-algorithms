// # Problem Description
// * You have been provided with a bank account that has an initial balance
// * of N amount. You are now required to perform two operations on this account,
// * namely, ADD and SUBTRACT.

// * ADD operation: This operation increases the account balance by a
// * certain amount and you are expected to print the updated balance after
// * each ADD operation.

// * SUBTRACT operation: This operation decreases the account balance by a
// * certain amount and you are again expected to print the updated balance
// * after each SUBTRACT operation.

// * However, if the amount you are trying to subtract (i.e., debit) from
// * the account balance is greater than the current balance, you should
// * print "Insufficient Funds" (without quotes) instead of the updated balance.
// * In this case, the operation should be skipped, and the account balance
// * should remain unchanged.

// * Note : Initial Amount N and Amount that is given are larger numbers.

// # Problem Constraints
// * 1 <= N, X <= 10^11
// * 1 <= Number of operations <= 10^5

// # Input Format
// * The initial balance in the bank account is provided as a single integer N.

// * The number of operations to be performed on the bank account is provided as a single integer M.

// * Each of the next M lines contains two space-separated integers Type and Amount(X).

// * The value of Type can either be 1 or 2. If Type is 1, then the ADD operation needs to be performed,
// * and if Type is 2, then the SUBTRACT operation needs to be performed.

// * The value of Amount(X) represents the amount of money to be added or subtracted from the account.

// # Output Format
// * Print Amount in the bank balance after each operation on a new line.

// # Example
// $ Input 1
// * 1000
// * 3
// * 1 500
// * 2 1400
// * 2 500

// $ Output 1
// * 1500
// * 100
// * Insufficient Funds

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long balance = sc.nextLong();
        long noOfTransactions = sc.nextLong();

        while (noOfTransactions > 0) {
            int operation = sc.nextInt();
            long amount = sc.nextLong();

            switch (operation) {
                case 1:
                    balance += amount;
                    System.out.println(balance);
                    break;
            
                case 2:
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println(balance);
                    } else {
                        System.out.println("Insufficient Funds");
                    }
                    break;
            }
            noOfTransactions--;
        }
    }
}
