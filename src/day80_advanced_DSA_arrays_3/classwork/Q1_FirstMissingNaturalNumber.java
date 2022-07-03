package day80_advanced_DSA_arrays_3.classwork;

/* Q1. Find the first missing natural number
*      arr[5] = {3,-2,1,2,7} = 4
*      arr[7] = {-9, 2, 6, 4, -8, 1, 3} = 5
*      arr[6] = {1, 2, 5, 6, 4, 3} = 7
*      arr[5] = {-4, 8, 3, -1, 0} = 1
*      arr[4] = {4, 2, 1, 3} = 5
*      Edge Cases
*      arr[4] = {-4, -2, -1, -3} = 1 --> All -ve values
*      arr[5] = {4, 1, 3, 3, 2} = 1  --> Duplicate values */


import java.util.HashSet;

public class Q1_FirstMissingNaturalNumber {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3 , 3, 2};
        System.out.println(missNaturalNum(arr));
//        System.out.println(missNaturalNum_BruteForce(arr));
//        System.out.println(missNaturalNum_UsingHashSet(arr));
    }
    // Brute Force approach -> T.C = O(N^2) and S.C = O(1)
    public static int missNaturalNum_BruteForce(int[] A) {
        int N = A.length;

        // First loop - Iterating from 1 to N (Natural numbers from 1 to N)
        for (int i = 1; i <= N; i++) {
            boolean eleFound = false;

            // Second loop - checking if i is present in array A
            for (int j = 0; j < N; j++) {
                if (i == A[j]) {
                    eleFound = true;
                    break;
                }
            }
            if (!eleFound) {
                return i;
            }
        }
        return N + 1;
    }

    // Approach using Hashset -> T.C = O(N) and S.C = O(N)
    public static int missNaturalNum_UsingHashSet(int[] A) {
        int N = A.length;
        HashSet<Integer> idx = new HashSet<>(N);

        //Adding all the array elements in the range of 1 to N into the Hashset
        for (int i = 0; i < N; i++) {
            if (A[i] > 0 && A[i] < N) {
                idx.add(A[i]);
            }
        }
        // Checking to see if any i value is NOT present in the Hashset
        for (int i = 1; i < N; i++) {
            if (!idx.contains(i)) {
                return i;
            }
        }
        return N + 1;
    }

    // Optimised approach -> T.C = O(N) and S.C = O(1)
    public static int missNaturalNum(int[] A) {
        int N = A.length; // Array size

        /* Iterate from 0 to N-1
        * Check if A[i] == i,
        * And if not, check if it's in the range of 0 to N-1
        * Swap the values between index i  and A[i]  */
        for (int i = 0; i < N; i++){
            if (A[i] != i && A[i] > 0 && A[i] < N) { // Checking if A[i] != i and if A[i] is in range 0 to N-1, if
                int temp = A[i];
                if (A[i] != A[temp]) { // Handling Edge case of Duplicate array elements
                    A[i] = A[temp];
                    A[temp] = temp;
                } else {
                    A[i] = A[i] * -1; // If duplicate element - making one of the duplicate elements -ve
                }
            }
            // Again checking if A[i] == i, if not decrementing i so that the above swap happens again
            if (A[i] != i && A[i] > 0 && A[i] < N) {
                i--;
            }
        }

        for (int i = 1; i < N; i++){
            if (A[i] != i){
                return i;
            }
        }
        if (A[0] < 0) {  // If the array contains duplicate, 0th index will have -ve value and if all other indices matches their value return N
            return N;
        }
        return N + 1;
    }

}
