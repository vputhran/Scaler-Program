package day63_Intermediate_DSA_Strings.homework;

public class Q1_SimpleReverse {
    public static void main(String[] args) {
        String A = "Scaler";
        System.out.println(solve(A));
    }
    public static String solve(String A) {
        StringBuilder rev = new StringBuilder();
        for (int i = A.length() - 1; i >= 0; i--) {
            rev.append(A.charAt(i));
        }
        return rev.toString();
    }
}
