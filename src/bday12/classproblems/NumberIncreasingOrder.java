package bday12.classproblems;

public class NumberIncreasingOrder {
    public static void main(String[] args) {
        System.out.println("Increasing order");
        incOrder(10);
        System.out.println("Decreasing order");
        decOrder(20);
    }

    static void incOrder(int x, int n) {
        if (x == n) {
            System.out.println(x + " Highest Number");
            return;
        }

        System.out.println(x);
        incOrder((x+1),n);
        System.out.println(x);
    }

    static void incOrder(int n) {
        //Base case
        if (n == 0) {
            System.out.println(n);
            return;
        }
        incOrder((n - 1));
        System.out.println(n);
    }

    static void decOrder(int n) {
        if (n == 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        decOrder((n-1));
    }
}
