package day81_advanced_DSA_bit_manipulations_1.classprograms;

/*Q1. For a given decimal number N, count the number of set bits */

public class Q2_CountSetBits {
    public static void main(String[] args) {
        int N = 29; // 11101
        System.out.println(countBits(N));
        System.out.println(countBit_UsingSetBit(N));
    }


    public static int countBits(int N) {
        int count = 0;
        while (N != 0) {
            if ((N & 1) == 1) {
                count++;
            }
            N = N >> 1;
        }
        return count;
    }

    /* Using Check Bit approach */
    public static boolean setBit(int N, int i) {
        if (((N >> i) & 1) == 1) {
            return true;
        } else return false;
    }

    public static int countBit_UsingSetBit(int N) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (setBit(N, i)) {
                count++;
            }
        }
        return count;
    }
}
