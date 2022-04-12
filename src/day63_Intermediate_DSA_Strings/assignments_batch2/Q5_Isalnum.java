package day63_Intermediate_DSA_Strings.assignments_batch2;

import java.util.ArrayList;
import java.util.Arrays;

public class Q5_Isalnum {
    public static void main(String[] args) {
        ArrayList<Character> A = new ArrayList<>(Arrays.asList('S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'));
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Character> A) {
        for (int i = 0; i < A.size(); i++) {
            if (!((A.get(i) >= 'A' && A.get(i) <= 'Z') || (A.get(i) >= 'a' && A.get(i) <= 'z') || (A.get(i) >= '0' && A.get(i) <= '9'))) {
                return 0;
            }
        }
        return 1;
    }
}
