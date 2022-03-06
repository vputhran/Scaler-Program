package day55_intermediate_arrays_2d_matrices.homework;

public class Q6_MainDiagonalSum {
    public static void main(String[] args) {
        int[][] A = {{1, -2, -3}, {-4, 5, -6}, {-7, -8, 9}};
        System.out.println(solve(A));
    }
    public static int solve(final int[][] A) {
        int i = 0, j = 0;
        int sum = 0;
        while (i < A.length) {
            sum += A[i][j];
            i++;
            j++;
        }
        return sum;
    }
}
