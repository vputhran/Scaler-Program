package day55_intermediate_arrays_2d_matrices.classprograms;

/* Q1. Given a matrin N*M, print the data row wise */

/* T.C ==> O(N*M) and S.C = O(1) */

public class Q1_PrintMatrixData {
    public static void main(String[] args) {
        int mat[][] = { { -2, -3, -4, -6 },
                { -3, -4, -6, -9 },
                { -2, -3, -1, -0 } };

        printRow(mat);
    }

    public static void printRow(int[][] a) {
        /*
        // Row length and column length
        int rowLen = a.length;
        int colLen = a[0].length;
        */
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
