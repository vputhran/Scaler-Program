package day52_intermediate_arrays_prefix_sum.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_EquilibriumIndexOfAnArray {
    public static void main(String[] args) {
        int[] ar = {-7, 1, 5, 2, -4, 3, 0};

        ArrayList<Integer> prArr = new ArrayList<Integer>(Arrays.asList(-7, 1, 5, 2, -4, 3, 0));
        System.out.println(solve(prArr));

    }

    public static int eqiIndex(int[] preArr) {
        int lSum;
        int rSum;
        for (int i = 1; i < preArr.length-1; i++) {
            lSum = preArr[i - 1];
            rSum = preArr[preArr.length - 1] - preArr[i];
            if (lSum == rSum) {
                return i;
            }
        }
        return -1;
    }

    public static int solve(ArrayList<Integer> A) {
        ArrayList<Integer> preSum = new ArrayList<>();

        preSum.set(0, A.get(0));
        for (int i = 1; i < A.size() ; i++) {
            preSum.set(i, preSum.get(i - 1) + A.get(i));
        }
        int lSum;
        int rSum;
        for (int i = 1; i < preSum.size()-1; i++) {
            lSum = preSum.get(i - 1);
            rSum = preSum.get(preSum.size() - 1) - preSum.get(i);
            if (lSum == rSum) {
                return i;
            }
        }
        return -1;
    }
}
