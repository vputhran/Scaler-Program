package day54_intermediate_arrays_subarrays.homework;

public class Q2_GoodSubArraysEasy {
    public static void main(String[] args) {
        int[] A = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
        int B = 65;
        System.out.println(solve(A, B));
    }
    public static int solve(int[] A, int B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                int length = j - i + 1;
                sum += A[j];
                if (length % 2 == 0 && sum < B) {
                    count++;
                } else if (length % 2 != 0 && sum > B) {
                    count++;
                }
            }
        }
        return count;
    }
}
