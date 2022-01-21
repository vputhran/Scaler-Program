package day48_intermediate_introduction_to_problem_solving.homework;

import java.util.Scanner;

public class Q2_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        for (int i = 1; i <=10 ; i++) {
            System.out.println(A + " * " + i + " = " + (A * i));
        }
    }
}
