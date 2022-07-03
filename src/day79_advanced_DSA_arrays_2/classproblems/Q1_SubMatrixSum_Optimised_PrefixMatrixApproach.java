package day79_advanced_DSA_arrays_2.classproblems;

public class Q1_SubMatrixSum_Optimised_PrefixMatrixApproach {
    public static void main(String[] args) {
        int[][] A = {{2, -1, 3, 2}, {3, 2, 6, 2}, {10, 9, 8, 2}, {4, -1, 2, 3}, {3, 2, 6, 9}};
        System.out.println(prefixSumMatrix_ApproachFromClass(A, 2, 1, 4, 2));

        System.out.println("Displaying Perfix Sum Matrix");
        prefixSumMatrix_ApproachFromGCD(A);
        /* TL : (2,1)
        *  BR : (4,2) */
    }

    public static int prefixSumMatrix_ApproachFromClass(int[][] A, int a1, int b1, int a2, int b2) {

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

        int subMatrixSum = preMat[a2][b2] - preMat[a1 - 1][b2] - preMat[a2][b1 - 1] + preMat[a1 - 1][b1 - 1];

        return subMatrixSum;
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


    public static void prefixSumMatrix_ApproachFromGCD(int[][] A) {
        int r = A.length;
        int c = A[0].length;

        int[][] psm = new int[r][c];
        psm[0][0] = A[0][0];
        //Filling the 1st row and 1st column

        for (int i = 1; i < c; i++) {
            psm[0][i] = psm[0][i - 1] + A[0][i];
        }
        for (int i = 1; i < r; i++) {
            psm[i][0] = psm[i - 1][0] + A[i][0];
        }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                psm[i][j] = psm[i - 1][j] + psm[i][j - 1] - psm[i - 1][j - 1] + A[i][j];
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(psm[i][j] + " ");
            }
            System.out.println();
        }

    }
}
