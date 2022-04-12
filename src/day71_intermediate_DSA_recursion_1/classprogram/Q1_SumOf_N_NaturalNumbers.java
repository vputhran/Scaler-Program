package day71_intermediate_DSA_recursion_1.classprogram;

public class Q1_SumOf_N_NaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    public static int sum(int n) {

        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }
}
