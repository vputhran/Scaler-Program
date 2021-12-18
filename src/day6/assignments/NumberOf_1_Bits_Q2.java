/*Write a function that takes an integer and returns the number of 1 bits it has.*/

package day6.assignments;

public class NumberOf_1_Bits_Q2 {
    public static void main(String[] args) {
        System.out.println(numSetBits(11));
    }
    public static int numSetBits(int A) {
        int count = 0;
        for (int i = 0; A > 0; i++) {
            if ((A & 1) == 1) {
                count++;
                A = A >> 1;
            } else {
                A = A >> 1;
            }
        }
        return count;
    }
    //Using while loop
    public static int numSetBits2(int A) {
        int count = 0;
        while (A != 0) {
            if ((A & 1) == 1) {
                count++;
            }
            A >>= 1;
        }
        return count;
    }
}
