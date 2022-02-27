package day54_intermediate_arrays_subarrays.classprograms;

import java.util.Scanner;

public class Q1_PrintSubArray {
    public static void main(String[] args) {
        int[] ar = {2, 4, 5, -1, 3, 6, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Start Index ");
        int srt = sc.nextInt();
        System.out.print("End Index ");
        int end = sc.nextInt();
        printSub(ar, srt, end);
    }

    public static void printSub(int[] a, int srtIndex, int endIndex) {

        for (int i = srtIndex; i <= endIndex; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
