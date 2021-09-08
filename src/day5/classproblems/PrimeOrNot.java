package day5.classproblems;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println(primOrNot(1));
    }

    public static boolean primOrNot(int N) {
        int cnt = 0;
        if (N == 1) { // 1 is neither prime nor composite number
            return false;
        }else {
            for (int i = 1; i < N; i++) {
                if (N % i == 0) {
                    cnt++;
                }
            }
        }
        if (cnt > 2) {
            return false;
        }
        return true;
    }
}
