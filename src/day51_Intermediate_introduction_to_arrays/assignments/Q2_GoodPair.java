package day51_Intermediate_introduction_to_arrays.assignments;

/* Q. Problem Description
Given an array A and a integer B. A pair(i,j) in the array is a good pair if i!=j and (A[i]+A[j]==B). Check if any good pair exist or not.

Problem Constraints
1 <= A.size() <= 104
1 <= A[i] <= 109
1 <= B <= 109

Input Format
First argument is an integer array A.
Second argument is an integer B.

Output Format
Return 1 if good pair exist otherwise return 0.

Example Input

Input 1:
A = [1,2,3,4]
B = 7

Input 2:
A = [1,2,4]
B = 4

Input 3:
A = [1,2,2]
B = 4

Example Output

Output 1:
1

Output 2:
0

Output 3:
1

Example Explanation

Explanation 1:
 (i,j) = (3,4)

Explanation 2:
No pair has sum equal to 4.

Explanation 3:
 (i,j) = (2,3)

 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q2_GoodPair {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(633299, 189622, 811214, 549111, 864962, 673215, 526221, 271580, 78335, 890164));
        System.out.println(numbers);
        System.out.println(solve(numbers, 968499));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int start = 0;
        int end = A.size() - 1;

        Collections.sort(A);
        System.out.println(A);
        while (start < end) {
            long elementSum = A.get(start) + A.get(end);

            if (elementSum == B) {
                return 1;
            } else if (elementSum < B) {
                start++;
            } else {
                end--;
            }
        }
        return 0;
    }

}
