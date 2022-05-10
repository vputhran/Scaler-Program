package day83_advanced_DSA_maths_modular_arithmetic.assignments;

public class Q2_A_B_and_Modulo {
    public static void main(String[] args) {
        int A = 5068821;
        int B = 9592648;
//        int A = 8309642;
//        int B = 5095206;

//        int A = 5;
//        int B = 10;
        System.out.println(solve(A, B));
    }

    public static int solve(int A, int B) {
        int n = 0;
        if (Math.max(A, B) == A) {
            n = A - B;
        } else {
            n = B - A;
        }
        int maxM = 0;
        for (int i = n/2; i <= n; i++) {
            if (n % i == 0) {
                maxM = Math.max(maxM, i);
            }
        }
        return maxM;
    }
}
