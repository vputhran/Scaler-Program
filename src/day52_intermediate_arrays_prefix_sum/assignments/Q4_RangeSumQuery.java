package day52_intermediate_arrays_prefix_sum.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4_RangeSumQuery {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(
                new ArrayList<>(Arrays.asList(1, 4)));
        B.add(
                new ArrayList<>(Arrays.asList(2, 3)));
        B.add(
                new ArrayList<>(Arrays.asList(3, 4)));
        System.out.println(rangeSum(A,B));

    }

    public static ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Long> preSum = new ArrayList<>(); // Long because of large in puts
        //Adding 0 to preSum(0) because this array needs to start with 0 for calculation --> [0,1,3,4,10,15]
        preSum.add(0L); // L -->  Signifies long value
        for (int i = 1; i <= A.size() ; i++) {
            preSum.add((long)preSum.get(i - 1) + A.get(i-1));
        }
        ArrayList<Long> sum = new ArrayList<>();
        for (int i = 0; i < B.size(); i++) {
                sum.add(preSum.get(B.get(i).get(1)) - preSum.get(B.get(i).get(0) - 1));
        }
        return sum;
    }
}
