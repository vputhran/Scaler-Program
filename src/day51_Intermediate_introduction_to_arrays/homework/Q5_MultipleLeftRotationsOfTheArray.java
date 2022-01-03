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
            int b = B.get(i);

            mainList.add(rotateArray_ReverseLogic(A, b));
        }
        return mainList;
    }


    public static ArrayList<Integer> rotateArray_ReverseLogic(ArrayList<Integer> A, int b) {

        b = b % A.size();
        // Reverse the entire array
        swap(A, A.size() - 1,0 );

        //Reverse the Last K elements
        swap(A, A.size()-1, A.size()-1-b+1);

        //Reverse the remaining elements before K+1 elements
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
