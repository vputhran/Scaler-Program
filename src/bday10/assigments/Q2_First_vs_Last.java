package bday10.assigments;

import java.util.Scanner;

public class Q2_First_vs_Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int dig = digCount(N);
            // Single digit number
            if (dig == 1) {
                System.out.println(N + " " + N);
            // multi digit number
            }else {
                int lastDig = N % 10;
                int firstDig = N;
                while (dig != 1) {
                    firstDig = firstDig / 10;
                    dig--;
                }
                System.out.println(firstDig+" "+lastDig);
            }
        }
    }
    //count the digits
    public static int digCount(int N) {
        int count = 0;
        while (N != 0) {
            N = N / 10;
            count++;
        }
        return count;
    }
}




