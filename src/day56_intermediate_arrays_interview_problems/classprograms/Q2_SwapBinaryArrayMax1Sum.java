package day56_intermediate_arrays_interview_problems.classprograms;

public class Q2_SwapBinaryArrayMax1Sum {
    public static void main(String[] args) {
        int[] A = {1, 1, 1, 0, 1, 0, 1};

        System.out.println(swapArray(A));

    }

    public static int swapArray(int[] ar) {

        int maxSum = 0;
        // Count the no. of 1's in the array
        int count_1 = 0;
        int n = ar.length;
        for (int i = 0; i < n; i++) {
            if (ar[i] == 1) {
                count_1 ++;
            }
        }

        // IF the no. of 1's is equal to the array length return the array length
        if ((n - count_1) == 0) {
            return n;
        }else {


            for (int i = 0; i < n; i++) {
                int leftSum = 0;
                int rightSum = 0;
                if (ar[i] == 0) {

                    //Count the no. of 1's on the left
                    for (int j = i - 1; j >= 0; j--) {
                        if (ar[j] == 1) {
                            leftSum++;
                        }else {
                            break;
                        }
                    }

                    //Count the no. of 1's on the right
                    for (int k = i + 1; k < n; k++) {
                        if (ar[k] == 1) {
                            rightSum++;
                        }else {
                            break;
                        }
                    }
                    if (count_1 > leftSum + rightSum) {
                        maxSum = Math.max(maxSum, (leftSum + 1 + rightSum));
                    } else{
                        maxSum = Math.max(maxSum, (leftSum + rightSum));
                    }
                }
            }
        }
        return maxSum;
    }
}
