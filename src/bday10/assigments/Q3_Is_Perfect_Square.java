package bday10.assigments;

import java.util.Scanner;

public class Q3_Is_Perfect_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(perSquare(sc.nextInt()));
        System.out.println(perSquare2(sc.nextInt()));
    }

    public static int perSquare(int A) {
        if (Math.sqrt(A) - (int) Math.sqrt(A) == 0) {
            return 1;
        } else {
            return 0;
        }
    }
    /*Square root of a number N lies between 1 to N/2*/
    public static int perSquare2(int A) {
        for (int i = 1; i <= A/2; i++) {
            if (i * i == A) {
                return 1;
            }
        }
        return 0;
    }
}
