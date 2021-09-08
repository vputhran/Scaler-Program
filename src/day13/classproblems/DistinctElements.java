/* Prob: Given N array elements find no. of distinct elements*/

package day13.classproblems;

import java.util.HashSet;

public class DistinctElements {
    public static void main(String[] args) {
        int ar[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5};
        System.out.println(distElements(ar));

        int ar1[] = new int[]{6, 3, 7, 3, 8, 6, 9, 4};
        System.out.println(forDistElements(ar1));
    }

    //Using For-each loop
    public static int distElements(int ar[]) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (Integer t : ar) {
            hashSet.add(t);
        }
        return hashSet.size();
    }
    //Using for-loop
    public static int forDistElements(int ar[]) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < ar.length ; i++) {
            hashSet.add(ar[i]);
        }
        return hashSet.size();
    }

}
