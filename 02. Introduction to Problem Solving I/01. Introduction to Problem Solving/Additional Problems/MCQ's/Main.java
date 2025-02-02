public class Main {
    
    public static void main(String[] args) {
        // This is a compilation of MCQ's from Q2-Q4

        // # Q3. How many elements are there between [135, 246] (inclusive of them) ?
        // $ Answer: 112

        // # Q4. Find the total number of iterations in the following code:
        // * void solve (int N, int M) {
        // *    int count = 0;
        // *    for (int i = 1; i <= N; i++) {
        // *        if (N % i == 0)
        // *            count++;
        // *    }
        // * 
        // *    for (int i = 1; i <= M; i++) {
        // *        if (M % i == 0)
        // *            count++;
        // *    }
        // *    print(count);
        // * }
        // $ Answer: N + M

        // # Q4. Find the total number of iterations in the following code snippet:
        // # NOTE: ^ denotes power, not Bitwise XOR.
        // * for (int i = 1; i <= n; i++) {
        // *    for (int j = 1; j <= 3 ^ i; j++) {
        // *        print(i + j);
        // *    }
        // * }
        // $ Answer: 3 + 9 + 27 + …. + 3^n times.
    }
}
