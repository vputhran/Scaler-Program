package day54_intermediate_arrays_subarrays.assignments;

public class Q4_MaximumSubArrayEasy {
    public static void main(String[] args) {
        int[] C = {1, 2, 4, 4, 5, 5, 5, 7, 5};
        int A = C.length;
        int B = 14;
        System.out.println(maxSubarray(A, B, C));

    }
    public static int maxSubarray(int A, int B, int[] C) {
        int ans =0;
        for (int i = 0; i < A; i++) {
            int sum = 0;
            for (int j = i; j < A; j++) {
                sum += C[j];
                if (sum <= B && sum > ans) {
                    ans = sum;
                }
            }
        }
        return ans;
    }
}
