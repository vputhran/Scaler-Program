package day72_intermediate_DSA_recursion_2.assignment;

public class Q3_IsMagic {
    public static void main(String[] args) {
        int A = 83557;
        System.out.println(solve(A));
    }

    public static int solve(int A) {
        if (A == 1) return 1;
        if (A <= 9) return 0;
        A = digitSum(A);
        return solve(A);
    }
    public static int digitSum(int A) {
        if (A <= 9) return A;
        return  (digitSum(A / 10) + A % 10);
    }
}
