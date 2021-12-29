package day51_Intermediate_introduction_to_arrays.classprograms;

/* Q. Given an array of size N. Count the number of elements which have at least one element greater than itself. */

import java.util.Arrays;

public class Q1_CountGreaterElements {
    public static void main(String[] args) {
        int[] ar = {-3, -2, 8, 8, 4, 8, 5};
        System.out.println(countGreater_UsingMax(ar));
    }

    /* Using sort function */
    public static int countGreaterElements(int[] A) {
        int size = A.length-1;

        Arrays.sort(A);
        for (int i = size ; i > 0; i--) {
            if (A[i] == A[i - 1]) {
                size--;
            }
        }
        return size;
    }

    /* Finding the Max element */
    public static int findMaxElement(int[] A) {
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

    /* Counting the max element and subs it from array length */
    public static int countGreater_UsingMax(int[] A) {
        int maxElement = findMaxElement(A);
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == maxElement) {
                count++;
            }
        }
        return (A.length - count);
    }

    /* Homework: To solve using a single loop */
    public static int countGreater_UsingSingleLoop(int[] A) {
        int maxEle = A[0];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > maxEle) {

            }
        }
        return count;
    }
}
