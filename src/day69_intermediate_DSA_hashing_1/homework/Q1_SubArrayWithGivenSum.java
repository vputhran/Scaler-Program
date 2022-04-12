package day69_intermediate_DSA_hashing_1.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q1_SubArrayWithGivenSum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int B = 5;
        System.out.println(solve(A, B));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int curSum = 0;
        int start = 0;
        int end = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.size(); i++) {
            curSum += A.get(i);

            if (curSum - B == 0) {
                start = 0;
                end = i;
                break;
            }

            if (map.containsKey(curSum - B)) {
                start = map.get(curSum - B) + 1;
                end = i;
                break;
            }
            map.put(curSum, i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if (end == -1) {
            ans.add(0, -1);
            return A;
        }else {
            ans.add(0, start);
            ans.add(1, end);
            return ans;
        }
    }
}
