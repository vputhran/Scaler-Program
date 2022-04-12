package day71_intermediate_DSA_recursion_1.classprogram;

public class Q4_CheckIfPalindrome {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 4, 3, 2, 1};
        System.out.println(isPalindrome(A, 0, A.length - 1));
    }

    public static boolean isPalindrome(int[] A, int start, int end) {

        if (start >= end) return true;
        if (A[start] == A[end] && isPalindrome(A, start + 1, end - 1)) {
            return true;
        }
        return false;
    }

}
