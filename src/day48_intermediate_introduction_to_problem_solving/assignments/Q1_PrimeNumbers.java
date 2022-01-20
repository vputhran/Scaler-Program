package day48_intermediate_introduction_to_problem_solving.assignments;

import java.util.Scanner;

public class Q1_PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n != 0) {
            System.out.println(primeNumber2(n));
        } else {
            System.out.println("Invalid Input - 0");
        }
    }

    public static boolean primeNumbers(long n) {
        int count = 0;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    count++;
                }else {
                    count = count + 2;
                }
            }
        }
        return count == 2;
    }


    public static String primeNumber2(int n){
        int count = 0;
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                if(i == n/i){
                    count++;
                }else{
                    count = count + 2;
                }
            }
        }
        if(count == 2){
            return "YES";
        }else{
            return "NO";
        }
    }
}
