package day83_advanced_DSA_maths_modular_arithmetic.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q5_PairSumDivisibleBy_M {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int B = 2;
        System.out.println(solve(A, B));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < A.size(); i++) {
            hm.put(A.get(i) % B, hm.getOrDefault(A.get(i) % B, 0) + 1);
        }

        int ans = hm.get(0) * ((hm.get(0) - 1) / 2);

        int i = 1, j = B - 1;
        while (i < j) {
            ans = ans + hm.get(i) * hm.get(j);
            i++;
            j--;
        }
        if (B % 2 == 0) {
            ans = ans + hm.get(B / 2) * ((hm.get(B / 2) - 1) / 2);
        }
        return ans;
    }
}
