package day81_advanced_DSA_bit_manipulations_1.classprograms;

/* Q1. For a given decimal number N, check if the ith bit is set or not*/

public class Q1_SetBit {
    public static void main(String[] args) {
        int N = 29; // 29 => 11101
        int i = 3;

        System.out.println(checkBit(N, i));
        System.out.println(checkBitRightShift(N, i));
    }

    //Using Right Shift
    public static boolean checkBit(int N, int i) {
        return ((N >> i) & 1) == 1;
    }

    //Using Left shift -
    public static boolean checkBitRightShift(int N, int i) {
        return ((N & (1 << i)) == (1 << i));
    }
}
