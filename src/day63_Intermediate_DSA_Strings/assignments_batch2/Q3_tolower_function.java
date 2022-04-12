package day63_Intermediate_DSA_Strings.assignments_batch2;

import java.util.ArrayList;
import java.util.Arrays;

public class Q3_tolower_function {
    public static void main(String[] args) {
        ArrayList<Character> A = new ArrayList<>(Arrays.asList('S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'));
        System.out.println(to_lower(A));
    }
    public static ArrayList<Character> to_lower(ArrayList<Character> A) {
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) >= 'A' && A.get(i) <= 'Z') {
//                A.set(i, (char) (A.get(i) + 'a' - 'A'));
                A.set(i, Character.toLowerCase(A.get(i)));
            }
        }
        return A;
    }
}
