package day55_intermediate_arrays_2d_matrices.homework;

import java.util.Arrays;

public class Q4_RowSum {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4,}, {5, 6, 7, 8}, {9, 2, 3, 4}};
        System.out.println(Arrays.toString(solve(A)));
    }
    public static int[] solve(int[][] A) {
        int[] rowSum = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = 0; j < A[0].length; j++) {
                sum += A[i][j];
            }
            rowSum[i] = sum;
        }
        return rowSum;
    }
}
