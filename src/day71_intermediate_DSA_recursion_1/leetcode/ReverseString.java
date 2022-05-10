package day71_intermediate_DSA_recursion_1.leetcode;

public class ReverseString {

    public static void reverse(int index, char[] str) {
        if (str == null || index >= str.length) {
            return;
        }
        reverse(index+1,str);
        System.out.print(str[index] + " ");
    }



    public static void main(String[] args) {
        char[] str = {'v', 'i', 'n', 'e', 'e', 't', 'h'};
        reverse(0,str);
    }
}
