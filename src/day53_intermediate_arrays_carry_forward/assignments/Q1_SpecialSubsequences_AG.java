package day53_intermediate_arrays_carry_forward.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_SpecialSubsequences_AG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        System.out.println(str);

//        char[] ch = new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            ch[i] = str.charAt(i);

        System.out.println(specialSeq2(str));
        }
    /* Brute force approach -  with TLE Error in Scaler*/
    public static int specialSeq(String A) {
        int AG_Count = 0;
        for (int i = 0; i < A.length(); i++) {
            int G_Count = 0;
            if (A.charAt(i) == 'A') {
                for (int j = i; j < A.length(); j++) {
                    if (A.charAt(j) == 'G') {
                        G_Count++;
                    }
                }
                AG_Count = AG_Count + G_Count;
            }
        }
        return AG_Count;
    }

    /* Using prefix array to maintain count of A's for each G -
       Explained in the class*/
    public static int specialSeq2(String A) {
        int AG_Count = 0;
        int A_count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'A') {
                A_count++;
            } else if (A.charAt(i) == 'G') {
                AG_Count = AG_Count + A_count;
            }
        }
        return AG_Count;
    }
}
