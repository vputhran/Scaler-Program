package day58_intermediate_bit_manipulations_2.classprograms;

public class Q3_Unset_ith_Bit {
    public static void main(String[] args) {
        int N = 15;
        int i = 1;
        System.out.println(unsetBit(N, i));
    }
    /* Ref: https://www.geeksforgeeks.org/how-to-turn-off-a-particular-bit-in-a-number/  */
    public static int unsetBit(int N, int i) {
        return (N & ~(1 << (i - 1)));
    }
}

