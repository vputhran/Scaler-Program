package day79_advanced_DSA_arrays_2.classproblems;

/* Q. Given a matrix of size N*M, find sum of all sub-matrix sum. */

public class Q2_SumOfAllSubMatrixSum_Using_ContributionTechnique {
    public static void main(String[] args) {
        int[][] A = {{3, 1}, {-1, -2}, {2, 4}};
        System.out.println(contributionOfEachElement(A));
    }

    public static int contributionOfEachElement(int[][] A) {
        int ans = 0;
        int n = A.length;
        int m = A[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int contriOfEachElement = ((i + 1) * (j + 1)) * ((n - i) * (m - j));
                ans += A[i][j] * contriOfEachElement;
            }
        }
        return ans;
    }
}
