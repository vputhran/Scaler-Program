package bday8.homework;

import java.util.Scanner;

public class Q3_CategoriesTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("0");
        } else if (n < 0) {
            System.out.println("-1");
        } else {
            System.out.println("1");
        }
    }
}
