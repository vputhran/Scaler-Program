package day78_advanced_DSA_arrays_1.classprograms;

import java.util.Arrays;

/* Given an Array for 0 elements of size N and Q queries containing index and value element.
* For each query - add the element value to each index starting from the given index till the last index.
* Return the resultant array.*/
public class Q1_GetFinalArray {
    public static void main(String[] args) {
        int[] ar = {0, 0, 0, 0, 0, 0, 0};
        int[] qIdx = {2, 3, 0, 4};  // Index of the query
        int[] qVal = {4, -1, 2, 1}; // Value of the query

        System.out.println(Arrays.toString(sumArray(ar,qIdx,qVal)));

    }

    public static int[] sumArray(int[] ar, int[] qIdx, int[] qVal) {
        for (int i = 0; i < qIdx.length; i++) {
            ar[qIdx[i]] = ar[qVal[i]];
        }
        int[] preSum = new int[ar.length];
        preSum[0] = ar[0];

        for (int i = 1; i < ar.length; i++) {
            preSum[i] = preSum[i - 1] + ar[i];
        }
        return preSum;
    }
}
