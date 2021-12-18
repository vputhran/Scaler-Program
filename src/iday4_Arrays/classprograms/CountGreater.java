package iday4_Arrays.classprograms;

import java.util.Arrays;

/*Q. Given an array of size N. Count the number of elements which have at least one element greater that itself.*/
public class CountGreater {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 8, 0, 8, 1, 3, 8, 9};

//        System.out.println(bruteForce(arr));
//        System.out.println(maxElement(arr));
//        System.out.println(maxElementSingleLoop(arr));

        System.out.println(Arrays.toString(arraySort(arr)));

    }

    public static int bruteForce(int[] a) {
        int count = 0;
//        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    // Find the count of the max element and subs with array length
    public static int maxElement(int[] ar1) {
        int maxEle = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] > maxEle) {
                maxEle = ar1[i];
            }
        }

        for (int i = 0; i < ar1.length ; i++) {
            if (ar1[i] == maxEle) {
                count++;
            }
        }
        return (ar1.length - count);
    }

    public static int maxElementSingleLoop(int[] ar2) {
        int maxEle = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < ar2.length; i++) {
            if (ar2[i] > maxEle) {
                maxEle = ar2[i];
            }
        }
        return (ar2.length - count);
    }

    public static int[] arraySort(int[] ar3) {
        for (int i = 0; i < ar3.length-1; i++) {
            int num = 0;
            if (ar3[i] > ar3[i + 1]) {
                num = ar3[i + 1];
                ar3[i + 1] = ar3[i];
                ar3[i] = num;
            }
        }
        return ar3;
    }

}
