package day61_intermediate_sorting.homework;

import java.util.Arrays;
import java.util.Collections;

public class Q2_ElementsRemoval {
    public static void main(String[] args) {
        int[] A = {5};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        int sum = A[0];
        for (int i = 1; i < A.length; i++) {
            sum += A[i];
        }
        Arrays.sort(A);
        int minSum = sum;
        for (int i = A.length - 1; i >= 0; i--) {
            minSum += sum - A[i];
            sum -= A[i];
        }
        return minSum;
    }
}
