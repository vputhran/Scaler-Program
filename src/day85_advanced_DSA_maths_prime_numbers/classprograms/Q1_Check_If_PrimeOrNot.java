package day85_advanced_DSA_maths_prime_numbers.classprograms;

public class Q1_Check_If_PrimeOrNot {
    public static void main(String[] args) {
        int n = 37;
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n) {
        // 1 is neither prime nor composite, but assuming anything below 1 as false
        if (n <= 1) {
            return false;
        }
        // Prime numbers has only 2 factors 1 and the number itself, so any number have more than 2 factors is not prime.
        for (int i = 2; i * i < n  ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
