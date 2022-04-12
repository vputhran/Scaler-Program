package day58_intermediate_bit_manipulations_2.homework;

import java.util.Arrays;

public class Q1_SingleNumber_III {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 1, 2, 4};
        solve(A);
    }

    public static void solve(int[] A) {
        int xor = A[0];
        int n = A.length;
        for (int i = 1; i < n; i++) {
            xor ^= A[i];
        }
        System.out.println(xor);

        // Checking which bit is set in xor
        int i = 0;
        if ((xor & 1) == 1) {
            i = i;
        } else {

        }
    }
}
