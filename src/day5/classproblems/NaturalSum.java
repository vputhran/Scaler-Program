package day5.classproblems;

public class NaturalSum {
    public static void main(String[] args) {
        System.out.println(  naturalSum(5));
    }

    public static int naturalSum(int N) {
        int sum = 0;
        sum += N*(N + 1) / 2;
        return sum;
    }
}
