package day53_intermediate_arrays_carry_forward.assignments;

import java.util.Scanner;

public class Q2_ClosestMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz = sc.nextInt();
        int[] ar = new int[sz];
        for (int i = 0; i < sz ; i++) {
            ar[i] = sc.nextInt();
        }

    }

    public static void minMaxSub(int[] ar) {
        int minVal = minArray(ar);
        int maxVal = maxArray(ar);


    }

    public static int minArray(int[] ar) {
        int minVal = Integer.MAX_VALUE;

        for (int j : ar) {
            if (j < minVal) {
                minVal = j;
            }
        }
        return minVal;
    }
    public static int maxArray(int[] ar) {
        int maxValue = Integer.MIN_VALUE;

        for (int j : ar) {
            if (j > maxValue) {
                maxValue = j;
            }
        }
        return maxValue;
    }
}
