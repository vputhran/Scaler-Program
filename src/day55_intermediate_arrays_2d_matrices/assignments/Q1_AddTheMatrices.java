package day55_intermediate_arrays_2d_matrices.assignments;

import java.util.Arrays;

public class Q1_AddTheMatrices {
    public static void main(String[] args) {
        int[][] A = {{6}, {2}, {3}, {10}, {1}, {3}};
        int[][] B = {{6}, {7}, {3}, {8}, {1}, {2}};

        System.out.println(Arrays.deepToString(solve(A, B)));

    }

    public static int[][] solve(int[][] A, int[][] B) {
        int[][] sum = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        return sum;
    }
}
