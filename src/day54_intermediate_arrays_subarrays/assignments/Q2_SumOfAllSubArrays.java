package day54_intermediate_arrays_subarrays.assignments;

public class Q2_SumOfAllSubArrays {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(subArraySum_N_Cube_Approach(A));
        System.out.println(subArraySum_PrefixSum_Approach(A));
        allSubArraySum_CarryForward_Approach(A);
        System.out.println(subarraySum(A));
    }

    // Brute force approach - T.C --> O(N^3), S.C --> O(1)
    public static long subArraySum_N_Cube_Approach(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                sum += arrSum(A, i, j);
            }
        }
        return sum;
    }

    public static int arrSum(int[] A, int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += A[k];
        }
        return sum;
    }


    //Printing the sum of all sub-arrays - Prefix Sum Approach - T.C --> O(N^2) , S.C --> O(N)
    public static long subArraySum_PrefixSum_Approach(int[] A) {

        int[] preSum = new int[A.length];
        preSum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            preSum[i] = preSum[i - 1] + A[i];
        }
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                if (i != 0) {
                    sum += preSum[j] - preSum[i - 1];
                } else {
                    sum += preSum[j];
                }
            }
        }
        return sum;
    }

    //Printing the sum of all sub-arrays - Carry Forward Approach - T.C --> O(N^2) , S.C --> O(1)
    public static void allSubArraySum_CarryForward_Approach(int[] A) {
        int entireSum = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
//                System.out.print(sum+" ");
                entireSum += sum;
            }
//            System.out.println();
        }
        System.out.println(entireSum);
    }

    // Printing the cumulative sum of all sub-arrays - by counting the occurrence of each element in the sub-arrays - O(N)
    public static long subarraySum(int[] A) {
        long sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i] * ((long) (i + 1) * (A.length - i));
        }
        return sum;
    }
}
