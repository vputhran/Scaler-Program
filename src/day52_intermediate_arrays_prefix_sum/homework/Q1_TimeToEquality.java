package day52_intermediate_arrays_prefix_sum.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_TimeToEquality {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 4, 1, 3, 2));
        System.out.println(solve(A));
    }

    // Approach - Find the Max element in the array
    // Difference of the max element with the array element will be the time take to increment each element to make then all equal.
    public static int solve(ArrayList<Integer> A) {
        int maxEle = Integer.MIN_VALUE;

        for (Integer integer : A) {
            if (integer > maxEle) {
                maxEle = integer;
            }
        }
        int timeCount = 0;
        for (Integer integer : A) {
            timeCount += maxEle - integer;
        }
        return timeCount;
    }
}
