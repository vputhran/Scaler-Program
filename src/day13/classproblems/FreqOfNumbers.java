/* Problem 2:
        Find Frequency of numbers.
        Given N array of elements and Q queries, for each query find the frequency of each element.
* */

package day13.classproblems;

import java.util.HashMap;

public class FreqOfNumbers {
    public static void main(String[] args) {

        int[] N  = new int[]{2, 6, 3, 8, 2, 6, 8, 2, 3, 8};
        int[] Q = new int[]{2, 8, 3};

        freNum(N,Q);
    }

    public static void freNum(int[] N, int[] Q) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); //Hashmap declaration
        /*for (int i : N) {               //Iterate the length of N[] array - add the key and value

            if (hm.containsKey(i)) {           // If the Hashmap already contains the array element, increment the freq by 1
                hm.put(i, hm.get(i) + 1);
            } else {                           // Else add the array element to the Key and Freq = 1
                hm.put(i, 1);
            }
        }*/

        for (int i = 0; i < N.length; i++) { //Iterate the length of N[] array - add the key and value
            if (hm.containsKey(N[i])) {      // If the Hashmap already contains the array element, increment the freq by 1
                hm.put(N[i], hm.get(N[i]) + 1);
            }else{                          // Else add the array element to the Key and Freq = 1
                hm.put(N[i], 1);
            }
        }
        System.out.println(hm);
        for (int j : Q) {                      // Iterate the length of query Q[] array
            System.out.println(hm.get(j));     // Retrieve the frequency of query element from hm
        }
    }
}
