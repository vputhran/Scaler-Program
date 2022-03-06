package day55_intermediate_arrays_2d_matrices.homework;

public class Q1_AreMatricesSame {
    public static void main(String[] args) {
        int[][] A = {{34, 2, 82, 39}, {7, 75, 54, 17}, {24, 99, 69, 100},{97, 90, 21, 88},{87, 37, 33, 4}};
        int[][] B = {{34, 2, 82, 39}, {7, 75, 54, 17}, {24, 99, 69, 100},{97, 90, 21, 88},{87, 37, 33, 4}};
        System.out.println(solve(A,B));
    }
    public static int solve(int[][] A, int[][] B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] != B[i][j]) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
