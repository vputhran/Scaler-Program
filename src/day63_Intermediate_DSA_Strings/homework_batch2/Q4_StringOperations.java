package day63_Intermediate_DSA_Strings.homework_batch2;

public class Q4_StringOperations {
    public static void main(String[] args) {
        String A = "AbcaZeoB";
        System.out.println(solve(A));
    }

    public static String solve(String A) {
        StringBuilder aNew = new StringBuilder(A + A);
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < aNew.length(); i++) {

            if (aNew.charAt(i) == 'a' || aNew.charAt(i) == 'e' || aNew.charAt(i) == 'i' || aNew.charAt(i) == 'o' || aNew.charAt(i) == 'u') {
                ret.append('#');
            } else if (!(aNew.charAt(i) >= 'A' && aNew.charAt(i) <= 'Z')) {
                ret.append(aNew.charAt(i));
            }
        }
        return ret.toString();
    }
}
