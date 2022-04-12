package day71_intermediate_DSA_recursion_1.homework;

public class Q3_Output_7 {
    public static void main(String[] args) {
        int ans = fun(2, 10);
        System.out.println(ans);
    }

    public static int fun(int x, int n) {
        if (n == 0) return 1;
        else if (n % 2 ==0)
            return fun(x * x, n / 2);
        else
            return x * fun(x * x, (n - 1) / 2);
    }
}
