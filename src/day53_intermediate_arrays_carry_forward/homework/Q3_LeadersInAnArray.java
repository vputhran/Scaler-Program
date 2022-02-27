package day53_intermediate_arrays_carry_forward.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Q3_LeadersInAnArray {
    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};
        System.out.println(Arrays.toString(solve(A)));
    }
    public static int[] solve(int[] A) {
        ArrayList<Integer> leader = new ArrayList<>();
        int max = A[A.length - 1];
        leader.add(max);
        for (int i = A.length - 2; i >= 0; i--) {
            if (A[i] > max) {
                max = A[i];
                leader.add(A[i]);
            }
        }
        int[] leadArr = new int[leader.size()];
        for (int i = 0; i < leadArr.length; i++) {
            leadArr[i] = leader.get(i);
        }
        return leadArr;
    }
}
