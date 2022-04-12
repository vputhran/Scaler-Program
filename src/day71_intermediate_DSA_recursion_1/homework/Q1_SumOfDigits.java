package day71_intermediate_DSA_recursion_1.homework;

public class Q1_SumOfDigits {
    public static void main(String[] args) {
        int A = 250;
        System.out.println(solve(A));
    }

    public static int solve(int A) {
        if(A == 0) return 0;
        return A % 10 + solve(A / 10);
    }
}
