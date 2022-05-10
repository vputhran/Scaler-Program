package day83_advanced_DSA_maths_modular_arithmetic.homework;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Q1_CountOfDivisors {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(8, 9, 10));
        System.out.println(solve(A));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < A.size()) {
            int count = 0;
            for (int j = 1; j * j <= A.get(i); j++) {
                if (A.get(i) % j == 0) {
                    count++;
                }
            }
            ans.add(count * 2);
            i++;
        }
        return ans;
    }

}
