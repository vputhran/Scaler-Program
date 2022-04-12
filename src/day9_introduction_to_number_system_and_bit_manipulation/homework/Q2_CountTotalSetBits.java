package day9_introduction_to_number_system_and_bit_manipulation.homework;

public class Q2_CountTotalSetBits {
    public static void main(String[] args) {
        int A = 1000000000; // The expected return value: 846928043
        System.out.println(solve(A));
    }
    public static int solve(int A) {
        int sum = 0;
        for (int i = 1; i <= A; i++) {
            sum += setCount(i);
        }
        return sum % 1000000007;
    }

    public static int setCount(int a) {
        int count = 0;
        while (a > 0) {
            count += a & 1;
            a >>= 1;
        }
        return count;
    }
}
