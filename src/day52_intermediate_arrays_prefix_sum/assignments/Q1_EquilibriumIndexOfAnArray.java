package day52_intermediate_arrays_prefix_sum.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_EquilibriumIndexOfAnArray {
    public static void main(String[] args) {

        ArrayList<Integer> prArr = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        System.out.println(solve(prArr));

    }

    //Implementation using Array
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

    // Implementation using arraylist
    public static int solve(ArrayList<Integer> A) {
        ArrayList<Integer> preSum = new ArrayList<>();

        preSum.add(A.get(0));
        for (int i = 1; i < A.size() ; i++) {
            preSum.add(preSum.get(i - 1) + A.get(i));
        }
        int lSum;
        int rSum;

        // if- condition to handle all zero input
        if(preSum. get(preSum. size()-1) - preSum. get(0) == 0) return 0;

        // Check if lSum = rSum for values of prefix sum array
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
