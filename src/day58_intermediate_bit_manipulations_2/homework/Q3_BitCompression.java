package day58_intermediate_bit_manipulations_2.homework;

import java.util.Arrays;

public class Q3_BitCompression {
    public static void main(String[] args) {
        int[] A = {21, 9, 25, 16, 10, 31, 15, 30, 30};
        System.out.println(compressBits(A));
        System.out.println(compressBits_Optimised(A));
    }
    // Brute force Approach
    public static int compressBits(int[] A) {
        int[] aNew = new int[A.length];
        for (int i = 0; i < A.length-1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                aNew[i] = A[i] & A[j];
                aNew[j] = A[i] | A[j];
                A[i] = aNew[i];
                A[j] = aNew[j];
            }
        }
        System.out.println(Arrays.toString(aNew));
        int ans = 0;
        for (int i = 0; i < aNew.length; i++) {
            ans ^= aNew[i];
        }
        return ans;
    }

    // Optimised Approach
    public static int compressBits_Optimised(int[] A) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            ans ^= A[i];
        }
        return ans;
    }

}
