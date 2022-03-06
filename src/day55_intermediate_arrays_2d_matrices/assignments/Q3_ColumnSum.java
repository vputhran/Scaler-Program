package day55_intermediate_arrays_2d_matrices.assignments;

import java.util.Arrays;

public class Q3_ColumnSum {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 2, 3, 4}};
        System.out.println(Arrays.toString(solve(mat)));
    }
    public static int[] solve(int[][] A) {
        int[] sum = new int[A[0].length];
        for (int i = 0; i < A[0].length; i++) {
            int rowSum = 0;
            for (int[] ints : A) {
                rowSum += ints[i];
            }
            sum[i] = rowSum;
        }
        return sum;
    }
}
