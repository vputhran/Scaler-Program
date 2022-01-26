package day52_intermediate_arrays_prefix_sum.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Q3_PickFromBothSides {
    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(5, -2, 3, 1, 2));
        System.out.println(solve(ar,3));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int sum = 0;
        // Prefix array
        ArrayList<Integer> preAr = new ArrayList<>();
        preAr.add(A.get(0));
        for (int i = 1; i < A.size(); i++) {
            preAr.add(preAr.get(i - 1) + A.get(i));
        }

        //Suffix Array
        ArrayList<Integer> suffixAr = new ArrayList<>();
        suffixAr.add(A.get(A.size() - 1));
        for (int j = A.size() - 2; j >= 0; j--) {
            suffixAr.add(suffixAr.get(j - 1) + A.get(j));
        }
        return sum;
    }
}
