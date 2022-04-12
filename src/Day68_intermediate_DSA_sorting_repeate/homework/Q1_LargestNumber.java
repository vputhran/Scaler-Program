package Day68_intermediate_DSA_sorting_repeate.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1_LargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));
        System.out.println(largestNumber(A));
    }
    public static String largestNumber(final List<Integer> A) {
        int[] sumArray = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            sumArray[i] = digitSum(A.get(i));
        }

        int[] digitCount = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            digitCount[i] = digitCount(A.get(i));
        }
        ArrayList<Integer> aNew = new ArrayList<>(A);
        for (int i = 0; i < A.size(); i++) {
            for (int j = i+1; j < A.size(); j++) {
                if ((digitCount(i) > digitCount(j)) && digitSum(j) != digitSum(i)) {

                    int temp = aNew.get(i);
                    aNew.set(i, aNew.get(j));
                    aNew.set(j, temp);
                } else if (digitSum(j) > digitSum(i)) {
                    int temp = aNew.get(i);
                    aNew.set(i, aNew.get(j));
                    aNew.set(j, temp);
                }
            }
        }
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < A.size(); i++) {
            st.append(aNew.get(i));
        }
        return st.toString();
    }

    public static int digitSum(int A) {
        int sum = 0;
        while (A > 0) {
            int R = A % 10;
            sum += R;
            A = A / 10;
        }
        return sum;
    }

    public static int digitCount(int A) {
        int count = 0;
        while (A > 0) {
            count++;
            A = A / 10;
        }
        return count;
    }
}
