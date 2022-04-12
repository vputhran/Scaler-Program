package Day68_intermediate_DSA_sorting_repeate.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Q3_ArithmeticProgression {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 5, 1));
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int diff = A.get(A.size() - 1) - A.get(A.size() - 2); //Checking the difference of the last 2 values in the list
        for (int i = 0; i < A.size(); i++) {
            if ((i + 1 <= A.size() - 1) && (A.get(i + 1) - A.get(i) != diff)) {
                return 0;
            }
        }
        return 1;
    }
}
