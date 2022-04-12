package day63_Intermediate_DSA_Strings.homework_batch2;

public class Q1_AmazingSubArrays {
    public static void main(String[] args) {
        String A = "ABEC";
        System.out.println(solve(A));
    }
    public static int solve(String A) {
        int subCount = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u' || A.charAt(i) == 'A' || A.charAt(i) == 'E' || A.charAt(i) == 'I' || A.charAt(i) == 'O' || A.charAt(i) == 'U') {
                subCount += A.length() - i;
            }
        }
        return subCount;
    }
}
