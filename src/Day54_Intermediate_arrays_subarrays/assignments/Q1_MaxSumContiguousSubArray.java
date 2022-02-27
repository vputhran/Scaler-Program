package Day54_Intermediate_arrays_subarrays.assignments;

import javax.swing.*;

public class Q1_MaxSumContiguousSubArray {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, -10};
        System.out.println(maxSubArray(ar));
        System.out.println(maxSubArray_KadanesAlgorithm(ar));
    }

    public static int maxSubArray(final int[] A) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    public static int maxSubArray_KadanesAlgorithm(final int[] A) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < A.length; i++) {
            max_ending_here += A[i];
            if (max_ending_here > max_so_far) {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        return max_so_far;

    }
}
