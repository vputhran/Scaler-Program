package bday13.assignments;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q1_SumTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i =0; i<ar.length; i++){
            ar[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(arraySum(ar));
    }

    static int arraySum(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum = sum + ar[i];
        }
        return sum;
    }
}
