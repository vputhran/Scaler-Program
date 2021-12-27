package day61_intermediate_sorting.assignements;

/* Link - https://www.scaler.com/academy/mentee-dashboard/class/14728/assignment/problems/372/?navref=cl_pb_nv_tb */

/* Q1. Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p.
* Example Input 1:  A = [3, 2, 1, 3]

Input 2:  A = [1, 1, 3, 3]
 Example Output

Output 1:  1
Output 2:  -1

Example Explanation

Explanation 1:  For integer 2, there are 2 greater elements in the array. So, return 1.
Explanation 2:  There is no such integer exists.*/

import java.util.*;

public class Q1_NobleInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-4, -2, 0, -1, -6));
        System.out.println(greaterNobelInteger_BruteForce(numbers));

    }

    public static int greaterNobelInteger_BruteForce(ArrayList<Integer> A) {
        A.sort(Collections.reverseOrder());
        System.out.println(A);

        int greater = 0;
        if(A.get(0) == 0){
            return 1;
        }
        for (int i = 1; i < A.size(); i++) {
            if (!Objects.equals(A.get(i), A.get(i - 1))) {
                greater = i;
            }
            if (greater == A.get(i)) {
                return 1;
            }
        }
        return -1;
    }
}
