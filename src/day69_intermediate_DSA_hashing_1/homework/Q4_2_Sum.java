package day69_intermediate_DSA_hashing_1.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q4_2_Sum {
    public static void main(String[] args) {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
//        int B = 9;
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8));
//          int B = -3;
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10, -3, 5, -7, -4, 5, 6, -7, 8, -5, 8, 0, 8, -5, -10, -1, 1, -6, 4, -1, -2, -2, 10, -2, -4, -7, 5, 1, 7, -10, 0, 5, 8, 6, -8, 8, -8, -8, 3, -9, -10, -5, -5, -10, 10, -4, 8, 0, -6, -2, 3, 7, -5, 5, 1, -7, 0, -5, 1, -3, 10, -4, -3, 3, 3, 5, 1, -2, -6, 3, -4, 10, -10, -3, -8, 2, -2, -3, 0, 10, -6, -8, -10, 6, 7, 0, 3, 9, -10, -7, 8, -7, -70));
        int B = -2;
        System.out.println(twoSum(A, B));
    }
    // Check the TA  Help for better approach
    public static ArrayList<Integer> twoSum(final List<Integer> A, int B) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            if(!hm.containsKey(A.get(i))){
                hm.put(A.get(i), i);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int minA_Idx = Integer.MAX_VALUE;
        int minB_Idx = Integer.MAX_VALUE;
        int aIdx = -1;
        int bIdx = -1;
        for (int i = 0; i < A.size(); i++) {
            int checkVal = B - A.get(i);
            if (hm.containsKey(checkVal) && hm.get(checkVal) != i ) {
                aIdx = Math.min(i + 1, hm.get(checkVal) + 1);
                bIdx = Math.max(i + 1, hm.get(checkVal) + 1);
//                System.out.println(aIdx);
//                System.out.println(bIdx);
            }
            if (minB_Idx > bIdx && bIdx != -1) {
                minA_Idx = aIdx;
                minB_Idx = bIdx;
            }
        }


        if (minA_Idx != Integer.MAX_VALUE || minB_Idx != Integer.MAX_VALUE) {
            ans.add(0, minA_Idx);
            ans.add(1, minB_Idx);
        }
        // System.out.println(minA_Idx + " " +minB_Idx);
        return ans;
    }
}
