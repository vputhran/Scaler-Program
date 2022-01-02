package day51_Intermediate_introduction_to_arrays.homework;

/* Q3. MINIMUM PICKS
* Problem Description
You are given an array of integers A of size N.
Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.



Problem Constraints

2 <= N <= 1e5
-1e9 <= A[i] <= 1e9
There is atleast 1 odd and 1 even number in A



Input Format
The first argument given is the integer array, A.



Output Format
Return maximum among all even numbers of A - minimum among all odd numbers in A.


Example Input

Input 1:

 A = [0, 2, 9]
Input 2:

 A = [5, 17, 100, 1]


Example Output

Output 1:

-7
Output 2:

99


Example Explanation

Explanation 1:

Maximum of all even numbers = 2
Minimum of all odd numbers = 9
ans = 2 - 9 = -7
Explanation 2:

Maximum of all even numbers = 100
Minimum of all odd numbers = 1
ans = 100 - 1 = 99
* */

import java.util.ArrayList;
import java.util.Arrays;

public class Q3_MINIMUM_PICKS {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-92, 22, 2, 11, 39, 36, 36, 51, 71, 42));
        System.out.println(solve(numbers));
    }
    public static int solve(ArrayList<Integer> A) {
        int evenMax = Integer.MIN_VALUE;
        int oddMin = Integer.MAX_VALUE;

        for (Integer integer : A) {
            if (integer == 0) {
                // Ignore it, 0 is neither even nor odd
            } else if ((integer % 2 == 0) && (integer > evenMax)) {
                evenMax = integer;
            } else if ((integer % 2 != 0) && (integer < oddMin)) {
                oddMin = integer;
            }
        }
        return evenMax - oddMin;
    }
}
