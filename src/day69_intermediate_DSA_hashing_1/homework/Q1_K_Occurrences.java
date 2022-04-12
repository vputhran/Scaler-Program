package day69_intermediate_DSA_hashing_1.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1_K_Occurrences {
    public static void main(String[] args) {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3));
//        int N = 5;
//        int K = 2;
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int N = 5;
        int K = 5;
//
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 0, 1));
//        int N = 3;
//        int K = 2;
        System.out.println(getSum(N, K, A));
    }

    public static int getSum(int A, int B, ArrayList<Integer> C) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < C.size(); i++) {
            hm.put(C.get(i), hm.getOrDefault(C.get(i), 0) + 1);
        }
        if (!hm.containsValue(B)) {
            return -1;
        }
        int sum = 0;


    // https://www.programiz.com/java-programming/examples/get-key-from-hashmap-using-value
    // https://www.geeksforgeeks.org/map-entry-interface-java-example/
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == B) {
                sum += entry.getKey();
            }
        }
        return sum % 1000000007;
    }
}
