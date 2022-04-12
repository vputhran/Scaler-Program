package day63_Intermediate_DSA_Strings.classprograms;

public class Q3_ReverseSubString {
    public static void main(String[] args) {
        String s = "Happy Days";
        String s1 = "JollyGood";
        int l = 1;
        int r = 5;
        System.out.println(revString(s1, l, r));
    }

    public static String revString(String S, int l, int r) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            str.append(S.charAt(i));
        }
        // Two Pointer Approach
        while (l < r) {
            char temp = str.charAt(l);
            str.setCharAt(l, str.charAt(r));
            str.setCharAt(r, temp);
            l++;
            r--;
        }
        return str.toString();
    }
}
