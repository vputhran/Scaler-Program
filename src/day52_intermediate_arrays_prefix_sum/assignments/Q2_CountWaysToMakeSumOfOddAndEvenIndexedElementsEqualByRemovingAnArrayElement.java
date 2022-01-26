package day52_intermediate_arrays_prefix_sum.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2_CountWaysToMakeSumOfOddAndEvenIndexedElementsEqualByRemovingAnArrayElement {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 1, 1));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int count = 0;
        ArrayList<Integer> ePS = new ArrayList<>();
        ePS.add(A.get(0));
        for (int i = 1; i < A.size(); i++) {
            if (i % 2 == 0) {
                ePS.add(ePS.get(i - 1) + A.get(i));
            } else {
                ePS.add(ePS.get(i - 1));
            }
        }
        ArrayList<Integer> oPS = new ArrayList<>();
        oPS.add(0);
        for (int i = 1; i < A.size(); i++) {
            if (i % 2 != 0) {
                oPS.add(oPS.get(i - 1) + A.get(i));
            } else {
                oPS.add(oPS.get(i - 1));
            }
        }

        for (int i = 0; i < A.size(); i++) {
            int oSum;
            int eSum;

            int eRange = oPS.get(oPS.size() - 1) - oPS.get(i);
            int oRange = ePS.get(ePS.size() - 1) - ePS.get(i);

            if (i == 0) {
                eSum = eRange;
                oSum = oRange;
            } else {
                eSum = ePS.get(i - 1) + eRange;
                oSum = oPS.get(i - 1) + oRange;
            }
            if (eSum == oSum) {
                count++;
            }
        }
        return count;
    }
}
