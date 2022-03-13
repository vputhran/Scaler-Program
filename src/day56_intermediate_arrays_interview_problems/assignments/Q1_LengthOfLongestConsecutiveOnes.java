package day56_intermediate_arrays_interview_problems.assignments;

public class Q1_LengthOfLongestConsecutiveOnes {
    public static void main(String[] args) {
        String A = "111000";
        System.out.println(solve(A));
    }

    public static int solve(String A) {
        // Total number of 1's in the String
        int totalCount_1 = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '1') {
                totalCount_1++;
            }
        }
        int consLength = 0;
        int maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < A.length(); i++) {
            int count_1 = 0;
            if (A.charAt(i) == '0') {
                count_1 = leftSum(A, i) + rightSum(A, i);
                if (totalCount_1 > count_1) {
                    consLength = count_1 + 1;
                } else {
                    consLength = count_1;
                }
            }
            maxLength = Math.max(maxLength, consLength);

        }
        if (maxLength == 0) {
            return A.length();
        } else {
            return maxLength;
        }
    }

    public static int leftSum(String A, int i) {
        int count = 0;
        for (int j = i - 1; j >= 0; j--) {
            if (A.charAt(j) == '1') {
                count++;
            } else break;
        }
        return count;
    }

    public static int rightSum(String A, int i) {
        int count = 0;
        for (int j = i + 1; j < A.length(); j++) {
            if (A.charAt(j) == '1') {
                count++;
            } else break;
        }
        return count;
    }
}
