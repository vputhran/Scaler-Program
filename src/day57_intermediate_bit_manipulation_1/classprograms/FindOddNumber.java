package day57_intermediate_bit_manipulation_1.classprograms;

/* Q1. Given a array where all the numbers appear even no. of times except one which appears odd no. of times.
*      Find the odd number. */

/* Adobe, Amazon, Microsoft, OYO */

/* Hint:  a ^ a = 0 */

public class FindOddNumber {
    public static void main(String[] args) {
        int[] ar = {2, 8, 3, 1, 2, 2, 3, 2, 8, 1, 1};
        System.out.println(oddNumber(ar));
    }

    public static int oddNumber(int[] ar) {
        int oddNum = 0;
        for (int j : ar) {
            oddNum = oddNum ^ j;
        }
        return oddNum;
    }
}
