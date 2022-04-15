package day70_intermediate_DSA_hashing_2.assignment;

import java.util.*;

public class Q2_Diffk_II {
    public static void main(String[] args) {
//        List<Integer> A = new ArrayList<>(Arrays.asList(1, 5, 3));
//        int k = 2;

//        List<Integer> A = new ArrayList<>(Arrays.asList(77, 28, 19, 21, 67, 15, 53, 25,
//                82, 52, 8, 94, 50, 30, 37, 39, 9, 43, 35, 48, 82, 53, 16, 20, 13, 95, 18, 67, 77, 12, 93, 0));
//        int k = 53;

        List<Integer> A = new ArrayList<>(Arrays.asList(34, 63, 64, 38, 65, 83, 50, 44, 18, 34, 71, 80, 22, 28, 20, 96, 33,
                70, 0, 25, 64, 96, 18, 2, 53, 100, 24, 47, 98, 69, 60, 55, 8, 38, 72, 94, 18, 68, 0, 53, 18, 30, 86, 55, 13,
                93, 15, 43, 73, 68, 29));
        int k = 97;

//        List<Integer> A = new ArrayList<>(Arrays.asList(95, 97, 52, 51, 98, 41, 88, 12, 61, 32, 78, 9, 51, 39, 28, 28));
//        int k = 43;
        System.out.println(diffPossible(A, k));
    }
    public static int diffPossible(final List<Integer> A, int B) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {

            int val = A.get(i) + B;
            int nval = A.get(i) - B;
            if (hm.containsKey(val) || hm.containsKey(nval)) {
                return 1;
            } else {
                hm.put(A.get(i), val);
                hm.put(A.get(i), nval);
            }
        }
        return 0;
    }
}
