package day55_intermediate_arrays_2d_matrices.assignments;

import java.util.Arrays;

public class Q7_RotateMatrix {
    public static void main(String[] args) {
        int[][] A = {{3, 8, 9, 2},
                     {1, 2, 3, 6},
                    {4, 10, 11, 8},
                     {2, 4, 6, 7}};
        solve(A);

    }

    public static void solve(int[][] A) {
        // Creating a transpose matrix
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A[0].length; j++) {
                if (i != j) {
                    int temp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = temp;
                }
            }
        }
        System.out.println(Arrays.deepToString(A));
        // Reversing each row to get the final array
        for (int i = 0; i < A.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < A[0].length / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][A.length - 1 - j];
                A[i][A.length - 1 - j] = temp;
                System.out.print(A[i][A.length - 1 - j]+" ");
            }
        }
        System.out.print(" ]");
        System.out.println();
        System.out.println(Arrays.deepToString(A));
    }
}
