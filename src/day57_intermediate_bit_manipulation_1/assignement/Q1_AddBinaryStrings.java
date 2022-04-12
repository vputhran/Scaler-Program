package day57_intermediate_bit_manipulation_1.assignement;

public class Q1_AddBinaryStrings {
    public static void main(String[] args) {
        System.out.println(binSum("1010110111001101101000", "1000011011000000111100110"));
        System.out.println(binSum("101", "1000"));
        System.out.println(binSum("1010", "0101"));
    }

    public static String binSum(String A, String B) {
        int length;
        int diff;
        if (A.length() < B.length()) {
            length = B.length();
            diff = B.length() - A.length();
            StringBuilder aNew = new StringBuilder(A);
            aNew.reverse();
            for (int i = 0; i < diff; i++) {
                aNew.append('0');
            }
            A = aNew.reverse().toString();
        } else {
            length = A.length();
            diff = A.length() - B.length();
            StringBuilder bNew = new StringBuilder(B);
            bNew.reverse();
            for (int i = 0; i < diff; i++) {
                bNew.append('0');
            }
            B = bNew.reverse().toString();
        }
        StringBuilder st = new StringBuilder();

//        int[] sum = new int[length+1];
        int carry = 0;
        for (int i = length - 1; i >= 0; i--) {
            int a = A.charAt(i) - '0';
            int b = B.charAt(i) - '0';

            int res = a + b + carry;

            st.append((char) ('0' + res % 2));

            carry = res/2;

        }
        if(carry == 1){
            st.append('1');
        }
        return st.reverse().toString();
        }

    }
