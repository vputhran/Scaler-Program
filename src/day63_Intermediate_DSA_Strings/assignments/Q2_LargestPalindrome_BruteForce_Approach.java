package day63_Intermediate_DSA_Strings.assignments;

public class Q2_LargestPalindrome_BruteForce_Approach {
    public static void main(String[] args) {
        String S = "abcba";
        System.out.println(largestPalindrome(S));
    }

    /* https://www.geeksforgeeks.org/longest-palindrome-substring-set-1/ */
    public static int largestPalindrome(String A) {
        int length = 0;
        int maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < A.length(); i++) {
            for (int j = i; j < A.length(); j++) {
                if (checkPalindrome(A, i, j)) {
                    length = j - i + 1;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
    //Checking if a Sub-String is a Palindrome
    public static boolean checkPalindrome(String S, int s, int e) {
        while (s < e) {
            if (S.charAt(s) == S.charAt(e)) {
                s++;
                e--;
            } else return false;
        }
        return true;
    }
}
