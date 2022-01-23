package day52_intermediate_arrays_prefix_sum.classprograms;

import java.util.Arrays;

public class Q4_2_ReturnCountSpecialIndex {
    public static void main(String[] args) {
        int[] ar = {4, 3, 2, 7, 6, -2};
        System.out.println(Arrays.toString(ar));
        //Creating even sum prefix array
        int[] ePS = new int[ar.length];
        ePS[0] = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (i % 2 == 0) {
                ePS[i] = ePS[i - 1] + ar[i];
            } else {
                ePS[i] = ePS[i - 1];
            }
        }
        System.out.println(Arrays.toString(ePS));

        //Creating odd sum prefix array
        int[] oPS = new int[ar.length];
        oPS[0] = 0;
        for (int i = 1; i < ar.length; i++) {
            if (i % 2 != 0) {
                oPS[i] = oPS[i - 1] + ar[i];
            } else {
                oPS[i] = oPS[i - 1];
            }
        }
        System.out.println(Arrays.toString(oPS));


        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            int eSum;
            int oSum;
            int oRange = oPS[ar.length - 1] - oPS[i];
            int eRange = ePS[ar.length - 1] - ePS[i];
            if (i == 0) {
                eSum = oRange;
                oSum = eRange;
            } else {
                eSum = ePS[i - 1] + oRange;
                oSum = oPS[i - 1] + eRange;
            }
            if (oSum == eSum) {
                count++;
            }
        }
        System.out.println(count);

    }
}
