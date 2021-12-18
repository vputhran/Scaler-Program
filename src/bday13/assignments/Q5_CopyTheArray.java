package bday13.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Q5_CopyTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int B = sc.nextInt();

        System.out.println(Arrays.toString(solve(A, B)));
    }

    public static int[] solve(final int[] A, int B) {
        int[] outArr = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            outArr[i] = A[i]+B;
        }
        return outArr;
    }
}
