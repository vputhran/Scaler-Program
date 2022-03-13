package day56_intermediate_arrays_interview_problems.classprograms;

public class Q5_MaxSubArraySumWithLength_K {
    public static void main(String[] args) {
        int[] A = {-3, 4, -2, 5, 3, -2, 8, 2, -1, 4};
        int k = 5;
        System.out.println(maxSubArraySum(A, k));
        System.out.println(maxSubArraySum_prefixSum(A, k));
        System.out.println(maxSubArraySum_SlidingWindow(A, k));
    }

    //O(N^2) approach
    public static int maxSubArraySum(int[] A, int k) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            int edIdx = i + (k - 1);
            int sum = 0;
            if (edIdx < A.length) {
                for (int j = i; j <= edIdx; j++) {
                    sum += A[j];
                }
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    // Prefix Sum approach - T.C -> O(N^2) && S.C -> O(N)
    public static int maxSubArraySum_prefixSum(int[] A, int k) {

        int maxSum = Integer.MIN_VALUE;

        int[] preSum = new int[A.length];
        preSum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            preSum[i] = preSum[i - 1] + A[i];
        }

        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            int stIdx = i;
            int edIdx = (k - 1) + i;
            if (edIdx < A.length) {
                if (i == 0) {
                    sum = preSum[edIdx];
                }else {
                    sum = preSum[edIdx] - preSum[stIdx - 1];
                }
            }
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }

    // Sliding Window Approach - T.C -> O(N) and S.C -> O(1)
    public static int maxSubArraySum_SlidingWindow(int[] A, int k) {

        int sum = 0;
        //Sum of 1st sub-array of length K
        for (int i = 0; i < k ; i++) {
            sum += A[i];
        }

        int maxSum = sum;
        for (int i = 1; i < A.length; i++) {
            int edIdx = (k - 1) + i;

            if (edIdx < A.length) {
                sum = sum - A[i-1] + A[edIdx];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
