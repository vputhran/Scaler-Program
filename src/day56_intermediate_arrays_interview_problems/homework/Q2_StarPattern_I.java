package day56_intermediate_arrays_interview_problems.homework;

import java.util.Scanner;

public class Q2_StarPattern_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2*i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2*n-2-2*i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
