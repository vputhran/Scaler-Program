package day54_intermediate_arrays_subarrays.classprograms;

public class Q4_2_IndividualSumOfEverySingleSubArrayOptimised {
    public static void main(String[] args) {
        int[] ar = {3, 2, -1, 4};
        subArraySum_PrefixSumApproach(ar);
        subArraySum_NoExtraSpace(ar);
    }

    /* Using prefix sum the time complexity is O(N^2) and SPACE COMPLEXITY is O(N) */
    public static void subArraySum_PrefixSumApproach(int[] ar) {

        //Creating the prefix sum array
        int[] preSum = new int[ar.length];
        preSum[0] = ar[0];
        for (int i = 1; i < ar.length; i++) {
            preSum[i] = preSum[i - 1] + ar[i];
        }


        int sum = 0;
        for (int i = 0; i < preSum.length; i++) {
            for (int j = i; j < preSum.length; j++) {
                // Handling condition i == 0 && j == 0
                if (j > 0 && i > 0) {
                    sum = preSum[j] - preSum[i - 1];
                    System.out.print(sum+" ");
                } else {
                    sum = preSum[j];
                    System.out.print(sum+" ");
                }
            }
            System.out.println();
        }
    }

    /* Using this approach the time complexity is O(N^2) and SPACE COMPLEXITY is O(1) -->  no extra space is used */
    public static void subArraySum_NoExtraSpace(int[] ar) {

        for (int i = 0; i < ar.length; i++) {
            int sum = 0;
            for (int j = i; j < ar.length; j++) {
                sum = sum + ar[j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
