package day64__itermediate_DSA_Hashing_1.classprogram;

import java.util.HashMap;

public class Q1_FirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 1, 2, 5};

        System.out.println(firstNonRepeatingElement(A));
    }

    public static int firstNonRepeatingElement(int[] A) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (!freqMap.containsKey(A[i])) {
                freqMap.put(A[i], 1);
            } else {
                freqMap.put(A[i], freqMap.get(A[i]) + 1);
            }
        }
        System.out.println(freqMap);
        for (int i = 0; i < A.length; i++) {
            if (freqMap.get(A[i]) == 1) {
                return A[i];
            }
        }
        return 0;
    }
}
