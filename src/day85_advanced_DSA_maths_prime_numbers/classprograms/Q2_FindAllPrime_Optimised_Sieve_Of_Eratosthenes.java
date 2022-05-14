package day85_advanced_DSA_maths_prime_numbers.classprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2_FindAllPrime_Optimised_Sieve_Of_Eratosthenes {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(allPrimes_Optimised(n));
    }


    public static ArrayList<Integer> allPrimes_Optimised(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        // Creating a boolean array
        boolean[] sieve = new boolean[n + 1];

        //Setting all the elements of the sieve array as true - assuming all the number are prime at first
        Arrays.fill(sieve, true);

        //setting sieve[0] and sieve[1] as false, since they are not prime
        sieve[0] = false; sieve[1]=false;

        /*
        * Iterating from 2
        * Assuming that index is set to true, the corresponding number is prime.
        * In the i loop - Iterating till sq.rt of n, anything above that will be not be touched because of j loop, since j loop start from j = i*i
        * In the j loop - setting the indices that are multiple of i as false - since they will be factors of i
        * In the j loop - index is starting from i * i, because the lower factors will already be set to false -> e.g 5*2 will already be set to false by 2
        * In the j loop - the increment happens by j += i, because only the multiples of i needs to be set to false.
        * */


        for (int i = 2; i * i <= n ; i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= n; j += i) {
                    sieve[j] = false;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (sieve[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}
