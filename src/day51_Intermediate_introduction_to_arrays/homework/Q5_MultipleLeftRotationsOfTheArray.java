package day51_Intermediate_introduction_to_arrays.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Q5_MultipleLeftRotationsOfTheArray {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2, 3));

        System.out.println(solve(A, B));

    }
    public static  ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        for (int i = 0; i < B.size(); i++) {
            // Making a copy of ArrayList A
            ArrayList<Integer> copyA = new ArrayList<>(A);
            int b = B.get(i);
            // Passing the copyA
            mainList.add(rotateArray_ReverseLogic(copyA, b));
        }
        return mainList;
    }

    // Left Shift the ArrayList
    public static ArrayList<Integer> rotateArray_ReverseLogic(ArrayList<Integer> A, int b) {

        b = b % A.size();
        // Reverse the entire array
        swap(A, A.size() - 1,0 );

        //Reverse the Last K elements (Starting from the last element till the bth element from the end)
        swap(A, A.size()-1, A.size()-1-b+1);

        //Reverse the remaining elements before n+1 elements till first element
        swap(A, A.size()-1-b, 0);

        return A;
    }

    public static void swap(ArrayList<Integer> A, int s, int e) {
        while (s > e) {
            int temp = A.get(s);
            A.set(s, A.get(e));
            A.set(e, temp);
            s--;
            e++;
        }
    }
}
