package day78_advanced_DSA_arrays_1.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_MaximumAbsoluteDifference {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-98, -5, 37, -97, 38, 22, 70, 42, 61, 84)); // Expected 191
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-39, -24, 82, 95, 91, -65, 16, -76, -56, 70)); // Expected 175
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2));
        System.out.println(maxArr_Brute(A));
    }

    //Brute Force
    public static int maxArr_Brute(ArrayList<Integer> A) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < A.size(); i++) {
            int sum = 0;
            for (int j = 0; j < A.size(); j++) {
                sum = Math.abs(A.get(i) - A.get(j)) + Math.abs(i - j);
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
    // Optimal Approach
    //Ref:  https://www.geeksforgeeks.org/maximum-absolute-difference-value-index-sums/
    //Ref: https://www.youtube.com/watch?v=tN8wEDNZKF4
    public static int maxArr_Optimal(ArrayList<Integer> A) {
        int max_1 = Integer.MIN_VALUE;
        int min_1 = Integer.MAX_VALUE;

        int max_2 = Integer.MIN_VALUE;
        int min_2 = Integer.MAX_VALUE;

        for (int i = 0; i < A.size(); i++) {
            max_1 = Math.max(max_1, A.get(i) + i);
            min_1 = Math.min(min_1, A.get(i) + i);

            max_2 = Math.max(max_2, A.get(i) - i);
            min_2 = Math.min(min_2, A.get(i) - i);
        }
        return Math.max(max_1 - min_1, max_2 - min_2);
    }
}
