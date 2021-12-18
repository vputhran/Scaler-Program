package day5.homework;

import java.util.Arrays;

public class MinimumPicks_Q3 {
    public static void main(String[] args) {
        int[] ar = {-98, 54, -52, 15, 23, -97, 12, -64, 52, 85};
        System.out.println(solve(ar));
    }
    public static int solve(int[] A) {
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if  (A[i] % 2 == 0) {
                if (A[i] > max) {
                    max = A[i];
                }
            } else {
                if (A[i] < min) {
                    min = A[i];
                }
            }
        }
        int diff = max - min;
        return diff;
    }
}
