package day84_advanced_DSA_maths_GCD.classwork;

//Q1. Given GCD of 2 numbers find the GCD. A,B>0

public class Q1_GCD_Of_2numbers_bruteForceApproach {
    public static void main(String[] args) {
        int A = 18;
        int B = 12;
        System.out.println(gcd(A, B));
        System.out.println(gcd_sqrt_Approach(A, B));
    }

    public static int gcd(int A, int B) {
        int ans = Math.min(A, B);
        if (ans == 0) {
            return Math.max(A, B);
        }
        for (int i = ans; i >= 1; i--) {
            if (A % i == 0 && B % i == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int gcd_sqrt_Approach(int A, int B) {
        int newA = Math.max(A, B);
        int newB = Math.min(A, B);
        int fact = 0;

        for (int i = 1; i <= Math.sqrt(newB); i++) {
            if (newB % i == 0 && newA % (newB / i) == 0) {
                fact = newB / i;
            }
        }
        return fact;
    }
}
