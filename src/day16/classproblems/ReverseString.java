package day16.classproblems;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Vineeth"));
    }

    public static StringBuilder reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();

        return sb;
    }
}
