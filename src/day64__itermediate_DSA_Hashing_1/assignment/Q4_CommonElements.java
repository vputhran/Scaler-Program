package day64__itermediate_DSA_Hashing_1.assignment;

import java.util.*;

public class Q4_CommonElements {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 1, 4, 10));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(3, 6, 2, 10, 10));
        System.out.println(Arrays.asList(solve(A, B)));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            if (!hm.containsKey(A.get(i))) {
                hm.put(A.get(i), 1);
            } else {
                hm.put(A.get(i), hm.get(A.get(i)) + 1);
            }
        }

        ArrayList<Integer> C = new ArrayList<>();
        for (int i = 0; i < B.size(); i++) {

            if (hm.containsKey(B.get(i)) && hm.get(B.get(i))>0) {
                C.add(B.get(i));
                hm.put(B.get(i), hm.get(B.get(i)) - 1);
            }
        }
        return C;
    }

}
