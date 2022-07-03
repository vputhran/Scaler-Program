package day80_advanced_DSA_arrays_3.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_SumOfAllSubMatrices {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1, 1)));
        A.add(new ArrayList<>(Arrays.asList(1, 1)));

        System.out.println(solve(A));
    }
        // Calculating the sum using Contribution Technique
    public static int solve(ArrayList<ArrayList<Integer>> A) {

        int N = A.size();
        int M = A.get(0).size();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int contOfElement = ((i + 1) * (j + 1)) * ((N - i) * (M - j));
                sum += A.get(i).get(j) * contOfElement;
            }
        }
        return sum;
    }

}
