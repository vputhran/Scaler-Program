package day61_intermediate_sorting.classprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class NobelIntegerPractise {
    public static void main(String[] args) {
//        int[] A = {1, -5, 3, 3, 5, -10, 4};
        int[] A = {-10, 1, 1, 1, 4, 4, 4, 9, 9, 10, 10};
        System.out.println(nobelInt(A));
    }

    public static int nobelInt(int[] A) {
        Arrays.sort(A);
        int less = 0; // Number of elements less than the current element
        int ans = 0;
        if (A[0] == 0) {
            ans = 1;
        }
        Arrays.sort(A);
        for (int i = 1; i < A.length; i++) {
/*             Only for the first occurrence, change the value of less = i,
             because Index 'i' denotes all the elements that are less than the current element.*/
            if (A[i] != A[i-1]) {
                less = i;
            }
            if (less == A[i]) {
                ans++;
            }
        }
        return ans;
    }
}
