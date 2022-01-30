package day53_intermediate_arrays_carry_forward.classprograms;

import java.util.Arrays;

public class Q1_LeftMaxArray {
    public static void main(String[] args) {
        int[] ar = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};

        System.out.println(Arrays.toString(leftMax(ar)));
        System.out.println(Arrays.toString(leftMax2(ar)));
    }

    public static int[] leftMax(int[] A) {
        int[] leMax = new int[A.length];

        leMax[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > leMax[i - 1]) {
                leMax[i] = A[i];
            } else {
                leMax[i] = leMax[i - 1];
            }
        }
        return leMax;
    }

    // Another approach using Math.max
    public static int[] leftMax2(int[] A) {
        int[] leMax2 = new int[A.length];

        leMax2[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            leMax2[i] = Math.max(leMax2[i - 1], A[i]);
        }
        return leMax2;
    }
}