package day5.homework;

public class PatternPrinting1_Q4 {
    public static void main(String[] args) {

    }
    public static int[][] solve(int A) {
        int[][] matrix = new int[A][A];
        int prt = 1;
        for (int i = 0; i < A; i++) {

            for (int j = i; j < A; j++) {
                matrix[j][i] = prt;
            }
            prt++;
        }
        return matrix;
    }
}
