package bday13.assignments;

import java.util.Scanner;

public class Q4_InsertThat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        //Index Position
        int x = sc.nextInt();
        // Index Value
        int y = sc.nextInt();

        for (int i = 0; i < n; i++) {

            if (i == (x-1)) {
                System.out.print(y+" ");
            }
            System.out.print(ar[i]+" ");
        }
    }
}
