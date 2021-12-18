/*Print the First & second minimum
* Link:  https://www.geeksforgeeks.org/to-find-smallest-and-second-smallest-element-in-an-array/ */
package day15.classproblems;
public class secondMin {

    public static void main(String[] args) {
        int[] ar1 = {-1, 3, 7, 7};
        secMin(ar1);
    }

    public static void secMin(int[] A) {
        int first_min  = Integer.MAX_VALUE;
        int sec_min  = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < first_min) {
                sec_min = first_min;
                first_min = A[i];
            } else if (A[i] < sec_min && A[i] != first_min) {
                sec_min = A[i];
            }
        }
        System.out.println(first_min);
        System.out.println(sec_min);
    }
}
