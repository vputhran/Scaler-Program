package bday12.classproblems;

public class PrimeFactorization {
    public static void main(String[] args) {

    }

    static void primeFactor(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }else {

            }
        }
    }
}
