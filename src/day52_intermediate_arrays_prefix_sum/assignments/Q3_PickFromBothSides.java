package day52_intermediate_arrays_prefix_sum.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Q3_PickFromBothSides {
    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(-969, -948, 350, 150, -59, 724, 966, 430, 107, -809, -993, 337, 457, -713, 753, -617, -55, -91, -791, 758, -779, -412, -578, -54, 506, 30, -587, 168, -100, -409, -238, 655, 410, -641, 624, -463, 548, -517, 595, -959, 602, -650, -709, -164, 374, 20, -404, -979, 348, 199, 668, -516, -719, -266, -947, 999, -582, 938, -100, 788, -873, -533, 728, -107, -352, -517, 807, -579, -690, -383, -187, 514, -691, 616, -65, 451, -400, 249, -481, 556, -202, -697, -776, 8, 844, -391, -11, -298, 195, -515, 93, -657, -477, 587));
        System.out.println(solve(ar,81));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int sum = Integer.MIN_VALUE; // Since u will be comparing to get the max - don't set it to 0, set it to MIN_Value

        //Creating the Prefix Sum arraylist
        ArrayList<Integer> prefixArr = new ArrayList<>();
        prefixArr.add(A.get(0));
        for (int i = 1; i < A.size(); i++) {
            prefixArr.add(prefixArr.get(i - 1) + A.get(i));
        }

        // Creating the suffix sum arraylist and set all the values to 0 first
        ArrayList<Integer> suffixArr = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            suffixArr.add(0);
        }
        // Setting the suffix values
        suffixArr.set(A.size() - 1, A.get(A.size() - 1));
        for (int j = A.size() - 2; j >= 0; j--) {
            suffixArr.set(j, suffixArr.get(j + 1) + A.get(j));
        }
        int ans;

        for (int i = 0; i <= B; i++) {
            if (i == 0) { //Get the sum of first 3 elements of the array -> 3rd element of the prefix array
                ans = prefixArr.get(B - 1);
                sum = Math.max(sum, ans);
            } else if (i == B) { // Get the sum of the last 3 elements of the array --> 3rd element of the suffix array from the end
                ans = suffixArr.get(suffixArr.size() - 1 - B + 1);
                sum = Math.max(sum, ans);
            } else {
                ans = prefixArr.get(B - i - 1) + suffixArr.get(suffixArr.size() - i);
                sum = Math.max(sum, ans);
            }
        }
        return sum;
    }
}
