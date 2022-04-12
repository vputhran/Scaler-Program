package day63_Intermediate_DSA_Strings.homework_batch2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Q5_LongestCommonPrefix {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>(Arrays.asList("abab", "ab", "abcd"));
        System.out.println(longestCommonPrefix(A));
    }

    public static String longestCommonPrefix(ArrayList<String> A) {
        StringBuilder s = new StringBuilder();
        //Finding the smallest String in the Arraylist
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i).length() < len) {
                len = A.get(i).length();
            }
        }
            int preCount = 0;
            while (preCount < len) {
                String st = A.get(0);
                char prefix = st.charAt(preCount);
                int count = 1;
                for (int j = 1; j < A.size(); j++) {
                    String st2 = A.get(j);
                    if (st2.charAt(preCount) == prefix) {
                        count++;
                    }
                }
                if (count == A.size()) {
                    s.append(prefix);
                    preCount++;
                } else break;
            }
        return s.toString();
    }
}
