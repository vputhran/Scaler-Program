package day56_intermediate_arrays_interview_problems.homework;

import java.util.Scanner;

public class Q3_StarPattern_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    System.out.print("*");
                } else if (i + j == n-1) {
                    System.out.print("*");
                } else if (i + j < n-1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
