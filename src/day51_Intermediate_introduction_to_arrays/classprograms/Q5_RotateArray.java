package day51_Intermediate_introduction_to_arrays.classprograms;

/* Q. Given an array of size N, Rotate the array in clockwise direction by K times.
*     K is less than the length of the array.
*     Use constant space. */

import java.util.Arrays;

public class Q5_RotateArray {
    public static void main(String[] args) {
        int[] ar = {-3, 4, 2, 8, 7, 9, 6, 2, 10};
        System.out.println(Arrays.toString(ar));

//        System.out.println(Arrays.toString(rotateArray(ar, 2)));

        System.out.println(Arrays.toString(rotateArray_ReverseLogic(ar, 2)));
    }

    // My Logic - Save the last element and move the remaining elements by one step
    public static int[] rotateArray(int[] A, int k) {

        int l = A.length - 1;
        while (k > 0) {
            int temp = A[l];
            for (int i = l; i > 0; i--) {
                A[i] = A[i - 1];
            }
            A[0] = temp;
            k--;
        }
        return A;
    }

    /* Using reverse logic
     *  Step 1:  First reverse the entire array
     *  Step 2: Then reverse the first 'K' elements ( 0 to K-1 )
     *  Step 3: Again reverse the remaining 'N-K' elements ( K to N-1) where N is the length of the array */


    public static int[] rotateArray_ReverseLogic(int[] A, int K) {
        // Reverse the entire array
        swap(A, 0, A.length - 1);

        //Reverse the first K elements
        swap(A, 0, K - 1);

        //Reverse the remaining elements after K-1 elements
        swap(A, K, A.length - 1);

        return A;
    }

    public static int[] swap(int[] A, int s, int e) {
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
