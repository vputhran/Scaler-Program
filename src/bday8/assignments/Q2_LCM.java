package bday8.assignments;

import java.util.Scanner;

public class Q2_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        lcm_logic1(num1,num2);
        lcm_logic2(num1,num2);
    }

    static void lcm_logic1(int n1, int n2) {
        int max = 0;
        if (n1 > n2) {
            max = n1;
        } else {
            max = n2;
        }
        int next = max;
        while (max != 0) {
            if (max % n1 == 0 && max % n2 == 0) {
                System.out.printf("LCM of %d and %d is %d \n", n1, n2, max);
                break;
            } else {
                max = max+next;
            }
        }
    }

    static void lcm_logic2(int n1, int n2) {
        int lower_limit = Math.max(n1, n2);
        int upper_limit = n1 * n2;

        for (int i = lower_limit; i <= upper_limit ; i++) {
            if (i%n1 == 0 & i%n2 == 0) {
                System.out.printf("LCM of %d and %d is %d \n", n1, n2, i);
                break;
            }
        }
    }
}
