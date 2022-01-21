package day48_intermediate_introduction_to_problem_solving.homework;

import java.util.Scanner;

public class Q1_ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        armstrong(n);
    }

    public static void armstrong(int n) {

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int a = i;
            while (a > 0) {

                int r = a % 10; // Get the remainder
                sum = sum + (r * r * r);
                a = a / 10;  // Remove the last digit
            }
            if (sum == i) {
                System.out.println(sum);
            }
        }
    }
}
