package day54_intermediate_arrays_subarrays.classprograms;

import java.util.Scanner;

public class Q2_SubArraySum {
    public static void main(String[] args) {
        int[] ar = {2, 4, 5, -1, 3, 6, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Start Index ");
        int srt = sc.nextInt();
        System.out.print("End Index ");
        int end = sc.nextInt();
        System.out.println(subSum(ar,srt,end));
    }

    public static int subSum(int[] A, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end ; i++) {
            sum += A[i];
        }
        return sum;
    }
}
