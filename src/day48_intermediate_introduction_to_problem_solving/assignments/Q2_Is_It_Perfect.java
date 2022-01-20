package day48_intermediate_introduction_to_problem_solving.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2_Is_It_Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            int n = sc.nextInt();
            if (n == factorSum(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static int factorSum(int n) {
        int sum = 0;

        // Calculating the factors from 1 to less than n
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

}
