package day81_advanced_DSA_bit_manipulations_1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1_SingleNumber {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1));
        System.out.println(singleNumber(ar));
    }

    public static int singleNumber(final List<Integer> A) {
        int singleNum = 0;
        for (int i = 0; i < A.size(); i++) {
            singleNum = singleNum ^ A.get(i);
        }
        return singleNum;
    }
}
