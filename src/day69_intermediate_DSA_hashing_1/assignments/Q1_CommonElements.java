package day69_intermediate_DSA_hashing_1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q1_CommonElements {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 2, 1));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2, 3, 1, 2));
        System.out.println(solve(A, B));
    }
    // My approach
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> aHM = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            if (!aHM.containsKey(A.get(i))) {
                aHM.put(A.get(i), 1);
            } else {
                aHM.put(A.get(i), aHM.get(A.get(i)) + 1);
            }
        }

        for (int i = 0; i < B.size(); i++) {
            if (aHM.containsKey(B.get(i)) && aHM.get(B.get(i)) > 0) {
                ans.add(B.get(i));
                aHM.put(B.get(i), aHM.get(B.get(i)) - 1);
            }
        }
        return ans;
    }

    // Scaler Complete Solution
    /*public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> b = new HashMap<Integer, Integer>();
        for(int x: A){
            a.put(x, a.getOrDefault(x, 0)+1);
        }
        for(int x: B){
            b.put(x, b.getOrDefault(x, 0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int k: a.keySet()){
            if(b.containsKey(k)){
                for(int i = 0; i < Math.min(a.get(k), b.get(k)); ++i){
                    ans.add(k);
                }
            }
        }
        return ans;
    }*/
}
