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

        Scanner sc = new Scanner(System.in);

    }
}
