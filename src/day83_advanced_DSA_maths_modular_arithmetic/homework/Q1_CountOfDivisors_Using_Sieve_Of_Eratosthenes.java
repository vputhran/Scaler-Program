package day83_advanced_DSA_maths_modular_arithmetic.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_CountOfDivisors_Using_Sieve_Of_Eratosthenes {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
        System.out.println(solve(A));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        //Max element in the input array
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < A.size(); i++) {
            maxVal = Math.max(maxVal, A.get(i));
        }

        //Creating an array to store the smallest prime factor
        int[] spf = new int[maxVal+1];
        for (int i = 1; i <=maxVal ; i++) {
            spf[i] = i;
        }

        for (int i = 2; i <= maxVal; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= maxVal; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }

        ArrayList<Integer> sol = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            int temp = A.get(i);
            int ans = 1;

            while (temp != 1) {
                int cnt = 1;
                int d = spf[temp];

                while (temp != 1 && temp % d == 0) {
                    cnt++;
                    temp = temp / d;
                }
                ans = ans * cnt;
            }
            sol.add(ans);
        }
        return sol;
    }
}
