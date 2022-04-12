package day64__itermediate_DSA_Hashing_1.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q1_Sub_ArrayWith_0_sum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(5, 17, -22, 11));
        System.out.println(solve(A));
    }

    /*Ref: https://www.tutorialcup.com/interview/hashing/find-if-there-is-a-subarray-with-0-sum.htm */
    public static int solve(ArrayList<Integer> A) {
        Set<Integer> set = new HashSet<Integer>();
        int Sum = 0;
        for (int i = 0; i < A.size(); i++)
        {
            Sum += A.get(i);
            if (A.get(i) == 0 || Sum == 0 || set.contains(Sum))
                return 1;
            set.add(Sum);
        }
        return 0;
    }
}
