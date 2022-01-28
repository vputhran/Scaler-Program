package day52_intermediate_arrays_prefix_sum.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4_RangeSumQuery {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        B.add(
                new ArrayList<Integer>(Arrays.asList(1,4)));
        B.add(
                new ArrayList<Integer>(Arrays.asList(2,3)));
        B.add(
                new ArrayList<Integer>(Arrays.asList(3,4)));
//        System.out.println(rangeSum(A,B));
        rangeSum(A,B);
    }

    public static void rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> preSum = new ArrayList<>();
        preSum.add(A.get(0));
        for (int i = 1; i < A.size() ; i++) {
            preSum.add(preSum.get(i - 1) + A.get(i));
        }
        ArrayList<Long> sum = new ArrayList<>();
        for (int i = 0; i < B.size(); i++) {
            for (int j = 0; j < 2; j++) {
                sum.add(Long.valueOf(preSum.get(B.get(i).get(j+1)-1)- preSum.get(B.get(i).get(j)-1)));
            }
        }
    }
}
