package day10.classproblems;
/* Links :
https://www.javatpoint.com/program-to-find-the-sum-of-each-row-and-each-column-of-a-matrix
https://www.geeksforgeeks.org/print-2-d-array-matrix-java/
*/
public class MaxColSum {
    public static void main(String[] args) {
        int mat[][] = { { -2, -3, -4, -6 },
                        { -3, -4, -6, -9 },
                        { -2, -3, -1, -0 } };

        int matPositive[][] = { { 2, 3, 4, 6 },
                              { 3, 4, 6, 9 },
                              { 2, 3, 1, 0 } };
        maxColSum(mat);
        maxRowSum(mat);

        maxColSum(matPositive);
        maxRowSum(matPositive);
    }

    public static void maxColSum(int mat[][]) {
        int maxSum = Integer.MIN_VALUE; //Initializes with minimum int value
        // check class video for reference
        int rows = mat.length; // row length
        int cols = mat[0].length; // col length

        /*Hint: j value remains constant
                i value changes

                Sol. is to find the col. sum for a particular value of row
         */
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += mat[i][j];
            }
            System.out.println(sum);
            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        System.out.println("Col Sum "+maxSum);
    }

    public static void maxRowSum(int mat[][]) {
        int maxSum = Integer.MIN_VALUE;

        int rows = mat.length;
        int cols = mat[0].length;

        /*Hint: i value remains constant (row)
                j value changes (col)

                Sol. is to find the row. sum for a particular value of col
         */

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += mat[i][j];
            }
            System.out.println(sum);
            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        System.out.println("Row Sum "+maxSum);
    }
}
