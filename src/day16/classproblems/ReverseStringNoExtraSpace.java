package day16.classproblems;

public class ReverseStringNoExtraSpace {
    public static void main(String[] args) {
        String s = "GeeksforGeeks";
        System.out.println(reversingString
                (s.toCharArray(), 0, 12));

    }

    static String reversingString(char []str,
                                  int start,
                                  int end)
    {
        // Iterate loop upto start not equal to end
        while (start < end)
        {
            // XOR for swapping the variable
            str[start] ^= str[end];
            str[end] ^= str[start];
            str[start] ^= str[end];

            ++start;
            --end;
        }
        return String.valueOf(str);
    }
}
