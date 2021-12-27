package day61_intermediate_sorting.assignements;

import java.util.*;

public class Q1_NobleInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-4, -2, 0, -1, -6));
        System.out.println(greaterNobelInteger_BruteForce(numbers));

    }

    public static int greaterNobelInteger_BruteForce(ArrayList<Integer> A) {
        A.sort(Collections.reverseOrder());
        System.out.println(A);

        int greater = 0;
        if(A.get(0) == 0){
            return 1;
        }
        for (int i = 1; i < A.size(); i++) {
            if (!Objects.equals(A.get(i), A.get(i - 1))) {
                greater = i;
            }
            if (greater == A.get(i)) {
                return 1;
            }
        }
        return -1;
    }
}
