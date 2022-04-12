package day9_introduction_to_number_system_and_bit_manipulation.homework;

public class Q1_AddBinaryStrings {
    public static void main(String[] args) {
        String a = "1010110111001101101000";
        String b = "1000011011000000111100110";
        //Expected Value 1001110001111010101001110
        System.out.println(addBinary(a, b));
    }
    public static String addBinary(String A, String B) {
        int difLength = 0;
        StringBuilder aNew;
        StringBuilder bNew;
        if (A.length() > B.length()) {
            difLength = A.length() - B.length();
            aNew = new StringBuilder(A);
            bNew = new StringBuilder();
            while (difLength > 0) {
                bNew.append('0');
                difLength--;
            }
            bNew.append(B);
        }else {
            difLength = B.length() - A.length();
            bNew = new StringBuilder(B);
            aNew = new StringBuilder();
            while (difLength > 0) {
                aNew.append('0');
                difLength--;
            }
            aNew.append(A);
        }
        char carry = '0';
        StringBuilder sum = new StringBuilder();
        for (int i = aNew.length()-1; i >= 0; i--) {
            if (aNew.charAt(i) == '0' && bNew.charAt(i) == '0' && carry == '0') {
                sum.append('0');
                carry = '0';
            } else if (aNew.charAt(i) == '0' && bNew.charAt(i) == '0' && carry == '1') {
                sum.append('1');
                carry = '0';
            } else if (aNew.charAt(i) == '0' && bNew.charAt(i) == '1' && carry == '0') {
                sum.append('1');
                carry = '0';
            }else if (aNew.charAt(i) == '0' && bNew.charAt(i) == '1' && carry == '1') {
                sum.append('0');
                carry = '1';
            } else if (aNew.charAt(i) == '1' && bNew.charAt(i) == '0' && carry == '0') {
                sum.append('1');
                carry = '0';
            } else if (aNew.charAt(i) == '1' && bNew.charAt(i) == '0' && carry == '1') {
                sum.append('0');
                carry = '1';
            } else if (aNew.charAt(i) == '1' && bNew.charAt(i) == '1' && carry == '0') {
                sum.append('0');
                carry = '1';
            } else if (aNew.charAt(i) == '1' && bNew.charAt(i) == '1' && carry == '1') {
                sum.append('1');
                carry = '1';
            }
        }
        if (carry == '1') {
            sum.append('1');
        }
        sum.reverse();
        return sum.toString();
    }

}
