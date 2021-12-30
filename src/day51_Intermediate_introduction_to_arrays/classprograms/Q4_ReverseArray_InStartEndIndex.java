package day51_Intermediate_introduction_to_arrays.classprograms;

/* Q. Given an array  of size N and two indices 's' and 'e'.
 *     Reverse the elements of the array from starting from  's' to 'e' */

import java.util.Arrays;

public class Q4_ReverseArray_InStartEndIndex {
    public static void main(String[] args) {
        int[] ar = {-3, 4, 2, 8, 7, 9, 6, 2, 10};
        System.out.println(Arrays.toString(ar));

        System.out.println(Arrays.toString(revArray(ar, 3, 7)));
    }

    public static int[] revArray(int[] A, int s, int e) {

        while (s < e) {
         int temp = A[s];
            A[s] = A[e];
            A[e] = temp;

            s++;
            e--;
        }
        return A;
    }
}
