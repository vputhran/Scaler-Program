package bday13.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Q3_RemoveThat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        // Enter the array
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }


        //Enter index to be deleted
        int x = sc.nextInt();
        for (int i = 0; i < ar.length; i++) {
            //IF i = (x-1) skip
            if (i == (x - 1)) {
                continue;
            } else {
                System.out.print(ar[i] +" ");
            }
        }
    }
}
