package day61_intermediate_sorting.homework;

import java.util.*;

public class Q1_LargestNumber_UsingComparator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        System.out.println(largestNumber(numbers));
    }

    public static String largestNumber(final List<Integer> A) {

        //Converting from Integer List to String list
        ArrayList<String> newA = new ArrayList<>(A.size());
        for (Integer integer : A) {
            newA.add(String.valueOf(integer));
        }

        /* Using the Comparator Interface to Sort and Compare elements of the String list */
        Collections.sort(newA, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String str1 = o1 + o2;
                String str2 = o2 + o1;
                return str2.compareTo(str1); // Checking if str2 is greater than str1 using compareTo()
                /* https://www.w3schools.com/java/ref_string_compareto.asp#:~:text=A%20value%20less%20than%200,other%20string%20(more%20characters). */
            }
        });

        /* Edge Case - When the 1st element is 0, then the entire value is 0. So return 0 */
        if (newA.get(0).compareTo("0") == 0) {
            return "0";
        }

        /* Using StringBuilder to create final String by appending the values in the list */
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < newA.size(); i++) {
            str.append(newA.get(i));
        }
        return String.valueOf(str); // Returning the value of StringBuilder which is an object by converting it to String.
    }
}
