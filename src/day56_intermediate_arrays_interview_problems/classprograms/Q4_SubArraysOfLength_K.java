package day56_intermediate_arrays_interview_problems.classprograms;

public class Q4_SubArraysOfLength_K {
    public static void main(String[] args) {
        int[] A = {3, 4, 2, -1, 6, 7, 8, 9, 3, 2, -1, 4};
        int k = 6;
        subArrayIndices(A, k);
        subArrayIndices_2(A, k);
    }

    public static void subArrayIndices(int[] A, int k) {
        for (int i = 0; i < A.length; i++) {
            int endIdx = (k-1)+ i;
            if (endIdx < A.length) {
                System.out.print(i + " " + endIdx);
            }
            System.out.println();
        }
    }

    // Using while-loop
    public static void subArrayIndices_2(int[] A, int k) {
        int stIdx = 0;
        int edIdx = k - 1;
        while (edIdx < A.length) {
            System.out.print(stIdx + " " + edIdx);
            System.out.println();
            stIdx++;
            edIdx++;
        }
    }
}
