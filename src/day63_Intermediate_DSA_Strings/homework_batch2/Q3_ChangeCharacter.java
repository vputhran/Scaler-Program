package day63_Intermediate_DSA_Strings.homework_batch2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Q3_ChangeCharacter {
    public static void main(String[] args) {
        String A = "abcabbccd";
        int B = 3;
        System.out.println(solve(A, B));
    }

    public static int solve(String A, int B) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            if (hm.containsKey(A.charAt(i))) {
                hm.put(A.charAt(i), hm.get(A.charAt(i)) + 1);
            }else hm.put(A.charAt(i), 1);
        }
        ArrayList<Integer> value = new ArrayList<>(hm.values());
        Collections.sort(value);
        while (B >= value.get(0)) {
            B -= value.get(0);
            value.remove(0);
        }
        return value.size();
    }
}
