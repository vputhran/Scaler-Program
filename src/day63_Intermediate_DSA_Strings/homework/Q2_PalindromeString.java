package day63_Intermediate_DSA_Strings.homework;

public class Q2_PalindromeString {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    public static int isPalindrome(String A) {
        //Building a new String to store the given string without any spaces, special char, cases
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {
            // Condition to check lower case and number
            if ((A.charAt(i) >= 'a' && A.charAt(i) <= 'z') || (A.charAt(i) >= '0' && A.charAt(i) <= '9')) {
                st.append((char) A.charAt(i));
            }
            // Condition to check Upper case and toggle it
            else if (A.charAt(i) >= 'A' && A.charAt(i) <= 'Z') {
                st.append((char) (A.charAt(i) + 32));
            }
        }
        // Palindrome Check
        int s = 0;
        int e = st.length()-1;
        while (s < e) {
            if (st.charAt(s) == st.charAt(e)) {
                s++;
                e--;
            } else return 0;
        }
        return 1;
    }
}
