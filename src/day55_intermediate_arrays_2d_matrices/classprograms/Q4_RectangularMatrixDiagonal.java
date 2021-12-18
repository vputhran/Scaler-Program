package day55_intermediate_arrays_2d_matrices.classprograms;
    /* Q4. Given a rectangular matrix mat[N][M], print all the diagonals going from right to left */

    /* TC --> O(N*M) since we will print all the elements in the matrix
    *  S.C --> O(1) */
public class Q4_RectangularMatrixDiagonal {
    public static void main(String[] args) {
        int[][] mat = { {3, 8, 9, 2, 6, 7},
                        {1, 2, 3, 6, 8, 1},
                        {4, 1, 9, 8, 5, 1},
                        {5, 4, 6, 1, 2, 4}};
        rectDiagonal(mat);
    }

    public static void rectDiagonal(int[][] mat) {

        /*Printing the diagonal starting from row 0 */
        for (int j = 0; j < mat[0].length; j++) {  // j keeps changing
            int x = 0;                             // i == x  remains 0 through out
            int y = j;                            // Assigning j to a new variable because it will go into -ve on j--, so needs to be reset at every iteration of the for loop
            while (x < mat.length && y >= 0) {
                System.out.print(mat[x][y]+" ");
                x++;
                y--;
            }
            System.out.println();
        }
        System.out.println("-----------");

        /*Printing the diagonal starting from last column */
        for ( int i = 1; i <mat.length ; i++) {
            int y = mat[0].length - 1;
            int x = i;
            while (x < mat.length && y >= 0) {
                System.out.print(mat[x][y]+" ");
                x++;
                y--;
            }
            System.out.println();
        }
    }
}
