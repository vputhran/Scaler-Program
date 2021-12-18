package day6.assignments;

/*Given an array of integers A, every element appears twice except for one. Find that single one.
* NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*
* */

public class SingleNumber_Q1 {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 1};
        System.out.println(singleNumber(A));
    }
    public static int singleNumber(final int[] A) {
        int num = 0;
        for (int i = 0; i <= A.length-1; i++) {
            num = num ^ A[i];
        }
        return num;
    }
}
