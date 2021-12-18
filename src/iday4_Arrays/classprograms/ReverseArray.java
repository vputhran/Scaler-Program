package iday4_Arrays.classprograms;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] ar = {3, -2, 1, 4, 3, 6, 8};
        System.out.println(Arrays.toString(ar));

        System.out.println(Arrays.toString(revArray(ar)));
    }

    public static int[] revArray(int[] a) {
        int temp = 0;
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }

}
