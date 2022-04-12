package day61_intermediate_sorting.classprograms;

import java.util.Arrays;

public class Q4_SortArrayBasedOnNumberOfFactors_NOT_CORRECT {
    public static void main(String[] args) {
        int[] ar = {9, 3, 4, 8, 16, 37, 6, 13, 15};

        System.out.println(Arrays.toString(factors(ar)));
        System.out.println(Arrays.toString(sort(ar)));


    }

    public static int factors(int a) {
        int noFact = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                noFact++;
            }
        }
        return noFact;
    }

    public static boolean comparator(int a, int b) {
        if (factors(a) < factors(b)) {
            return true;
        } else if ((factors(a) == factors(b)) && (a < b)) {
            return true;
        }
        return false;
    }

    public static int[] sort(int[] ar) {
        for (int i = 0; i < ar.length ; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (comparator(ar[i], ar[j])) {
                    break;
                }
            }
        }

        return ar;
    }



    public static int[] factors(int[] ar) {
        int[] arrFact = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            int count = 0;
            for (int j = 1; j <= ar[i]; j++) {

                if (ar[i] % j == 0) {
                    count++;
                }
            }
            arrFact[i] = count;
        }
        return arrFact;
    }
}
