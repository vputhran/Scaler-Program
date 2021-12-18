package day55_intermediate_arrays_2d_matrices.classprograms;

/* Given a square matrix mat[N][N], find the transpose in place
 *   1) Given input mat[][] should be updated (extra matrix shouldn't be used.)
 *   2) Space complexity should be O(1) */

/* Check with TA on how to iterate only on the upper triangle as explained in class and can the temp variable be used for S.C(1) */

public class Q5_InPlaceTranspose {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20},
                        {21, 22, 23, 24, 25}};

        int[][] mat2 = inPlaceTranspose(mat);

        // Calling the printRow() from Q1
        printRow(mat2);

    }

    public static int[][] inPlaceTranspose(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                // Since the diagonal values remains unchanged, skipping that
                if (i == j) {
                    break;
                }else {
                    // Need to replace the mat[i][j] with mat[j][i]
                    int temp = mat[i][j];
                     mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }
        return mat;
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
