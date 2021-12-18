package bday8.homework;

import java.util.Scanner;

public class Q2_CheckCaseOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch >= 65 && ch <= 91) {
            System.out.println("UPPERCASE");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("lowercase");
        }
    }
}
