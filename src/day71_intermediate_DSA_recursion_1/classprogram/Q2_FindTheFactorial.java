package day71_intermediate_DSA_recursion_1.classprogram;

public class Q2_FindTheFactorial {
    public static void main(String[] args) {
        System.out.println(solve(4));
    }

    public static int solve(int A) {
       if (A == 0 || A == 1) return 1;
        return solve(A - 1) * A;
    }
}
