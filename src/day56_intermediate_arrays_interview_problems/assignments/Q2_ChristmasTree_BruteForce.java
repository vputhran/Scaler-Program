package day56_intermediate_arrays_interview_problems.assignments;

public class Q2_ChristmasTree_BruteForce {
    public static void main(String[] args) {
        int[] A = {1, 6, 4, 2, 6, 9};
        int[] B = {2, 5, 7, 3, 2, 7};
        System.out.println(solve(A, B));
    }
    public static int solve(int[] A, int[] B) {
        int minPrice = Integer.MAX_VALUE;
        int price = minPrice;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] < A[j]) {
                    for (int k = j + 1; k < A.length; k++) {
                        if (A[j] < A[k]) {
                            price = B[i] + B[j] + B[k];
                        }
                        minPrice = Math.min(minPrice, price);
                    }
                }
            }
        }
        if (minPrice == Integer.MAX_VALUE){
            return -1;
        } else
            return minPrice;
    }
}
