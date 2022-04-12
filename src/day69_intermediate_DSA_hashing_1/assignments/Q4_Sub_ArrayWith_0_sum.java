package day69_intermediate_DSA_hashing_1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q4_Sub_ArrayWith_0_sum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-1, 1));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {

        //prefix sum array
        ArrayList<Long> pSum = new ArrayList<>();
        pSum.add((long) A.get(0));
        for (int i = 1; i < A.size(); i++) {
            pSum.add(pSum.get(i - 1) + A.get(i));
        }
        HashSet<Long> hs = new HashSet<>();
        for (int i = 0; i < pSum.size(); i++) {

            if (pSum.get(i) == 0) { // Checking if the pSum has a value 0
                return 1;
            } else if (hs.contains(pSum.get(i))) { // Checking for duplicates in pSum
                return 1;
            }else {
                hs.add(pSum.get(i));
            }
        }
        return 0;
    }
}
