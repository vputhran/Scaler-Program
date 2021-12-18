package day57_intermediate_bit_manipulation_1.assignement;

import java.util.Arrays;

public class Q1_AddBinaryStrings {
    public static void main(String[] args) {
        System.out.println(binSum("1010110111001101101000", "1000011011000000111100110"));
    }

    public static String binSum(String A, String B) {
        int length = 0;
        int diff = 0;
        if (A.length() > B.length()) {
            length = A.length();
            diff = A.length() - B.length();
            for (int i = 0; i < diff; i++) {
                B = '0' + B;
            }
        } else {
            length = B.length();
            diff = B.length() - A.length();
            for (int i = 0; i < diff; i++) {
                A = '0' + A;
            }
        }
        int[] sum = new int[length+1];
        int carry = 0;
        for (int i = length - 1; i >= 0; i--) {
            int a = A.charAt(i) - '0';
            int b = B.charAt(i) - '0';

            int res = a + b + carry;
            sum[i+1] =  (res % 2);

            carry = res/2;

        }
        return Arrays.toString(sum);
    }

}
