package day69_intermediate_DSA_hashing_1.homework;

import java.util.*;

public class Q2_CheckPalindrome_II {
    public static void main(String[] args) {
//        String A = "abbaeesa";
//        String A = "dwvgsdyhxflyeqavnmintt"; // Expected 0
//        String A = "uucgncntt"; // Expected 1
        String A = "yzfbzbyyrurquqf"; // Expected 1
        System.out.println(solve(A));
    }


    // Reference - https://www.geeksforgeeks.org/rearrange-characters-form-palindrome-possible/
    public static int solve(String A) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < A.length(); i++) {
            hm.put(A.charAt(i), hm.getOrDefault(A.charAt(i), 0) + 1);
        }



        int oddCount = 0;
        for (Map.Entry<Character,
                Integer> itr : hm.entrySet()) {
            if (itr.getValue() % 2 != 0)
            {
                oddCount++;
            }
        }
        if (oddCount > 1 || oddCount == 1 &&
                A.length() % 2 == 0)
        {
            return 0;
        }

        return 1;
    }
}
