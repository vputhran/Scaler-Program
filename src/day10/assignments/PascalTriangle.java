package day10.assignments;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        System.out.println(Arrays.toString(solve(A)));
    }

    public static int[][] solve(int A) {
        int[][] c = new int[A - 1][A - 1];
        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= A; j++) {
                if (i <= j) {
                    c[i][j]= i/((i-j)*i);
                }else {
                    c[i][j] = 0;
                }
            }
        }
        return c;
    }
}
