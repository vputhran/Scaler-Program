package bday12.classproblems;

import java.util.Scanner;

public class FactorialWithRecursions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
    }

    static int factorial(int n) {
    /*Base case*/
        if (n == 0) {
            return 1;
        }
    /* Recursive call */
        int ans = n * factorial(n - 1);
        return ans;
    }
}
