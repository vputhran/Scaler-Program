package day57_intermediate_bit_manipulation_1.homework;

public class Q3_InterestingArray {
    public static void main(String[] args) {
        int[] A = {9, 17};
        System.out.println(solve(A));
    }
    public static String solve(int[] A) {
        int xor = A[0];
        for (int i = 1; i < A.length; i++) {
            xor ^= A[i];
        }
        if (xor % 2 == 0) {
            return "Yes";
        }
        return "No";
    }
}
