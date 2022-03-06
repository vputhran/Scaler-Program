package day55_intermediate_arrays_2d_matrices.assignments;

import java.util.Arrays;

public class Q6_MatrixTranspose {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        System.out.println(Arrays.deepToString(solve(A)));
    }

    public static int[][] solve(int[][] A) {
        int[][] B = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++){
                B[j][i] = A[i][j];
            }
        }
        return B;
    }
}
