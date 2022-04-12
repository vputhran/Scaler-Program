package day61_intermediate_sorting.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1_LargestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));
//        largestNumber(numbers);
        System.out.println(largestNumber(numbers));

    }

    public static String largestNumber(final List<Integer> A) {
        ArrayList<Integer> aNew = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            aNew.add(A.get(i));
        }
        for (int i = 0; i < A.size(); i++) {
            for (int j = i+1; j < A.size(); j++) {
                if (myCompare(aNew.get(i), aNew.get(j))) {
                } else {
                    int temp = aNew.get(i);
                    aNew.set(i, aNew.get(j));
                    aNew.set(j, temp);
                }
            }
        }
        String st = "";
        for (int i = 0; i < A.size(); i++) {
            st += aNew.get(i);
        }
        return st;
    }

    public static boolean myCompare(int a, int b) {
        int aDigit = dCount(a);
        int bDigit = dCount(b);
        if (aDigit == 1 & bDigit == 1 & a > b) {
            return true;
        } else if (aDigit == 1 & bDigit == 1 & a < b) {
            return false;
        } else if (aDigit == 1 & bDigit != 1) {
            return true;
        } else if (aDigit != 1 & bDigit == 1) {
            return false;
        } else {
            int ab = a * (int) Math.pow(10, (double) aDigit) + b;
            int ba = b * (int) Math.pow(10, (double) bDigit) + a;
            if (ab > ba) {
                return true;
            }
        }
        return false;
    }

    public static int dCount(int a) {
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        return count;
    }


}
