package day84_advanced_DSA_maths_GCD.classwork;

public class Q1_GCD_Using_Euclids_Algo {
    public static void main(String[] args) {
        int A = 18;
        int B = 12;
        System.out.println(gcd(A, B));
        System.out.println(gcd_optimised(A, B));
    }

    public static int gcd(int A, int B) {
        if (B > A) {
            int temp = A;
            A = B;
            B = temp;
        }

        if (B == 0) { // Base case
            return A;
        }
        return gcd(A - B, B);
    }

    /*Further, optimising Euclides Algo
    * modulo is nothing by continuous subtraction*/

    public static int gcd_optimised(int A, int B) {
        if (B == 0) {
            return A;
        }
        return gcd_optimised(B, A % B);
    }
}
