package day53_intermediate_arrays_carry_forward.classprograms;

import java.util.Objects;

public class Q3_CountPairs_ag {
    public static void main(String[] args) {
        String[] st = {"a", "b", "c", "g", "a", "g"};
        String[] st1 = {"b","c","g","d","g","a","g"};
        String[] st2 = {"c", "c", "a", "g", "g", "a", "a", "g"};
        String[] st3 = {"a", "c", "b", "a", "g", "k", "a", "g", "g"};
        System.out.println(countPairs(st3));
        System.out.println(countPairsOptimum(st3));
        System.out.println(rightCountPairs(st3));
    }
    // Brute Force Approach
    public static int countPairs(String[] S) {
        int count = 0;
        for (int i = 0; i < S.length; i++) {
            if (Objects.equals(S[i], "a")) {
                for (int j = i+1; j < S.length; j++) {
                    if (Objects.equals(S[j], "g")) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // Optimized Approach --> Counting from left to right and increment aCount and pairCount = pairCount + aCount
    public static int countPairsOptimum(String[] S) {
        int aCount = 0;
        int pairCount = 0;

        for (int i = 0; i < S.length; i++) {
            if (Objects.equals(S[i], "a")) {
                aCount++;
            } else if (Objects.equals(S[i], "g")) {
                pairCount = pairCount + aCount;
            }
        }
        return pairCount;
    }

    // Optimized Approach --> Counting from right to left
    public static int rightCountPairs(String[] S) {
        int gCount = 0;
        int pairCount = 0;

        for (int i = S.length; i > 0; i--) {
            if (Objects.equals(S[i], "g")) {
                gCount++;
            } else if (Objects.equals(S[i], "a")) {
                pairCount = pairCount + gCount;
            }
        }
        return pairCount;
    }
}
