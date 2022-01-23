package day52_intermediate_arrays_prefix_sum.classprograms;

import java.util.Arrays;

public class Q2_EquilibriumIndex {
    public static void main(String[] args) {
        int[] ar = {10, -1, 5, -2, -12, 0};
        System.out.println(Arrays.toString(ar));

        int[] prefSum = new int[ar.length];
        prefSum[0] = ar[0];
        for (int i = 1; i < ar.length; i++) {
            prefSum[i] = prefSum[i - 1] + ar[i];
        }
        System.out.println(Arrays.toString(prefSum));
        System.out.println(equIndex(prefSum));
    }

    public static boolean equIndex(int[] preSum) {
        for (int i = 0; i < preSum.length ; i++) {
            int leftSum = 0;
            int rightSum = 0;
            if (i == 0) {
//                leftSum = 0;
                rightSum = preSum[preSum.length-1]-preSum[i];
            } else if (i == preSum.length - 1) {
//                rightSum = 0;
                leftSum = preSum[i-1];
            } else {
                leftSum = preSum[i-1]; // this gives the prefix sum till (i-1) which is the left sum
                rightSum = preSum[preSum.length-1]-preSum[i]; // return the dif from last index to current index
            }

            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

}
