package day54_intermediate_arrays_subarrays.homework;

public class Q1_CountingSubArraysEasy {
    public static void main(String[] args) {
        int[] A = {2, 5, 6};
        int B = 10;
        System.out.println(solve(A, B));
    }
    public static int solve(int[] A, int B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                if (sum < B) {
                    count++;
                }
            }
        }
        return count;
    }

}
