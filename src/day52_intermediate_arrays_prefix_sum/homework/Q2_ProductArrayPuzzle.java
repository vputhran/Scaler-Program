package day52_intermediate_arrays_prefix_sum.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2_ProductArrayPuzzle {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(solve(A));

    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int prod = 1;
        // Finding the product of all the elements in the array
        for (Integer integer : A) {
            prod *= integer;
        }

        // prodArr = prod / A[i]
        ArrayList<Integer> prodArr = new ArrayList<>();
        for (Integer integer : A) {
            prodArr.add(prod / integer);
        }
        return prodArr;
    }
}
