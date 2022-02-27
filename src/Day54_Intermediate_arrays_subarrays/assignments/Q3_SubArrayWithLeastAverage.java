package Day54_Intermediate_arrays_subarrays.assignments;

public class Q3_SubArrayWithLeastAverage {
    public static void main(String[] args) {
        int[] A = {3, 7, 90, 20, 10, 50, 40};
        int B = 3;

        System.out.println(solve(A, B));
    }

    // Creating a Prefix Sum and shifting the window of length B
    // T.C --> O(N) and S.C --> O(N)
    public static int solve(int[] A, int B) {
        int[] preSum = new int[A.length];
        preSum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            preSum[i] = preSum[i - 1] + A[i];
        }
        int initSum = 0;
        int miniSum = Integer.MAX_VALUE;
        int ans = -1;
        for (int i = 0; i < preSum.length; i++) {
            if (i > 0 && i <= preSum.length-B) {
                initSum = (preSum[B+i-1] - preSum[i - 1]);
            } else if (i == 0) {
                initSum = preSum[B - 1];
            }

            if (initSum < miniSum) {

                miniSum = initSum;
                ans = i;
            }
        }
        return ans;
    }


    // Shifting the window of length B without extra space
    // T.C --> O(N) and S.C --> O(1)
    public int solve_2 (int[] A, int B) {
        int ans = 0; // Setting it to index 0, if the initVal = minVal then ans = 0
        int iniAvg = 0;
        // Calculating the sum of 1st B values
        for (int i = 0; i < B; i++) {
            iniAvg += A[i];
        }
        int minAvg = iniAvg;

        // Iterating for a length B - by subtracting A[i-1] and adding A[endVal-1] to the initVal
        for (int i = 1; i < A.length; i++) {
            int endVal = B + i;
            if (endVal <= A.length) {
                iniAvg = (iniAvg - A[i-1] )+ A[endVal-1];
            } else break;
            if (iniAvg < minAvg) {
                minAvg = iniAvg;
                ans = i;
            }
        }
        return ans;
    }
}
