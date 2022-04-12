package day63_Intermediate_DSA_Strings.classprograms;

public class Q2_StringSortDictionaryOrder {
    public static void main(String[] args) {
        String s = "asdtedddaa";
        System.out.println(dictionaryOrderSort(s));
    }

    public static String dictionaryOrderSort(String A) {
        // Creating the strCount array to track the frequency of occurrence of each character
        int[] strCount = new int['a' - 'A']; // 'a' - 'A' to get the difference of 32
        // Counting the freq of each char
        for (int i = 0; i < A.length(); i++) {
            int index = A.charAt(i) - 'a';
            strCount[index]++;
        }
        StringBuilder str = new StringBuilder();
        //Adding each character based on its occurrence into the str
        for (int i = 0; i < strCount.length; i++) {
            if (strCount[i] > 0) {
                while (strCount[i] > 0) {
                    str.append((char) ('a' + i));
                    strCount[i]--;
                }
            }
        }
        return str.toString();
    }
}
