package bday8.assignments;

import java.util.Scanner;

public class Q8_CountTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        for(int i=1; i <= T; i++){
            int count = 0;
            long N = sc.nextInt();

            if(N < 10){
                System.out.println(1);
            }else{
                while(N != 0){
                    N = N/10;
                    count ++;
                }
                System.out.println(count);
            }
        }
    }
}
