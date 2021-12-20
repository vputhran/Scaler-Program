package day5.classproblems;

import java.util.Scanner;

public class Vovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alph = sc.next().charAt(0);

        if ((alph == 'a') || (alph == 'e') || (alph == 'i') || (alph == 'o') || (alph == 'u') ){
            System.out.println(1);
        }else {
            System.out.print(0);
        }
    }
}
