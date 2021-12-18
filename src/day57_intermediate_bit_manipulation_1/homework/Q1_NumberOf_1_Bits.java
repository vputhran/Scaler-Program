package day57_intermediate_bit_manipulation_1.homework;

public class Q1_NumberOf_1_Bits {
    public static void main(String[] args) {
        System.out.println(numSetBits(4));
    }
    public static int numSetBits(int A) {
        int count = 0;
        while (A != 0) {
            if (A % 2 != 0) {
                count++;
                A = A / 2;
            } else {
                A = A / 2;
            }
        }
        return count;
    }
}
