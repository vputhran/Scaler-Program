package day69_intermediate_DSA_hashing_1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q3_LargestContinuousSequenceZeroSum {
    public static void main(String[] args) {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -2, 4, -4));
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -3, 3));  // prefix array with 0 value
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-19, 8, 2, -8, 19, 5, -2, -23)); // no sub-array with 0 sum
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10, 13, -1, 8, 29, 1, 24, 8, 21, 20, 21, -23, -21, 0 )); // Array with 0 value - meaning 0 is sub-array in itself.
        System.out.println(lszero(A));
    }

    public static ArrayList<Integer> lszero(ArrayList<Integer> A) {
        // Creating the prefix sum array
        ArrayList<Integer> prSum = new ArrayList<>();
        prSum.add(A.get(0));
        for (int i = 1; i < A.size(); i++) {
            prSum.add(i, prSum.get(i - 1) + A.get(i));
        }

        int maxLength = Integer.MIN_VALUE;
        int finalLftIdx = -1;
        int finalRhtIdx = -1;
        //HaspMap to check for duplicate values in prSum - and store the index of occurrence of each element in the value of the hashmap
        HashMap<Integer, Integer> a = new HashMap<>();
        int lIdx = -1;
        int rIdx = -1;
        for (int i = 0; i < prSum.size(); i++) {
            int length = 0;
            if (prSum.get(i) == 0) {  //Checking if prSum has a value 0
                lIdx = 0;
                rIdx = i;
                length = rIdx - lIdx;
            } else if (!a.containsKey(prSum.get(i))) { // If the value is not in hashmap, store it (key) and the index (value) of occurrence in the hashmap
                a.put(prSum.get(i), i);
            } else {                   // If the value is in the hashmap,
                lIdx = a.get(prSum.get(i)) + 1; //left index is previous index (stored in hashmap) + 1
                rIdx = i;                      // right index
                length = rIdx - lIdx;
            }
            if (length > maxLength) {
                maxLength = length;
                finalLftIdx = lIdx;
                finalRhtIdx = rIdx;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if (finalLftIdx < 0 && finalRhtIdx < 0){  // Edge case - when no sub-array has 0 sum. returning an empty array
            for(int i = 0; i < A.size(); i++){    // Edge case - Original Array has a 0
                if(A.get(i) == 0){
                    ans.add(0);
                    return ans;
                }
            } return ans;
        } else {
            for (int i = finalLftIdx; i <= finalRhtIdx; i++) {
                ans.add(A.get(i));
            }
        }

        return ans;
    }
}
