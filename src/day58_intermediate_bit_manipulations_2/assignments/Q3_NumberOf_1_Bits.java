package day58_intermediate_bit_manipulations_2.assignments;

public class Q3_NumberOf_1_Bits {
    public static void main(String[] args) {
        int A = 10;
        System.out.println(numSetBits(A));
    }

    public static int numSetBits(int A) {
        int count = 0;
        while (A != 0) {
            int B = A;
            B = B % 2;
            if (B == 1) {
                count++;
            }
            A = A / 2;
        }
        return count;
    }
}
