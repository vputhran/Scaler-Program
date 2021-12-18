package bday14.classprograms;

import java.util.Scanner;

public class T1_MinimumPick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i =0; i<ar.length; i++){
            ar[i] = sc.nextInt();
        }

        System.out.println(solve(ar));

    }

    public static int solve(int[] A) {
        int evenMax = Integer.MIN_VALUE;
        int oddMin = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            if ((A[i] % 2 == 0) && (A[i]>evenMax)) {
                evenMax = A[i];
            } else if ((A[i] % 2 != 0) && (A[i] < oddMin)) {
                oddMin = A[i];
            }
        }
        return (evenMax - oddMin);
    }
}
