package day10.classproblems;

import java.util.Arrays;

/* Print all the elements in a matrix*/

public class Array_2D {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 } };
        print2D(mat);
    }

    public static void print2D(int mat[][]) {
        // Iterates over the row -- mat.length gives row length
        for (int i = 0; i < mat.length; i++) {

            // Iterates over the column -- mat[i].length gives column length for each row[i]
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
        }
    }
}
