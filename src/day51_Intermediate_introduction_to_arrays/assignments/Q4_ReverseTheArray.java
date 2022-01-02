package day51_Intermediate_introduction_to_arrays.assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4_ReverseTheArray {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(solve(A));
    }

    public static ArrayList<Integer> solve(final List<Integer> A) {

        ArrayList<Integer> newA = new ArrayList<Integer>();

        for (int i = A.size()-1; i > 0 ; i--) {
            newA.add(A.get(i));
        }
        return newA;
    }
}
