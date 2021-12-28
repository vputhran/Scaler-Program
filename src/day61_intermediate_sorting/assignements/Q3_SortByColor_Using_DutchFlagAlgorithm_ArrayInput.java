package day61_intermediate_sorting.assignements;

import java.util.Arrays;

/* Reference - Dutch Flag Algorithm
*  Link - https://www.youtube.com/watch?v=2C4CQ32961Y */


public class Q3_SortByColor_Using_DutchFlagAlgorithm_ArrayInput {
    public static void main(String[] args) {
        int[] ar = {0, 1, 2, 0, 1, 1};
        System.out.println(Arrays.toString(dutchFlagAlgorithm(ar)));
    }

    public static void swapElements(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static int[] dutchFlagAlgorithm(int[] A) {
        int low = 0;
        int mid = 0;
        int high = A.length-1;


        while (mid <= high) {

            if (A[mid] == 0) {
                swapElements(A, low, mid);
                low++;
                mid++;
            } else if (A[mid] == 1) {
                mid++;
            } else {
                swapElements(A, mid, high);
                high--;
            }
        }
        return A;
    }
}
