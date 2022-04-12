package day58_intermediate_bit_manipulations_2.assignments;

public class Q2_FindingGoodDays {
    public static void main(String[] args) {
        int A = 5;
        System.out.println(solve(A));
    }

    // Solution is to count the number of set bits in A
    public static int solve(int A) {
        int count = 0;
        while (A != 0) {
            int aNew = A % 2;
            if (aNew == 1) {
                count++;
            }
            A = A / 2;
        }
        return count;
    }
}
