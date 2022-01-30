package day53_intermediate_arrays_carry_forward.classprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2_RightMaxArray {
    public static void main(String[] args) {
        int[] ar = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(rightMax(ar)));
        System.out.println(rightMaxList(ar));

    }

    // Using Array
    public static int[] rightMax(int[] A) {
        int[] riMax = new int[A.length];
        int lsIndex = A.length - 1;
        riMax[lsIndex] = A[lsIndex];
        for (int i = lsIndex - 1; i >= 0; i--) {
            riMax[i] = Math.max(riMax[i + 1], A[i]);
        }
        return riMax;
    }

    //Using ArrayList
    public static ArrayList<Integer> rightMaxList(int[] A) {
        ArrayList<Integer> rigMaxList = new ArrayList<>();
        // Setting all the values to 0 first
        for (int i = 0; i < A.length; i++) {
            rigMaxList.add(0);
        }

        int lsIndex = A.length - 1;
        // Last element of rightMaxList == Last element of A
        rigMaxList.set(lsIndex, A[lsIndex]);
        for (int i = lsIndex - 1; i >= 0; i--) {
            rigMaxList.set(i, Math.max(rigMaxList.get(i+1), A[i]));
        }
        return rigMaxList;
    }
}
