package bday8.assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q1_PrintthePrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeSeries(n);
        System.out.println("Scaler Solution");
        primeSeries_ScalerSolution(n);
    }

    public static void primeSeries(int n) {
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }

    public static void primeSeries_ScalerSolution(int n) {

        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j != 0) {
                    continue;
                }else {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }

}
