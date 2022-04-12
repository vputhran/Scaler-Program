package day58_intermediate_bit_manipulations_2.classprograms;

public class Q2_Set_ith_Bit {
    public static void main(String[] args) {
        int N = 11;
        int i = 2;
        System.out.println(setBit(N, i));
    }
    /* Left shift 1 by i and OR with N */
    public static int setBit(int N, int i) {
        return N | (1 << i);
    }
}
