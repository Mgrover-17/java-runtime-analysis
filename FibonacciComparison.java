public class FibonacciComparison {
    public static void main(String[] args) {
        int n = 30;

        long startTime = System.nanoTime();
        int fibRecursive = fibonacciRecursive(n);
        long recursiveTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        int fibIterative = fibonacciIterative(n);
        long iterativeTime = System.nanoTime() - startTime;

        System.out.println("Fibonacci Number for N = " + n);
        System.out.println("Recursive Result: " + fibRecursive + " | Time: " + (recursiveTime / 1_000_000.0) + " ms");
        System.out.println("Iterative Result: " + fibIterative + " | Time: " + (iterativeTime / 1_000_000.0) + " ms");
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
