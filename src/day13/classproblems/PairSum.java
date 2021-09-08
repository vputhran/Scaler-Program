/* Problem --> Given N array elements, check if there exists a pair (i,j),

   such that i != j && ar[i] + a[j] = k

    ar = {3, 8, 4, 9, 8, 5, -2, 6, 4};

    K = 14

    */

package day13.classproblems;
import java.util.HashMap;

public class PairSum {
    public static void main(String[] args) {
        int[] ar = {3, 8, 4, 9, 8, 5, -2, 6, 4};
        int K = 14;
        System.out.println(pairSum(ar, K));
    }


    public static boolean pairSum(int[] A, int K) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (hm.containsKey(A[i])) {
                hm.put(A[i], hm.get(A[i]) + 1);
            }else{
                hm.put(A[i], 1);
            }
        }
        System.out.println(hm);

        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            int b = K - a;
            if (a != b) {
                // Search b in hm
                if (hm.containsKey(b)) {
                    return true;
                }
            } else { // (a==b)
                if (hm.get(b) > 1) {      // if freq of b > 1
                    return true;
                }
            }
        }
        return false;
    }
}