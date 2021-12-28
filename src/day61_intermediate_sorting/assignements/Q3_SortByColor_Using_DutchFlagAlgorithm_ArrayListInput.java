package day61_intermediate_sorting.assignements;

import java.util.ArrayList;
import java.util.Arrays;

/* Reference - Dutch Flag Algorithm
 *  Link - https://www.youtube.com/watch?v=2C4CQ32961Y */

public class Q3_SortByColor_Using_DutchFlagAlgorithm_ArrayListInput {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, 1, 2, 0, 0, 0));
        System.out.println(dutchFlagAlgorithm(numbers));
    }

    public static void swapElements(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }

    public static ArrayList<Integer> dutchFlagAlgorithm(ArrayList<Integer> A) {
        int low = 0;
        int mid = 0;
        int high = A.size() - 1;


        while (mid <= high) {

            if (A.get(mid) == 0) {
                swapElements(A, low, mid);
                low++;
                mid++;
            } else if (A.get(mid) == 1) {
                mid++;
            } else {
                swapElements(A, mid, high);
                high--;
            }
        }
        return A;
    }
}
