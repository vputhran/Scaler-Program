package day56_intermediate_arrays_interview_problems.classprograms;

public class Q3_CountTriplets {
    public static void main(String[] args) {
        int[] A = {2, 6, 9, 4, 10};
        int[] B = {3, 6, 9, 12, 5, 16, 8, 7, 11};
        System.out.println(tripletCount(B));
        System.out.println(tripletCount_Optimised(B));
    }

    // Brute force approach
    public static int tripletCount(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                if (A[i] < A[j]) {
                    for (int k = j + 1; k < A.length; k++) {
                        if (A[i] < A[j] && A[j] < A[k]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    //Optimised Approach
    public static int tripletCount_Optimised(int[] A) {
        int sum = 0;
        for (int i = 1; i < A.length - 1; i++) {
            sum += leftSmaller(A, i, A[i]) * rightLarger(A, i, A[i]);
        }
        return sum;
    }

    public static int leftSmaller(int[] A, int sIdx, int val) {
        int count = 0;
        for (int i = sIdx - 1; i >= 0; i--) {
            if (A[i] < val) {
                count++;
            }
        }
        return count;
    }

    public static int rightLarger(int[] A, int sIdx, int val) {
        int count = 0;
        for (int i = sIdx + 1; i < A.length; i++) {
            if (A[i] > val) {
                count++;
            }
        }
        return count;
    }
}
