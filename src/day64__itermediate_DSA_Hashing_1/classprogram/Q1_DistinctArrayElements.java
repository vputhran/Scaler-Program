package day64__itermediate_DSA_Hashing_1.classprogram;

import java.util.HashSet;
import java.util.Set;

public class Q1_DistinctArrayElements {
    public static void main(String[] args) {
        int[] A = {7, 3, 2, 1, 3, 7, 0};
        Set<Integer> set = new HashSet<>();
        for (int i : A) {
            set.add(i);
        }
        System.out.println("Distinct Element = "+ set.size());
    }
}
