package bday8.homework;

import java.util.Scanner;

public class Q4_IsItPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int count = 0;
        for(int i = 1; i <= a; i++){
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 2){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
