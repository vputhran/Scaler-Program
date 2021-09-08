/*Problem 4: Find the Intersection of 2 arrays  */

package day13.classproblems;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] A = {3, 2, 8, 7, 6};
        int[] B = {8, 2, 10, 9, 3, 6, 5};

        interElements(A, B);

        int[] C = {3, 9, 6, 4, 8, 7};
        int[] D = {2, 4, 6, 9, 3};

        interElements(C, D);

    }

    public static void interElements(int[] A, int[] B) {
        //Declare a HashSet
        HashSet<Integer> hs = new HashSet<>();

        //Insert the A[] element into hs

        for (int i = 0; i < A.length; i++) {
            hs.add(A[i]);
        }
        System.out.println(hs);
        System.out.println(Arrays.toString(B));

        //Iterate through B[] and check if the elements of B[] are present in hs
        for (int j = 0; j < B.length; j++) {
            if (hs.contains(B[j])) {
                System.out.println(B[j]);
            }
        }
    }
}
