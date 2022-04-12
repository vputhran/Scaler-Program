package day58_intermediate_bit_manipulations_2.classprograms;

public class Q1_CheckBitSetOrUnset {
    public static void main(String[] args) {
        int N = 11;
        int i = 1;
        System.out.println(checkBit(N, i));
        System.out.println(checkBit_rightShift_N(N, i));
        System.out.println(checkBit_leftShift_1(N, i));
    }

    public static String checkBit(int N, int i) {
        int m = 0;
        int count = 0;
        while (count != i+1) {
            m = N % 2;
            N = N / 2;
            count++;
        }
        if (m == 1) {
            return "set";
        }
        return "unset";
    }

    /* Using right shift and & operators */
    // Right Shifting N, i times
    public static String checkBit_rightShift_N(int N, int i) {
        if (((N >> i) & 1) == 1) {
            return "set";
        }
        return "unset";
    }

    // Left shifting 1, i times
    public static String checkBit_leftShift_1(int N, int i) {
        if ((N & (1 << i))==0) {
            return "Unset";
        }
        return "Set";
    }

}
