package day51_Intermediate_introduction_to_arrays.classprograms;

import java.util.Arrays;

public class Q3_ReverseArray {
    public static void main(String[] args) {
        int[] ar = {-1, 4, 7, 6, 5, -2, 12, 8, 10};
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(revArray_2Pointer(ar)));
    }


    /* Iterate from both ends and swap the elements till the middle
    * The number of iteration is n/2 where n is the array length
    * The T.C is O(n) since 2 is a constant and should be ignored.
    * The Space complexity is O(1)
    */

    /* Google Telephonic Round question -
    *  When the iterations are n/2 what is the T.C ? */


    public static int[] revArray_2Pointer(int[] ar) {
        int start = 0;
        int end = ar.length - 1;

        while (start < end) {
            swap(ar , start, end);
            start++;
            end--;
        }
        return ar;
    }

    private static int[] swap(int[] ar, int i, int j) {
        int temp = 0;
        temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
        return ar;
    }
}
