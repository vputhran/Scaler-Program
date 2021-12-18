package bday8.homework;

import java.util.Scanner;

public class Q7_ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double charge = 0;
        int totalBill = 0;
        if (a > 250) {
            charge = charge + (a - 250) * (1.5);
            a = 250;
        }
        if (a > 150) {
            charge = charge + (a-150) * (1.2);
            a = 150;
        }
        if (a > 50) {
            charge = charge + (a-50) * (0.75);
            a = 100;
        }
        if (a <= 50) {
            charge = charge + (a * 0.5);
        }
        totalBill = (int) Math.floor(charge + (0.20));
        System.out.println(totalBill);
    }
}
