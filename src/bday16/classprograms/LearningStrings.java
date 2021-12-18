package bday16.classprograms;

import java.util.Arrays;

public class LearningStrings {
    public static void main(String[] args) {

        String a = "Hello";
        String b = "hello";


//        if (a == b) {
//            System.out.println((a == b) + " Strings are equal " );
//        } else if (a.equals(b)) {
//            System.out.println(a.equals(b) + " String are equal");
//        } else {
//            System.out.println("Strings are not equal");
//        }

        char[] cr = a.toCharArray();
        System.out.println(cr[0]);

        String location = " Udupi";
        String date = "20th Nov 2021";
        System.out.println(location);
        //Strips off the space at the start and end of the string but not at he middle
        System.out.println(location.strip());

        /* Another way to concatenate Strings */

        System.out.printf("I will travelling to %s on %s", location, date);
        System.out.println();

        String Month = "Jan";
        int days = 31;
        System.out.printf("There are %s days in the month of %s",days,Month);
        System.out.println();
        System.out.println(days);

        // Converting int to String
        System.out.println(String.valueOf(days)+1);

        /*Adding 2 characters will give a integer output (ASCII value -->195 ) because char is a primitive data type*/
        System.out.println('a' + 'b');

        /*Adding 2 String results in concatenation of those 2 strings*/
        System.out.println("a" + "b");


        String para = "We are learning about String in the academy batch"
                + "String is an Important topic"
                + " String is used to solve any problems";

        System.out.println(para.indexOf("academy"));

        int count = 0;
//        for (int i = 0; i < para.length(); i++) {
//            count = para.in;
//        }
        System.out.printf("String occurs %s times in the para", count);
        System.out.println();

        printAllOccurences(para,"String");
    }

    static void printAllOccurences(String para, String key) {
        int i = para.indexOf(key);
        while (i != -1) {
            System.out.printf("Found %s at %d \n",key,i);
            i = para.indexOf(key, i + 1);
        }
    }
}
