package day63_Intermediate_DSA_Strings.assignments_batch2;

public class Q2_SimpleReverse {
    public static void main(String[] args) {
        String A = "Scaler";
        System.out.println(solve(A));
    }
    public static String solve(String A) {
        StringBuilder st = new StringBuilder();
        for (int i = A.length() - 1; i >= 0; i--) {
            st.append(A.charAt(i));
        }
        return st.toString();
    }
}
