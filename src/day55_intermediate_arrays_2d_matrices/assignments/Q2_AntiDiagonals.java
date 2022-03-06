package day55_intermediate_arrays_2d_matrices.assignments;

import java.util.Arrays;

public class Q2_AntiDiagonals {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(diagonal(A)));

    }

    public static int[][] diagonal(int[][] A) {
        int[][] dia = new int[(2*A.length)-1][A.length];
        int row = 0;
        for (int j = 0; j < A[0].length; j++) {
            int i = 0;
            int x = j;
            int col = 0;
            while (i < A.length && j >= 0) {
                dia[row][col] = A[i][j];
                i++;
                j--;
                col++;
            }
            j = x;
            row++;
        }

        for (int k = 1; k < A.length; k++) {
            int col = 0;
            int j = A.length-1;
            int x = k;
            while (k < A.length && j >= 0) {
                dia[row][col] = A[k][j];
                k++;
                j--;
                col++;
            }
            k = x;
            row++;
        }
        return dia;
    }
}
