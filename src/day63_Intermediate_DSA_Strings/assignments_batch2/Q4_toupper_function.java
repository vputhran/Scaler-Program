package day63_Intermediate_DSA_Strings.assignments_batch2;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4_toupper_function {
    public static void main(String[] args) {
        ArrayList<Character> A = new ArrayList<>(Arrays.asList('S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'));
        System.out.println(to_upper(A));
    }
    public static ArrayList<Character> to_upper(ArrayList<Character> A) {
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) >= 'a' && A.get(i) <= 'z') {
//                A.set(i, (char) (A.get(i) + 'a' - 'A'));
                A.set(i, Character.toUpperCase(A.get(i)));
            }
        }
        return A;
    }
}
