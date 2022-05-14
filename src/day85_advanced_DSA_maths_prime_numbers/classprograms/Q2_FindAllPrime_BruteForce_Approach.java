package day85_advanced_DSA_maths_prime_numbers.classprograms;


import java.util.ArrayList;

/* Q2. Find all the prime numbers from [1,N] */

public class Q2_FindAllPrime_BruteForce_Approach {
    public static void main(String[] args) {
        int n = 37;
        System.out.println(allPrimes_BruteForce(n));
    }
    /* Brute force approach - O(n * sqrt(n)) */
    public static ArrayList<Integer> allPrimes_BruteForce(int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
