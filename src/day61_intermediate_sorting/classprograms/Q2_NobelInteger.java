package day61_intermediate_sorting.classprograms;

import java.util.Arrays;

/*Q2. Given N elements, calculate the number of Noble integers present.
*       arr[i] is said to be noble if,
*       {No. of elements < arr[i] } == ar[i] */
public class Q2_NobelInteger {
    public static void main(String[] args) {
        int[] ar = {-10, -5, 1, 3, 4, 5, 10};
        System.out.println(nobleInteger(ar));
        System.out.println(nobleInteger_BruteForce(ar));
    }

    public static int nobleInteger_BruteForce(int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            int elementCount = 0;
            for (int j = 0; j < ar.length; j++) {
                if (ar[j] < ar[i]) {
                    elementCount++;
                }
            }
            if (elementCount == ar[i]) {
                count++;
            }
        }
        return count;
    }
    public static int nobleInteger(int[] ar) {
        int count = 0;
        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == i) {
                count++;
            }
        }
        return count;
    }

}
