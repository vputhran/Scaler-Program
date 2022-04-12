package day71_intermediate_DSA_recursion_1.assignment;

public class Q1_CheckPalindrome {
    public static void main(String[] args) {
        String A = "naman";
        System.out.println(solve(A));
    }
    /*Reference : https://www.studytonight.com/java-programs/java-program-to-check-palindrome-string-using-recursion */
    public static int solve(String A) {
        if (A.length() == 0 || A.length() == 1) {
            return 1;
        }
        if (A.charAt(0) == A.charAt(A.length() - 1)) {
            return solve(A.substring(1, A.length() - 1));
        }
        return 0;
    }
}
