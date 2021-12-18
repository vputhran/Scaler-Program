package bday12.classproblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Is a Prime Number "+isPrime(n));
    }

    static boolean isPrime(int n) {
        int i = 1;
        if (n == 0 || n == 1) {
            return false;
        }else {
            while (i * i <= n) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
        }
}
