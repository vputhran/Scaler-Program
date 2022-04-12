package day69_intermediate_DSA_hashing_1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q2_FirstRepeatingElement {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10, 5, 3, 4, 3, 5, 6));
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> a = new HashMap<>();

        for (Integer integer : A) {
            a.put(integer, a.getOrDefault(integer, 0) + 1);
        }

        for (Integer integer : A) {
            if (a.get(integer) > 1) {
                return integer;
            }
        }
        return -1;
    }
}