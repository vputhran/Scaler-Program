/*Problem 2:  Given an array, find the pair of numbers with minimum difference
A = [10, 30, 21, 28, 11] */


package day15.classproblems;

import java.util.Arrays;

public class MinimumDifference {
    public static void main(String[] args) {
        int[] ar = {10, 30, 21, 28, 17, 10};
        System.out.println(minDiff(ar));

    }

    public static int minDiff(int[] A) {
        Arrays.sort(A);
        int currentMin = Integer.MAX_VALUE;
        for (int i = 0; i < A.length-2; i++) {
            currentMin = Integer.min(currentMin, (A[i + 1] - A[i]));
        }
        // Print the minimum pair
        for (int i = 0; i < A.length-2; i++) {
            if ((A[i + 1] - A[i] == currentMin)) {
                System.out.println(A[i]+" "+A[i+1]);
            }
        }
        return currentMin;
    }
}
