package bday8.assignments;

import java.util.Scanner;

public class Q9_HCFusingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int r = 1;
            while (r != 0) {
                r = a % b;
                a = b;
                b = r;
            }
            System.out.println(a);
        }
    }
}
