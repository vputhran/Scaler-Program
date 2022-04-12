package day63_Intermediate_DSA_Strings.assignments;

public class Q3_ToggleCase {
    public static void main(String[] args) {
        String A = "Hello";
        System.out.println(solve(A));
        System.out.println(toggleChar_UsingBitManipulation(A));
    }

    // Using If-Else Approach
    public static String solve(String A) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            //Lower Case 97 to 122
            if (A.charAt(i) >= 'a' && A.charAt(i) <= 'z') {
                str.append((char) (A.charAt(i) - 32));
            //Upper Case 65 to 90
            } else if (A.charAt(i) >= 'A' && A.charAt(i) <= 'Z') {
                str.append((char) (A.charAt(i) + 32));
            }
        }
        return str.toString();
    }

    // Using XOR Approach
    public static String toggleChar_UsingBitManipulation(String A) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            str.append((char)(A.charAt(i) ^ 32));
        }
        return str.toString();
    }
}
