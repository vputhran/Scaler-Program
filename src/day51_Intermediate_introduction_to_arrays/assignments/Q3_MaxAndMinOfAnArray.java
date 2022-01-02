package day51_Intermediate_introduction_to_arrays.assignments;

/* Problem Description
Write a program to print maximum and minimum elements of the input array A of size N where you have to take integer N and further N elements as input from user.

Problem Constraints
1 <= N <= 1000
1 <= A <= 1000

Input Format
A single line representing N followed by N integers of the array A

Output Format
A single line containing two space separated integers representing maximum and minimum elements of the input array.

Example Input

Input 1:
5 1 2 3 4 5

Input 2:
4 10 50 40 80

Example Output

Output 1:
5 1

Output 2:
80 10
*/

import java.util.Scanner;

public class Q3_MaxAndMinOfAnArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] A = new int[l];

        for (int i = 0; i < l; i++) {
            A[i] = sc.nextInt();
        }

        maxMin(A);
    }

    public static void maxMin(int[] A) {
        int min = A[0];
        int max = A[0];

        for (int i = 1 ; i <A.length ; i++) {
            if (A[i] < min) {
                min = A[i];
            } else if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println(max + " " + min);
    }

}
