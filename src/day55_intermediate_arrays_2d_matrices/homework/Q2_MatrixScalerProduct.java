package day55_intermediate_arrays_2d_matrices.homework;

import java.util.Arrays;

public class Q2_MatrixScalerProduct {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int B = 2;
        System.out.println(Arrays.deepToString(solve(A, B)));
    }
    public static int[][] solve(int[][] A, int B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                int temp = A[i][j];
                A[i][j] = B * temp;
            }
        }
        return A;
    }
}
