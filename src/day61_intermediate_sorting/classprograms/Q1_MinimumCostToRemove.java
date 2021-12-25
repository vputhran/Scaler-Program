package day61_intermediate_sorting.classprograms;

import java.lang.reflect.Array;
import java.util.Arrays;

/* Q1. Given N array elements. At evert step remove an array element where the cost to remove a element is
* Sum of array elements present before removing the element
* Find the min cost to remove all the elements. */

/* Hint - If the bigger elements are removed first the cost is lower. */

public class Q1_MinimumCostToRemove {
    public static void main(String[] args) {
        int[] A = {6, 3, 2, 7};
        System.out.println(minSum(A));
    }


    public static int minSum(int[] A) {
        Arrays.sort(A); /* This will sort in ascending order */
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + (A[i] * (A.length - i));
        }
        return sum;
    }
}
