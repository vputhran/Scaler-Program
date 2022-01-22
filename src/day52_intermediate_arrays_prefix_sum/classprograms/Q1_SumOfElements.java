package day52_intermediate_arrays_prefix_sum.classprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_SumOfElements {
    public static void main(String[] args) {
        int[] ar = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};

        int[] preAr = new int[ar.length];

        preAr[0] = ar[0];
        for (int i = 1; i < ar.length; i++) {
            preAr[i] = preAr[i - 1] + ar[i];
        }

        System.out.println(Arrays.toString(preAr));

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for (int i = 1; i <= q ; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(subArraySum(preAr, start, end));
        }
    }

    public static int subArraySum(int[] preArr, int start, int end) {
        if (start == 0) {
            return preArr[end];
        }
            return preArr[end] - preArr[start - 1]; // start-1 because it will already contain the sum till start-1 and
            // only sum from start index to end.
    }
}
