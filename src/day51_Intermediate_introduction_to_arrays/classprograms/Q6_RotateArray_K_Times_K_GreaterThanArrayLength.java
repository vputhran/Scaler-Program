package day51_Intermediate_introduction_to_arrays.classprograms;


import java.util.Arrays;

/* Q. Given an array of size N, Rotate the array in clockwise direction by K times.
 *     K is GREATER than the length of the array.
 *     Use constant space. */
public class Q6_RotateArray_K_Times_K_GreaterThanArrayLength {
    public static void main(String[] args) {

        int[] ar = {-3, 4, 2, 8, 7, 9, 6, 2, 10};
        int K = 12;
        System.out.println(Arrays.toString(ar));

        System.out.println(Arrays.toString(rotateArray_ReverseLogic(ar, K)));
    }

    /* Using reverse logic
     *  Step 1:  First reverse the entire array
     *  Step 2: Then reverse the first 'K' elements ( 0 to K-1 )
     *  Step 3: Again reverse the remaining 'N-K' elements ( K to N-1) where N is the length of the array */

    /* Since K is greater than the length of the array we need to subtract K from the array length ( K = K - N) to get the right no. of rotation required.
    *  OR use modulo to get the remainder */

    public static int[] rotateArray_ReverseLogic(int[] A, int K) {

        K = K % A.length;
        // Reverse the entire array
        swap(A, 0, A.length - 1);

        //Reverse the first K elements
        swap(A, 0, K - 1);

        //Reverse the remaining elements after K-1 elements
        swap(A, K, A.length - 1);

        return A;
    }

    public static void swap(int[] A, int s, int e) {
        while (s < e) {
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }
    }
}
