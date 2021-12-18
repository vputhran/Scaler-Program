package bday13.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_NegativeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        negArray(ar);
    }

    static void negArray(int[] ar) {
        int[] nArr = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < 0) {
                System.out.print(ar[i]+" ");
            }
        }

    }
}
