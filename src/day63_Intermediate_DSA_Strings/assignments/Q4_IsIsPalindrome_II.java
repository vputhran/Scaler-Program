package day63_Intermediate_DSA_Strings.assignments;

public class Q4_IsIsPalindrome_II {
    public static void main(String[] args) {
        String A = "abcba";
        System.out.println(solve(A));
    }
    public static int solve(String A) {
        int length = A.length();
        int count = 0;
        for (int i = 0; i < length / 2; i++) {
            if (A.charAt(i) == A.charAt(length-1-i)) {
                count++;
            }
        }
        if (count == length/2) {
            return 1;
        }
        return 0;
    }
}
