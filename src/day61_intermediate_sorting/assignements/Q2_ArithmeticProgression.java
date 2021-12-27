package day61_intermediate_sorting.assignements;

/* Given an integer array A of size N. Return 1 if the array can be rearranged to form an arithmetic progression, otherwise, return 0.
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
Example Input:
Input 1:  A = [3, 5, 1]
Input 2:  A = [2, 4, 1]

Example
Output 1:  1
Output 2:  0

Example Explanation

Explanation 1: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
Explanation 2: There is no way to reorder the elements to obtain an arithmetic progression. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q2_ArithmeticProgression {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(7,3,2));
        System.out.println(solve(numbers));
    }

    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        System.out.println(A);
        if (A.size() < 2) {
            return 1;
        }else {
            int size = A.get(1) - A.get(0);
            for (int i = 2; i <A.size() ; i++) {

                if ((A.get(i) - A.get(i - 1)) != size) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
