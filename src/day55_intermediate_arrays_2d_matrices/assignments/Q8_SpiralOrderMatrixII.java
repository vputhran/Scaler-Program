package day55_intermediate_arrays_2d_matrices.assignments;

import java.util.Arrays;

public class Q8_SpiralOrderMatrixII {
    public static void main(String[] args) {
        int A = 80;
        System.out.println(Arrays.deepToString(generateMatrix(A)));
    }
    public static int[][] generateMatrix(int A) {
        int[][] B = new int[A][A];
        int i = 0, j = 0;
        int N = A;
        int val = 1;
        while (val <= A*A && N > 1) {
            for (int k = 0; k < N - 1; k++) {  // For loop just for iteration --> Moving left from [0,0] till [0,N-2]
                B[i][j] = val++;
                j++;
            }
            for (int k = 0; k < N - 1; k++) { // Moving down from [0,N-1] to [N-1,N-1]
                B[i][j] = val++;
                i++;
            }
            for (int k = 0; k < N - 1; k++) { // Moving right from [N-1,N-1] to [N-1,0]
                B[i][j] = val++;
                j--;
            }
            for (int k = 0; k < N - 1; k++) { // Moving up from [N-1,0] to [0,0]
                B[i][j] = val++;
                i--;
            }
            // Shifting to inner loop and reducing the matrix length by 2 --> removing boundary columns
            i++;
            j++;
            N = N - 2;
        }
        // When the matrix size is odd, populating the center element
        if (N % 2 == 1) {
            B[i][j] = val;
        }
        return B;
    }
}
