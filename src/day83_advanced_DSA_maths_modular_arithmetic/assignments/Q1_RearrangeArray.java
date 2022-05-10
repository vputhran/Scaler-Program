package day83_advanced_DSA_maths_modular_arithmetic.assignments;

import java.util.ArrayList;
import java.util.Arrays;

// Approach discussed in class
public class Q1_RearrangeArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 0));
        arrange(A);
    }
    public static void arrange(ArrayList<Integer> a) {
        int n = a.size();
        for (int i = 0; i < n; i++) {
            a.set(i, a.get(i) * n);
        }

        for (int i = 0; i < n; i++) {
            int idx = a.get(i) / n;
            int val = a.get(idx) / n;
            a.set(i, a.get(i) + val);
        }

        for (int i = 0; i < n; i++) {
            a.set(i, a.get(i) % n);
        }
        System.out.println(a);
    }
}
