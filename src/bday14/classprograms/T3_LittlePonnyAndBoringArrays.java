package bday14.classprograms;

import java.util.Arrays;
import java.util.Scanner;

public class T3_LittlePonnyAndBoringArrays {
    public static void main(String[] args) {
        int[] A = {7,20,90,63,51,96,23,51,56};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int score = 0;
        Arrays.sort(A);
        int i = 0;
        int j = A.length-1;
        while (i < j) {
            score = score + absDiff(A[i], A[j]);
            i++;
            j--;

        }
        return score;
    }

    public static int absDiff(int a, int b){
        int diff = 0;
        if(a>=b){
            diff = a - b;
        }else{
            diff = b - a;
        }
        return diff;
        /*This can also be done using the Math.abs function */
        // return Math.abs((a-b));
    }
}
