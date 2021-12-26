package day61_intermediate_sorting.classprograms;

import java.util.Arrays;

public class Q3_NobelIntegersForDuplicateArrayElements {
    public static void main(String[] args) {
        int[] ar = {-10, 1, 1, 1, 4, 4, 4, 9, 9, 10, 10};

        System.out.println(nobleIntegerDuplicate_ClassApproach(ar));
    }



    public static int nobleIntegerDuplicate_ClassApproach(int[] ar) {
        int count = 0;
        int lessCount = 0;
        Arrays.sort(ar);
        if (ar[0] == 0) {
            count++;
        }
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] != ar[i - 1]) {
                lessCount = i;
            }
            if (lessCount == ar[i]) {
                count++;
            }
        }
        return count;
    }
}
