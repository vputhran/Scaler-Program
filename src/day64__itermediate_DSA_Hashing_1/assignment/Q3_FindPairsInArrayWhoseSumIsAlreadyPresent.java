package day64__itermediate_DSA_Hashing_1.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q3_FindPairsInArrayWhoseSumIsAlreadyPresent {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 4, 2, 6, 7));
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        HashSet<Integer> ar = new HashSet<>(A);
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (ar.contains(A.get(i) + A.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }
}
