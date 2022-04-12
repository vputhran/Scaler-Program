package day61_intermediate_sorting.classprograms;

import java.util.Arrays;
import java.util.Comparator;

public class Q4_SortArrayBasedOnNumberOfFactors_UsingComparator_CORRECT_APPROACH {
    public static void main(String[] args) {
        int[] A = {9, 3, 4, 8, 16, 37, 6, 13, 15};

        System.out.println(Arrays.toString(factorBasedSort(A)));
    }
    public static int factors(int a) {
        int noFact = 0;
        for (int i = 1; i * i <= a; i++) {
            if (a % i == 0) {
                noFact++;
            }
        }
        return noFact;
    }
    public static int[] factorBasedSort(int[] A) {

        /* Converting the int Array to Integer Array (Object)*/
        Integer[] sorted = new Integer[A.length];
        for (int i = 0; i < A.length; i++) {
            sorted[i] = A[i];
        }
                Arrays.sort(sorted, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        int f1 = factors(o1);
                        int f2 = factors(o2);
                        if (f1 < f2) {
                            return -1;
                        } else if (f1 == f2 && o1 < o2) return -1;
                        return 1;
                    }
                });
        for (int i = 0; i < A.length; i++) {
            A[i] = sorted[i];
        }
        return A;
    }
}
