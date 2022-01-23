package day52_intermediate_arrays_prefix_sum.classprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Q3_OddEvenIndexSum {
    public static void main(String[] args) {
        int[] ar = {2, 3, 1, -1, 0, 8, 5, 4};
        System.out.println(Arrays.toString(ar));

        int[] ePS = new int[ar.length];
        int[] oPS = new int[ar.length];

        // Creating the even prefix sum
        ePS[0] = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (i % 2 == 0) {
                ePS[i] = ePS[i - 1] + ar[i];
            } else {
                ePS[i] = ePS[i - 1];
            }
        }
        System.out.println(Arrays.toString(ePS));

        // Creating the odd prefix sum
        oPS[0] = 0;
        for (int i = 1; i < ar.length; i++) {
            if (i % 2 != 0) {
                oPS[i] = oPS[i - 1] + ar[i];
            } else {
                oPS[i] = oPS[i - 1];
            }
        }
        System.out.println(Arrays.toString(oPS));

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 1; i <= q ; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            char c = sc.next().charAt(0);

            if (c == '0') {
                System.out.println(preSum(oPS, s, e));
            } else {
                System.out.println(preSum(ePS, s, e));
            }
        }
    }

    public static int preSum(int[] preArr, int s, int e) {
        if (s < 0) {
            return -1;
        } else if (e > preArr.length - 1) {
            return -1;
        } else if (s == 0) {
            return preArr[e];
        }
        return preArr[e] - preArr[s - 1];
    }
}
