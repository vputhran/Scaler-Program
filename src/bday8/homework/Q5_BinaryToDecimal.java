package bday8.homework;

import java.util.Scanner;

public class Q5_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryNumber = sc.nextLine();

        int strLength = binaryNumber.length();

//        int pw = 0;
        int decNum = 0;
        for (int i = 0; i <= strLength-1; i++) {
            char n = binaryNumber.charAt((strLength-1)-i);
            if (n == '1') {
                decNum = decNum + (int) Math.pow(2,i);
            }
//            strLength--;
        }
        System.out.println(decNum);
    }
}
