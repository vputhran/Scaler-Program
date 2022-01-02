package day51_Intermediate_introduction_to_arrays.assignments;

/* Q. You are given an integer array A and an integer B. You have to print the same array after rotating it B times towards right.
*     NOTE: You can use extra memory.
*
*  Problem Constraints
1 <= |A| <= 106
1 <= A[i] <= 109
1 <= B <= 109

Input Format
First line begins with an integer |A| denoting the length of array, and then |A| integers denote the array elements.
Second line contains a single integer B

Output Format
Print an array of integers which is the Bth right rotation of input array A, on a separate line.

Example
* Input 1:
 4 1 2 3 4
 2
Input 2:
 3 1 2 2
 3

Example
 Output 1:
 3 4 1 2
Output 2:
 1 2 2


Example Explanation
Explanation 1:
 [1,2,3,4] => [4,1,2,3] => [3,4,1,2]
Explanation 2:
 [1,2,2] => [2,1,2] => [2,2,1] => [1,2,2] */

import java.util.Scanner;

public class Q1_RotationGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] A = new int[l];

        for (int i = 0; i < l; i++) {
            A[i] = sc.nextInt();
        }

        int K = sc.nextInt();

        rotateArray_ReverseLogic(A, K);

        for (int j : A) {
            System.out.print(j + " ");
        }
    }

    /* Using reverse logic
     *  Step 1:  First reverse the entire array
     *  Step 2: Then reverse the first 'K' elements ( 0 to K-1 )
     *  Step 3: Again reverse the remaining 'N-K' elements ( K to N-1) where N is the length of the array */

    /* Since K is greater than the length of the array we need to subtract K from the array length ( K = K - N) to get the right no. of rotation required.
     *  OR use modulo to get the remainder */

    public static int[] rotateArray_ReverseLogic(int[] A, int K) {

        K = K % A.length;
        // Reverse the entire array
        swap(A, 0, A.length - 1);

        //Reverse the first K elements
        swap(A, 0, K - 1);

        //Reverse the remaining elements after K-1 elements
        swap(A, K, A.length - 1);

        return A;
    }

    public static void swap(int[] A, int s, int e) {
        while (s < e) {
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }
    }
}
