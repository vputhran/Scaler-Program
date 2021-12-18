package day57_intermediate_bit_manipulation_1.assignement;

public class Q2_SingleNumber {
    public static void main(String[] args) {
        int[] ar = {1, 2, 2};
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
