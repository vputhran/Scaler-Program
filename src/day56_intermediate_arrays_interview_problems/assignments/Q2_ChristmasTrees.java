package day56_intermediate_arrays_interview_problems.assignments;

public class Q2_ChristmasTrees {
    public static void main(String[] args) {
        int[] A = {1, 6, 4, 2, 6, 9};
        int[] B = {2, 5, 7, 3, 2, 7};
        System.out.println(solve(A, B));
    }
    public static int solve(int[] A, int[] B) {
        long cost = 0;
        long minCost = Integer.MAX_VALUE;
        for (int i = 1; i < A.length-1; i++) {
            cost = B[i] + leftCount(A, B, i, A[i]) + rightCount(A, B, i, A[i]);
            minCost = Math.min(minCost, cost);
        }
        if( minCost >= Integer.MAX_VALUE){
            return -1;
        }
        return (int)minCost;
    }

    public static int leftCount(int[] A, int[] B, int stIdx, int val) {
        int minCost = Integer.MAX_VALUE;
        for (int i = stIdx - 1; i >= 0; i--) {
            if (A[i] < val && B[i] < minCost) {
                minCost = B[i];
            }
        }
        return minCost;
    }

    public static int rightCount(int[] A,int[] B, int stIdx, int val) {
        int minCost = Integer.MAX_VALUE;
        for (int i = stIdx + 1; i < A.length; i++) {
            if (A[i] > val && B[i] < minCost) {
                minCost = B[i];
            }
        }
        return minCost;
    }
}
