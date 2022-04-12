package day70_intermediate_DSA_hashing_2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q3_DistinctNumbersInWindow {
    public static void main(String[] args) {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 4, 3));
//        int B = 3;
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 1, 2, 2));
        int B = 1;
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97));
//        int B = 8;
        System.out.println(dNums(A, B));
    }

    public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {

        int sIdx = 0;
        int eIdx = B - 1;
        HashMap<Integer, Integer> hm = new HashMap<>();

        //Setting the element of the 1st window i.e: index 0 to B-1 into the hm
        for (int i = 0; i <= eIdx ; i++) {
            hm.put(A.get(i), hm.getOrDefault(A.get(i), 0) + 1);
        }
        ArrayList<Integer> ans = new ArrayList<>();

        //Adding the current count of unique values into hm
        ans.add(hm.size());

        /* Now you need to increment both sIdx and eIdx, then
        * Add A[eIdx] into the hm
        * Subtract A[sIdx] from the hm */
        while (eIdx < A.size()-1) {
            /* Check if the A[eIdx] is present in the hm, if yes increment the value else add A[eIdx] into the hm */
            eIdx++;
            if (hm.containsKey(A.get(eIdx))) {
                hm.replace(A.get(eIdx), hm.get(A.get(eIdx)) + 1);
            } else {
                hm.put(A.get(eIdx), hm.getOrDefault(A.get(eIdx), 0) + 1);
            }

            /* Check if the value of A[sIdx] > 1, if yes subtract the value else remove the A[sIdx] from hm */
            if (hm.get(A.get(sIdx)) > 1) {
                hm.replace(A.get(sIdx), hm.get(A.get(sIdx)) - 1);
            } else {
                hm.remove(A.get(sIdx));
            }
            sIdx++;

            ans.add(hm.size());
        }
        return ans;
    }
}
