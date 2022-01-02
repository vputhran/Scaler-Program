package day51_Intermediate_introduction_to_arrays.homework;
/* Q2. Second Largest
*    Problem Description
You are given an integer T (Number of test cases). For each test case, You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.

* Problem Constraints
1 <= T <= 10
1 <= |A| <= 105
0 <= A[i] <= 109

Input Format
First line consists of a single integer T.
Each test case, on a separate line,first integer is an integer |A| denoting the length of array, and then |A| integers denote the array elements.

Output Format
For each test case, If such an element exists, print its value, else print -1, on a separate line.

Example Input

Input 1:

 1
 3 2 1 2
Input 2:

 1
 1 2


Example Output

Output 1:

 2
Output 2:

 -1


Example Explanation

Explanation 1:

 First largest element = 2
 Second largest element = 2
 Third largest element = 1
Explanation 2:

 There is no second largest element in the array.*/

import java.util.Scanner;

public class Q2_SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int l = sc.nextInt();
            int[] ar = new int[l];
            for (int i = 0; i < l; i++) {
                ar[i] = sc.nextInt();
            }
            System.out.println(secLargest(ar));
            T--;
        }
    }

    public static int secLargest(int[] A) {
        int largest= Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        if (A.length == 1) {
            return -1;
        }else {
            for (int j : A) {
                if (j > largest) {
                    secLargest = largest;
                    largest = j;
                } else if (j > secLargest) {
                    secLargest = j;
                }
            }

        }
        return secLargest;
    }
}
