package Day68_intermediate_DSA_sorting_repeate.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_SortByColor {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1, 2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2));
        System.out.println(sortColors(A));
    }
    public static ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        int lPoint = 0;
        int cPoint = 0;
        int rPoint = A.size() - 1;

        while (cPoint <= rPoint) {
            if (A.get(lPoint) == 0) {
                lPoint++;
                cPoint = lPoint;
            } else if (A.get(rPoint) == 2) {
                rPoint--;
            } else if (A.get(cPoint) == 1) {
                cPoint++;
            } else if (A.get(cPoint) == 0) {
                swap(A, cPoint, lPoint);
                cPoint++;
                lPoint++;
            } else if (A.get(cPoint) == 2) {
                swap(A, cPoint, rPoint);
//                cPoint++;
                rPoint--;
            }
        }

        return A;
    }

    public static ArrayList<Integer> swap(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
        return A;
    }
}
