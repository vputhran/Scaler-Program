package day71_intermediate_DSA_recursion_1.leetcode;

import java.util.Arrays;
/* https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1440/ */

public class ReverseString2 {
    public static void reverseString(char[] s) {
        reverse(0, s.length - 1, s);
    }

    public static void reverse(int start, int end, char[] s) {
        if (start >= end) {
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        reverse(start + 1, end - 1, s);

    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
