package Day68_intermediate_DSA_sorting_repeate.homework;

import java.util.*;

public class Q2_ElementsRemoval {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 1));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        // Ref:  https://www.javacodegeeks.com/2021/03/sorting-arraylist-in-reverse-or-descending-order-in-java-8.html
        Collections.sort(A);
        Collections.reverse(A); // Reversing the list
        int sum = 0;

        for (int i = 0; i < A.size(); i++) {
            sum += A.get(i) * (i + 1);
        }
        return sum;

    }
}
