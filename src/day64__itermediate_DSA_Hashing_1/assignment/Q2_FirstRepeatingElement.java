package day64__itermediate_DSA_Hashing_1.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q2_FirstRepeatingElement {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10, 5, 3, 4, 3, 5, 6));
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < A.size(); i++) {
            if (freqMap.containsKey(A.get(i))) {
                freqMap.put(A.get(i), freqMap.get(A.get(i))+1);
            }else {
                freqMap.put(A.get(i), 1);
            }
        }
        System.out.println(freqMap);
        for (int j = 0; j < A.size(); j++) {
            if (freqMap.get(A.get(j)) > 1) {
                return A.get(j);
            }
        }
        return -1;
    }
}
