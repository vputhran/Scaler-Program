package day81_advanced_DSA_bit_manipulations_1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2_SingleNumber2 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 2, 2, 3, 4, 4, 4, 5, 5, 5));
        System.out.println(singleNumber(A));
    }

    public static boolean checkBit(int N, int i) {
        return ((N >> i) & 1) == 1;
    }
    public static int singleNumber(final List<Integer> A) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < A.size(); j++) {
                if (checkBit(A.get(j), i)) {
                    count++;
                }
            }
            if (count % 3 == 1) {
                ans = ans + (1 << i);
            }
        }
        return ans;
    }

}
