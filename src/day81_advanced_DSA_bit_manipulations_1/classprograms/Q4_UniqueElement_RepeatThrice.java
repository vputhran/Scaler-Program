package day81_advanced_DSA_bit_manipulations_1.classprograms;

/* Q4. Given N array elements where every element repeats thrice except 1 unique element. Find the Unique element. */

public class Q4_UniqueElement_RepeatThrice {
    public static void main(String[] args) {
        int[] ar = {5, 7, 5, 4, 7, 11, 11, 9, 11, 7, 5, 4, 4};
        System.out.println(uniqueNum(ar));
    }

    public static boolean checkBit(int N, int i) {
        return ((N >> i) & 1) == 1;
    }

    public static int uniqueNum(int[] ar) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < ar.length; j++) {
                if (checkBit(ar[j], i)) {
                    count++;
                }
            }
            if (count % 3 == 1) {
                ans = ans + (1 << i);
            }
        }
        return ans;
    }
}
