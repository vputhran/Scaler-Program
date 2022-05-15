package day85_advanced_DSA_maths_prime_numbers.assignments;

import java.util.ArrayList;

public class Q2_PrimeSum {
    public static void main(String[] args) {
        int A = 16777214;
//        int A = 10;
        System.out.println(primeSum(A));
    }

    public static ArrayList<Integer> primeSum(int A) {
        /* Using Sieves algo - to generate the spf array */
        int[] spf = new int[A + 1];
        for (int i = 1; i <= A; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i < A; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j < A; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }

        /* Since A is the sum of 2 prime numbers
            If fPrime = spf[i] is the first prime number,then we need to find  sPrime = A - fPrime.
            If the index spf[sPrime] contains the value sPrime, then break.
            Else continue the loop.
        */
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 2; i < spf.length; i++) {
            int fPrime = spf[i];
            int sPrime = A - fPrime;
            if (spf[sPrime] == sPrime) {
                ans.add(fPrime);
                ans.add(sPrime);
                break;
            }
        }
        return ans;
    }
}
