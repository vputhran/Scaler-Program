package day63_Intermediate_DSA_Strings.homework;

public class Q3_LengthOfLastWord {
    public static void main(String[] args) {
        String A = "HelloWorld";
//        String A = "d";
//        String A = "Wordl";
//        String A = "Hello World  ";
        System.out.println(lengthOfLastWord(A));
    }
    // Find the length of the last word in the String
    public static int lengthOfLastWord(final String A) {
        int length = 0;
        for (int i = A.length() - 1; i >= 0; i--) {
            if (A.charAt(i) != ' ') {
                length++;
            } else if (A.charAt(i) == ' ' && length == 0) {
                continue;
            }else break;
        }
        return length;
    }
}