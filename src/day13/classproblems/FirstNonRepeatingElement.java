/*Problem 2: Find the first non-repeating element.
 */

package day13.classproblems;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 1, 2, 5};
        int[] ar2 = {4, 8, 8, 3, 4, 2, 3};
        int[] ar3 = {2, 6, 8, 4, 6, 7, 2, 9};

        firstNonRep(ar1);
        firstNonRep(ar2);
        firstNonRep(ar3);

    }

    public static void firstNonRep(int[] ar) {
        HashMap<Integer, Integer> hm = new HashMap<>(); //Declared the HashMap

        // Iterate through the array and store the distinct value and their frequency
        for (int i = 0; i < ar.length; i++) {
            if (hm.containsKey(ar[i])) {
                hm.put(ar[i], hm.get(ar[i]) + 1);
            }else {
                hm.put(ar[i], 1);
            }
        }
        System.out.println(hm);


        for (int i = 0; i < ar.length; i++) {
            if (hm.get(ar[i]) == 1) {
                System.out.println(ar[i]);
                break;
            }
        }
    }
}
