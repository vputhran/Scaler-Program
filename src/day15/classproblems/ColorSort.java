package day15.classproblems;

import java.util.Arrays;
import java.util.HashMap;

public class ColorSort {
    public static void main(String[] args) {
        int[] ar = {0, 1, 1, 0, 2, 1, 0, 1, 2, 1, 0, 0};
        sortColors(ar);
    }

    public static void sortColors(int[] A) {
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
    }

    public static void hashMapColors(int[] A) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (hm.containsKey(A[i])) {
                hm.put(A[i], hm.get(A[i]) + 1);
            }else {
                hm.put(A[i], i);
            }
        }
        for (int i = 0; i < hm.size(); i++) {

        }
    }
}
