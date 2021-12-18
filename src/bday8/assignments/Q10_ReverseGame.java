package bday8.assignments;

import java.util.Scanner;

public class Q10_ReverseGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 1; i <= T; i++) {
            int n = sc.nextInt();

            int rev = 0;

            while (n != 0) {
                int rem = n % 10;
                rev = (rev * 10) + rem;
                n = n / 10;
            }
            System.out.println(rev);
        }
    }
}
