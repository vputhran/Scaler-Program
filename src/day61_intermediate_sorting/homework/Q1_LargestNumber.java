package day61_intermediate_sorting.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1_LargestNumber {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));
//        largestNumber(numbers);

        System.out.println(lastDigit(340));
    }

    public static void largestNumber(final List<Integer> A) {
        for (int i = 0; i < A.size(); i++) {

        }

    }

    public static int digitCount(int A) {
        int count = 0;
        while (A > 0) {
            A = A / 10;
            count++;
        }
        return count;
    }

    public static int lastDigit(int A) {
        int count = digitCount(A)-1;
        while (count > 0) {

            A = A / 10;
            count--;

        }
        return A;
    }


}
