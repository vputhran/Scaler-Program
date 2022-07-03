package day79_advanced_DSA_arrays_2;

public class PrefixSumMatrix {
    public static void main(String[] args) {
        int[][] A = {{2, -1, 3, 2}, {3, 2, 6, 2}, {10, 9, 8, 2}, {4, -1, 2, 3}, {3, 2, 6, 9}};

        prefixSumMatrix(A);
    }

    public static void prefixSumMatrix(int[][] A) {
        /* TL : (2,1) => (a1,b1)
         *  BR : (4,2) => (a2,b2) */

        int N = A.length;
        int M = A[0].length;

        System.out.println("Original Matrix");
        printMatrix(A);

        //Prefix Sum Matrix
        int[][] preMat = new int[N][M];

        //Setting the 0th Column
        for (int i = 0; i < N; i++) {
            preMat[i][0] = A[i][0];
        }

        //Row wise prefix sum
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < M; j++) {
                preMat[i][j] = preMat[i][j - 1] + A[i][j];
            }
        }

        printMatrix(preMat);

        //Column wise prefix sum
        for (int j = 0; j < M; j++) {
            for (int i = 1; i < N; i++) {
                preMat[i][j] += preMat[i - 1][j];
            }
        }

       printMatrix(preMat);


    }

    // Function to print matrix
    public static void printMatrix(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===================");
    }
}
