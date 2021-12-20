package day59_intermediate_arrays_and_maths.classprograms;

import java.util.Arrays;

public class Q5_Find_nthMagicNumber {
    public static void main(String[] args) {
        System.out.println(magicalNumber(11));
        System.out.println(magicalNumber_VideoExplanation(11));
    }

    public static double magicalNumber(int A) {
        int magNum = 0;
        double i = 1;
        while (A > 0) {
            if (A % 2 == 1) {
                magNum = magNum + (int) (Math.pow(5,i));
            }
            A = A / 2;
            i++;
        }
        return magNum;
    }

    public static double magicalNumber_VideoExplanation(int A) {
        int magNum = 0;
        int x = 1;
        while (A > 0) {
            x = x * 5;
            if (A % 2 == 1) {
                magNum = magNum + x;
            }
            A = A / 2;
        }
        return magNum;
    }
/* Decimal to Binary conversion */
    // https://www.geeksforgeeks.org/java-program-to-convert-integer-values-into-binary/
    public static void decimalToBinary(int n) {
        int[] bin = new int[35];
        int i = 0;
        while (n > 0) {
            bin[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = bin.length-1; j >=0 ; j--) {
            System.out.print(bin[j]+" ");
        }
    }

}
