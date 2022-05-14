package day85_advanced_DSA_maths_prime_numbers.classprograms;

/* Q3. Given N, find the smallest prime factors of all numbers from 2 to N*/


import java.util.Arrays;

public class Q3_SmallestPrimeFactors {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(Arrays.toString(smallestPrimeFactor(n)));
    }

    public static int[] smallestPrimeFactor(int n) {

        //Using Sieve of eratosthenes
        int[] spf = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i <= n; i++) {
            if (spf[i] == i) {  // Assuming the num is prime if its equal to its index
                for (int j = i * i; j <= n; j += i) {  // Iterating the multiples of i and checking if they have been changed
                    if (spf[j] == j) {  // checking if the number is equal to the index, if not change it to i, which will be the smallest factor
                        spf[j] = i;
                    }
                }
            }
        }
        return spf;
    }
}
