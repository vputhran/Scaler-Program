package day55_intermediate_arrays_2d_matrices.classprograms;

/* Q3. Given a square matrix, print the diagonals (print both diagonals - Right & Left) */

public class Q3_PrintDiagonals {
    public static void main(String[] args) {
        int mat[][] = { {3, 8, 9, 2},
                        {1, 2, 3, 6},
                        {4, 10, 11, 8},
                        {5, 4, 6, 1}};
        printDiagonal2(mat);

    }
    //Using 2 for loops - T.C --> O(N^2)
    public static void printDiagonal(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j) {
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
    }

    // T.C --> O(N) since we are printing N elements
    // S.C --> O(1)
    public static void printDiagonal2(int[][] mat) {
        // Printing the Left Diagonal where i==j
        int i = 0;
        while (i < mat.length) {
            System.out.print(mat[i][i]+" ");
            i++;
        }
        System.out.println();

        // Printing the Right Diagonal starting from (0,3) to (3,0)
        i = 0;
        int j = mat.length-1;
        while ((i < mat.length) && (j >= 0)) {
            System.out.print(mat[i][j]+" ");
            i++;
            j--;
        }
    }

}
