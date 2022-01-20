package day48_intermediate_introduction_to_problem_solving.assignments;

import java.util.Scanner;

public class Q4_SquareRootOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solve(n));
    }

    public static int solve(int A) {
        for (int i = 1; i * i <= A; i++) {
            if (i * i == A) {
                return i;
            }
        }
        return -1;
    }
}
