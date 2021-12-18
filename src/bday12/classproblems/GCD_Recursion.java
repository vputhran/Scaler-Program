package bday12.classproblems;

import java.util.Scanner;

public class GCD_Recursion {
    public static void main(String[] args) {
        gcdList();
    }

    /*GCD of 2 numbers using recursion*/
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
    /* GCD of a List of Numbers*/
    static void gcdList() {
        Scanner sc = new Scanner(System.in);
        // Scan the no. of Inputs
        int n = sc.nextInt();

        // Scan the 1 & 2nd input
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Store the gcd of a & b
        int ans = gcd(a, b);

        // Iterate from 3 to n
        for (int i = 3; i <= n; i++) {

            // scan the 3rd number and so on
            int current = sc.nextInt();
            ans = gcd(current, ans);
        }

        System.out.println("GCD " + ans);
    }
}
