package day80_advanced_DSA_arrays_3.classwork;

public class Q3_K_ElementIn_2D_Matrix {
    public static void main(String[] args) {
        int[][] A = {{-1, 2, 4, 5, 9, 11},
                     {1, 4, 7, 8, 10, 14},
                     {3, 7, 9, 10, 12, 18},
                     {6, 10, 12, 14, 16, 20},
                     {9, 13, 16, 19, 22, 24},
                     {11, 15, 19, 21, 4, 7},
                     {14, 20, 5, 9, 31, 39},
                     {18, 24, 29, 32, 34, 42}};
        int K = 15;
        System.out.println(find(A, K));
    }

    public static boolean find(int[][] A, int K) {
        int N = A.length;  //Row Length
        int M = A[0].length; // Column Length

        // Starting value -> 0th row, last element
        int i = 0;
        int j = M - 1;

        while (i < N && j >= 0) {
            if (A[i][j] < K) {
                i++;      // Skip Row
            } else if (A[i][j] > K) {
                j--;      // Skip Column
            } else {
                return true;  // Return true if the element is found
            }
        }
        return false;
    }
}
