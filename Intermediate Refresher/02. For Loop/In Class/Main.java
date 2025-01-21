public class Main {

    public static int countFactors(int N) {
        int count = 0;

        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                if (i == N/i) {
                    count++;
                } else {
                    count +=2;
                }
            }
            // * Optimization
            if (count > 2) {
                break;
            }
        }
        return count;
    }

    public static void checkPrime(int N) {
        String res = "";
        if (countFactors(N) == 2) {
            res = "prime";
        } else {
            res = "not prime";
        }

        System.out.println(N + " is " + res);
    }

    public static void printOddNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        
        // # Question 1
        // * Given a number N, check if it is a Prime Number
        checkPrime(1);

        // # Question 2
        // * Print Odd Numbers from 1 to N
        printOddNumbers(10);

        int x = 10;
        int y = 10;
         {
            y = 15;
            System.out.println(x + " " + y);
         } 
         {
            System.out.println(x + " " + y);
         }

    }
}