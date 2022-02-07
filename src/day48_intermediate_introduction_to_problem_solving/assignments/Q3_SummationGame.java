package day48_intermediate_introduction_to_problem_solving.assignments;

import java.util.Scanner;

public class Q3_SummationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = n*(n + 1) / 2;
        System.out.println(sum);
    }
}
