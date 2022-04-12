package day61_intermediate_sorting.classprograms;

import java.util.Arrays;
import java.util.Comparator;

public class Q5_SortArrayBasedOnNumberOfDigits {
    public static void main(String[] args) {
        int[] A = {93, 2, 37, 639, 8, 100, 345, 49};
        System.out.println(Arrays.toString(digitBasedSort(A)));
    }

    public static int[] digitBasedSort(int[] A) {
        Integer[] newA = new Integer[A.length];
        for (int i = 0; i < A.length; i++) {
            newA[i] = A[i];
        }
        Arrays.sort(newA, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int v1 = digitCount(o1);
                int v2 = digitCount(o2);
//                System.out.println(Arrays.toString(newA));
//                System.out.println("o1 = "+o1+" v1 = "+v1+" o2 ="+o2+" v2 = "+v2);
                if (v1 < v2) {
                    return -1;
                } else if (v1 == v2 && o1 > o2) {
                    return -1;
                }
//                System.out.println(Arrays.toString(newA));
                return 1;
            }
        });
        for (int i = 0; i < A.length; i++) {
            A[i] = newA[i];
        }
        return A;
    }

    public static int digitCount(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
