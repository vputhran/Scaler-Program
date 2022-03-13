package day56_intermediate_arrays_interview_problems.homework;

import java.util.Arrays;

public class Q1_MaximumPositivity {
    public static void main(String[] args) {
        int[] A = {-5173778, -8176176, 1694510, 7089884, -1394259, 1146372, -2502339, 1544618, 6602022, 4330572};
        System.out.println(Arrays.toString(solve(A)));
    }
    public static int[] solve(int[] A) {
        int maxCount = Integer.MIN_VALUE;
        int lstIdx = -1;
        int max_lstIdx = -1;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                count++;
            } else {
                lstIdx = i - 1;
                if (count > maxCount) {
                    maxCount = count;
                    max_lstIdx = lstIdx;
                }
                count = 0;
                continue;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            max_lstIdx = A.length-1;
        }

//        if (maxCount == Integer.MIN_VALUE) {
//            maxCount = A.length;
//            max_lstIdx = A.length - 1;
//        }


        int stIdx = max_lstIdx - (maxCount - 1);
        int[] sub = new int[maxCount];
        int j = 0;
        for (int i = stIdx; i <= max_lstIdx ; i++) {
            sub[j] = A[i];
            j++;
        }
        return sub;
    }
}
