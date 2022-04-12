package day72_intermediate_DSA_recursion_2.assignment;

public class Q2_SumOfDigits {
    public static void main(String[] args) {
        int A = 4655;
        System.out.println(solve(A));
    }

    public static int solve(int A) {
        if (A <= 9) return A;
        return (solve(A / 10) + (A % 10));
    }
}
