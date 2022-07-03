package day79_advanced_DSA_arrays_2.classproblems;

public class Q1_SubMatrixSum_BruteForce {
    public static void main(String[] args) {
        int[][] A = {{2, -1, 3, 2}, {3, 2, 6, 2}, {10, 9, 8, 2}, {4, -1, 2, 3}, {3, 2, 6, 9}};
        System.out.println(matrixSum(A));
    }
    // T.C -> O(Q * N * M) where Q is the number of queries
    public static int matrixSum(int[][] A) {
        // Top left index : (2,1)
        // Bottom right index : (4,2)
        int sum = 0;
        for (int i = 2; i <= 4; i++) {
            for (int j = 1; j <=2 ; j++) {
                sum += A[i][j];
            }
        }
        return sum;
    }
}
