package day78_advanced_DSA_arrays_1.classprograms;

public class Q5_MaxSubArraySum {
    public static void main(String[] args) {
//        int[] ar = {-5, -6, -7, -3, -2, -10, -12};
        int[] ar = {5, 6, 7, -3, 2, -10, -12, 8, 12, 21, -4, 7};
        System.out.println(maxSubSum(ar));
    }

    public static int maxSubSum(int[] A) {
        int stIdx = 0;
        int endIdx = 0;
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) { // To handle when all the element in the array is -ve
                ans = Math.max(ans, A[i]);
        }
        if (ans < 0) {
            return ans;
        }

        ans = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            endIdx = i;
            sum += A[i];
            if (sum < 0) {
                sum = 0;
                if (endIdx == A.length - 1) {
                    stIdx = endIdx;
                } else {
                    stIdx = endIdx + 1;
                }
            }
            ans = Math.max(ans, sum);
        }
        System.out.println("Start Idx "+stIdx+ " endIdx " + endIdx);
        return ans;
    }
}
