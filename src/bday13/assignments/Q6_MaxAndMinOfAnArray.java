package bday13.assignments;

import java.util.Scanner;

public class Q6_MaxAndMinOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        arrayMaxMin(ar);
    }

    public static void arrayMaxMin(int[] ar) {

        /*Setting the Integer.MIN_VALUE to maxVal and Integer.MAX_VALUE to minVal*/
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < ar.length; i++) {
            /*If the ar value is less tha minVal(Integer.MAX_VALUE) set it as minVal*/
            if (ar[i] < minVal) {
                minVal = ar[i];
                /*If the ar value is greater than maxVal(Integer.MIN_VALUE) set it as maxVal*/
            }else if (ar[i]>maxVal){
                maxVal = ar[i];
            }
        }
        System.out.println(maxVal+" "+minVal);
    }
}
