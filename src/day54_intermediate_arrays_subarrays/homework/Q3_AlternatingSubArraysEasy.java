package day54_intermediate_arrays_subarrays.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Q3_AlternatingSubArraysEasy {
    public static void main(String[] args) {
        int[] A = {0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1};
        int B = 1;
        System.out.println(Arrays.toString(solve(A, B)));
        System.out.println(Arrays.toString(solve_scalerSolution(A, B)));
    }

    public static int[] solve(int[] A, int B) {

        int subLen = 2 * B + 1; // Length of the sub array
        ArrayList<Integer> idxList = new ArrayList<>(); // ArrayList to store the middle index

        for (int i = 0; i < A.length; i++) {

            int currVal = -1;  // setting currVal as -1 for all values of i except for i = 0
            if (i == 0) {
                currVal = A[i];  // setting currVal as A[i] for i == 0
            }

            int count = 0; // counter
            int endIdx = subLen + i; // i and endIdx is the window that needs to be shifted for each iteration

            for (int j = i; j < endIdx; j++) {
                if (i == 0 && j == 0) {  // For the first value of the array, since we are setting it as the currVal
                    count++;
                } else if (subLen + i > A.length) { //If the subArray length is greater than array length (indexOutOFBounds exception)
                    break;
                } else if (A[j] != currVal) {
                    currVal = A[j];
                    count++;
                } else { // Break when the adjacent values are same
                    break;
                }
            }

            if (count == subLen) {
                idxList.add(i + subLen / 2);
            }
        }
        int[] idxArr = new int[idxList.size()];
        for (int i = 0; i < idxArr.length; i++) {
            idxArr[i] = idxList.get(i);
        }
        return idxArr;
    }

    public static int[] solve_scalerSolution(int[] A, int B) {
        ArrayList < Integer > l1 = new ArrayList < > ();
        int n = A.length;
        int len = 2 * B + 1;
        for (int i = 0; i < n - len + 1; i++) {
            int curr = -1;
            int flag = 1;
            for (int j = i; j < i + len; j++) {
                if (A[j] == curr) {
                    flag = 0;
                    break;
                }
                curr = A[j];
            }
            if (flag == 1) {
                l1.add(i + B);
            }
        }
        int[] ret = new int[l1.size()];
        for (int i = 0; i < l1.size(); i++) {
            ret[i] = l1.get(i);
        }
        return ret;
    }
}
