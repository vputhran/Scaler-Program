package day83_advanced_DSA_maths_modular_arithmetic.assignments;

public class Q3_ImplementPowerFunction {
    public static void main(String[] args) {
        int A = 71045970, B = 41535484, C = 64735492;
//        int A = -1, B = 1, C = 20;
//        int A = 2, B = 3, C = 3;
        System.out.println(pow(A, B, C));
    }

    public static int pow(int A, int B, int C) {
        if (B == 0) {
            return 1 % C;
        }
        long ans = pow(A, B / 2, C);
        ans = (ans * ans) % C;
        if (B % 2 != 0) {
            ans = ans * A;
        }
        return (int) ((ans + C) % C);
    }
}
