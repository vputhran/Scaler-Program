package day51_Intermediate_introduction_to_arrays.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* Q. Problem Description
Little Ponny is given an array, A, of N integers. In a particular operation, he can set any element of the array equal to -1.
He wants your help for finding out the minimum number of operations required such that the maximum element of the resulting array is B. If it is not possible then return -1.

Problem Constraints
1 <= |A| <= 105
1 <= A[i] <= 109

Input Format
The first argument of input contains an integer array, A.
The second argument of input contains an integer, B.

Output Format
Return an integer representing the answer.

Example Input

Input 1:

 A = [2, 4, 3, 1, 5]
 B = 3
Input 2:

 A = [1, 4, 2]
 B = 3


Example Output

Output 1:

 2
Output 2:

 -1


Example Explanation

Explanation 1:

 We need to remove 4 and 5 to make 3 the biggest element.
Explanation 2:

 As 3 doesn't exist in the array, the answer is -1. */

public class Q1_LittlePonnyAndMaximumElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(24, 33, 13, 11, 30, 28, 19, 8, 30, 25, 42, 6, 30, 49, 3, 49, 24, 13, 3, 50));
        int B = 13;
        System.out.println(solve2(numbers,B));
    }

    // My Approach
    public static int solve(ArrayList<Integer> A, int B) {

        //Sorting the collection
        Collections.sort(A);


        for (int i = 0; i < A.size() ; i++) {
            if (A.get(i) == B) {                    // Check  if B exists in the arraylist
                if (A.get(i + 1) == B) {            // Check if next element is also B
                    return (A.size() - (i+2));
                }
                return (A.size() - (i + 1));         // i+1 because index starts from 0
            }
        }
        return -1;
    }

    // Scaler Approach
    public static int solve2(ArrayList<Integer> A, int B) {
        int count = 0;
        int flag = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == B) {
                flag = 1;
            }
            if (A.get(i) > B) {
                count++;
            }
        }
        if (flag == 1) {
            return count;
        }
        return -1;

    }
}
