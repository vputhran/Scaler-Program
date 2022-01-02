package day51_Intermediate_introduction_to_arrays.assignments;

import java.util.Scanner;

public class Q5_SearchElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberTest = sc.nextInt();


        int B = sc.nextInt();

        while (numberTest > 0) {
            int length = sc.nextInt();
            int[] ar = new int[length];
            for (int i = 0; i < length; i++) {
                ar[i] = sc.nextInt();
            }
            System.out.println(search( ar,  B));
            numberTest--;
        }

    }

    public static int search(int[] A, int B) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B) {
                return 1;
            }
        }
        return 0;
    }
}
