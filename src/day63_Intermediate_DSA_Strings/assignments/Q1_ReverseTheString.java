package day63_Intermediate_DSA_Strings.assignments;

public class Q1_ReverseTheString {
    public static void main(String[] args) {
        String A = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";
        System.out.println(A);
        System.out.println(solve(A));
    }
    public static String solve(String A) {
        int start = 0;
        int end = A.length() - 1;
        if (A.charAt(start) == ' ') {
            start = start + 1;
        }
        if (A.charAt(end) == ' ') {
            end = end - 1;
        }



        //Reverse the entire string
        A = swap(A, start, end);
        System.out.println(A);

        //Reverse each word
        for (int i = 0; i < A.length(); i++) {
            int startCount = i;
            int endCount = startCount + lengthCount(A, startCount);
            A = swap(A, startCount, endCount);
            if (i != A.length() - 1) {
                i = endCount + 1;
            }

        }
        return A;
    }

    public static String swap(String A, int start, int end) {
        StringBuilder string = new StringBuilder(A);
        while (start < end) {
            char temp = A.charAt(start);
            string.setCharAt(start, A.charAt(end));
            string.setCharAt(end, temp);
            start++;
            end--;
        }
        String singleString = string.toString();
        return singleString;
    }

    public static int lengthCount(String A, int sCount) {
        int count = 0;
        for (int i = sCount; i < A.length() ; i++) {
            if (A.charAt(i) != ' ') {
                count++;
            }else {
                break;
            }
        }
        return count-1;
    }
}
