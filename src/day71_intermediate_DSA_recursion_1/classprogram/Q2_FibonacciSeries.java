package day71_intermediate_DSA_recursion_1.classprogram;

public class Q2_FibonacciSeries {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
