package day85_advanced_DSA_maths_prime_numbers.classprograms;


import java.util.Arrays;

/* Q4. Count the number of Divisors for given Q queries */

public class Q4_Count_No_Of_Divisors {
    public static void main(String[] args) {
        int[] q = {72, 18, 20, 24};
        System.out.println(Arrays.toString(divisorCount(q)));

    }

    public static int[] divisorCount(int[] Q) {
        // Identifying the max query value
        int mxQuery = Integer.MIN_VALUE;
        for (int i = 0; i < Q.length; i++) {
            mxQuery = Math.max(mxQuery, Q[i]);
        }

        //Generating the spf(smallest prime factor) array till the mxQuery value
        int[] spf = new int[mxQuery + 1];

        //Initially assuming that all the values in spf are prime numbers
        for (int i = 2; i < spf.length; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i < spf.length; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j < spf.length; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }
        int[] divArray = new int[Q.length];

        /* Using the prime factorization method calculating the divisors */

        for (int i = 0; i < Q.length; i++) {
            int n = Q[i];
            int ans = 1;
            while (n > 1) {
                int count = 0;
                int P = spf[n];
                while (n % P == 0) {
                    count++;
                    n = n / P;
                }
                ans = ans * (count + 1);
            }
            divArray[i] = ans;
        }
        return divArray;
    }

}
