package day61_intermediate_sorting.assignements;

import java.util.ArrayList;
import java.util.Arrays;

public class Q3_SortByColor {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, 1, 2, 0, 1, 2));
        System.out.println(sortColors_AddingApproach(numbers));
    }

    // Brute force --> This will give TLE
    public static ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        int temp = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < A.size(); j++) {
                if (A.get(i) > A.get(j)) {
                    temp = A.get(i);
                    A.set(i, A.get(j));
                    A.set(j, temp);
                }
            }
        }
        return A;
    }

    /* TA Suggestion
    * 1) One approach is count no of 0's 1's and 2's now you can directly add that many no of 0,1,2's in the array.
        This takes two iterations one for counting the no of occurences of 0,1,2 and other for changing order. Time complexity is O(N).
        * https://www.geeksforgeeks.org/sort-array-0s-1s-2s-simple-counting/

        2) You can also do it in only one iteration using dutch flag algoithm ( You can read about it in the internet) Complexity is O(N).
           Complexity of both approaches is O(N) but in second approach we iterate the array only once.*/

    public static ArrayList<Integer> sortColors_AddingApproach(ArrayList<Integer> A) {
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;

        for (int i = 0; i < A.size(); i++) {
            if ((A.get(i) == 0)) {
                count_0++;
            } else if (A.get(i) == 1) {
                count_1++;
            } else {
                count_2++;
            }
        }

        return setArrayList_GeeksForGeeksApproach(A,count_0,count_1);
    }

    // My Approach to set the 0's , 1's and 2's in the ArrayList
    public static ArrayList<Integer> setArrayList_MyApproach(ArrayList<Integer> A, int count_0, int count_1, int count_2) {
        for (int i = 0; i < A.size(); i++) {
            if (count_0 > 0) {
                if ((A.get(i) != 0)) {
                    A.set(i, 0);
                }
                count_0--;
            } else if (count_1 > 0) {
                if (A.get(i) != 1) {
                    A.set(i, 1);
                }
                count_1--;

            } else if (count_2 > 0) {
                if (A.get(i) != 2) {
                    A.set(i, 2);
                }
                count_2--;

            }
        }
        return A;
    }

    // GeeksForGeeks approach to set the 0's , 1's and 2's in the ArrayList
    /* Link -  https://www.geeksforgeeks.org/sort-array-0s-1s-2s-simple-counting/ */
    public static ArrayList<Integer> setArrayList_GeeksForGeeksApproach(ArrayList<Integer> A, int count_0, int count_1) {
        for (int i = 0; i < count_0; i++)
            A.set(i, 0);

        // Putting the 1's in the
        // array after the 0's.
        for (int i = count_0; i < (count_0 + count_1); i++)
            A.set(i, 1);

        // Putting the 2's in the
        // array after the 1's
        for (int i = (count_0 + count_1); i < A.size(); i++)
            A.set(i, 2);

        return A;
    }
}