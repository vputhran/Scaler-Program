/* Problem 3:  Given an array, check if we can form an A.P using values of the array */

package day15.classproblems;

import java.util.Arrays;

public class ArithmeticProgressionCheck {
    public static void main(String[] args) {
        int[] ar = {4, 2, 8, 6, 10, 12, 13};
        int[] ar1 = {-1, 3, 7, 7};
        System.out.println(checkAP(ar1));

    }

    public static boolean checkAP(int[] A) {
        Arrays.sort(A);
        int diffAP = A[1] - A[0];
        int arrayDiff = 0;
        for (int i = 0; i < A.length-1; i++) {
                arrayDiff = (A[i + 1] - A[i]);
            if (diffAP != arrayDiff) {
                System.out.println(A[i]);
                return false;
            }
            System.out.println(A[i]);
        }
        return true;
    }

    //Optimal solution using Hashmap



}
