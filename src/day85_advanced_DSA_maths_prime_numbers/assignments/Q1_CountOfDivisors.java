package day85_advanced_DSA_maths_prime_numbers.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_CountOfDivisors {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(8, 9, 10));
        System.out.println(solve(A));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < A.size(); i++) {
            maxVal = Math.max(A.get(i), maxVal);
        }

        int[] spf = new int[maxVal + 1];
        for (int i = 0; i < spf.length; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i<=spf.length ; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j < spf.length; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            int n = A.get(i);
            int divCount = 1;
            while (n > 1) {
                int count = 0;
                int p = spf[n];
                while (n % p == 0) {
                    count++;
                    n = n / p;
                }
                divCount = divCount * (count + 1);
            }
            ans.add(divCount);
        }
        return ans;
    }
}
