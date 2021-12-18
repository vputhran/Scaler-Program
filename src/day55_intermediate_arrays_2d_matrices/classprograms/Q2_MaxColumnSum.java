package day55_intermediate_arrays_2d_matrices.classprograms;

/* Q2. Given a n*m matrix, return the max column sum */

/* T.C ==> O(N*M) and S.C = O(1) */

public class Q2_MaxColumnSum {
    public static void main(String[] args) {
        int mat[][] = {{3, 8, 9, 2},
                {1, 2, 3, 6},
                {4, 10, 11, 8}};

        System.out.println("MaxSum = "+colSum(mat));

    }
    public static int colSum(int[][] ar) {
        int maxSum = Integer.MIN_VALUE;

        // Iterating over the column
        for (int j = 0; j < ar[0].length; j++) {
            int sum = 0;

            //Iterating over the rows
            for (int i = 0; i < ar.length; i++) {
                sum = sum + ar[i][j];
            }
            System.out.println("Col "+j+" sum = "+sum);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
