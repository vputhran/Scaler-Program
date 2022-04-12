package day71_intermediate_DSA_recursion_1.assignment;

import java.util.Scanner;

public class Q4_PrintReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(revString(A));
    }

    public static String revString(String A) {
        if (A.isEmpty()) return A;
        return revString(A.substring(1)) + A.charAt(0);
    }
}
