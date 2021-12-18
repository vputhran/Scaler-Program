package day56_intermediate_arrays_interview_problems.classprograms;

/* Q1 Given a Binary Array (all the elements are 0's / 1's), where we are allowed to replace at most one 0 with a 1.
      Return the length of maximum consecutive 1's */

/* TC --> O(N) since each element in the loop will be visited max 3 times, so the number of iteration will be less than 3N.
*         Hence T.C --> O(N) */

public class Q1_ReplaceBinaryArrayMax1Sum {
    public static void main(String[] args) {
        int[] A = {1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1};

        System.out.println(maxSum(A));

        }

    public static int maxSum(int[] ar) {
        int maxSum = 0;
        for (int i = 0; i < ar.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            if (ar[i] == 0) {

                //Calculating the left sum
                for (int j = i - 1; j >= 0; j--) {
                    if (ar[j] == 1) {
                        leftSum++;
                    }else {
                        break;
                    }
                }

                //Calculating the right sum
                for (int k = i + 1; k < ar.length; k++) {
                    if (ar[k] == 1) {
                        rightSum++;
                    }else {
                        break;
                    }
                }
            }
            maxSum = Math.max(maxSum, (leftSum + rightSum + 1));
        }

        // To handle the edge case when all the array elements are 1's, return the array length
        if (maxSum == 1) {
            return ar.length;
        }else {
            return maxSum;
        }
    }
}
