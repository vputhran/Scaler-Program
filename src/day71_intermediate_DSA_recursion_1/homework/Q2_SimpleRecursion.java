package day71_intermediate_DSA_recursion_1.homework;

public class Q2_SimpleRecursion {
    public static void main(String[] args) {
        System.out.println(foo(3, 5));
    }

    public static int foo(int x, int y) {
        if (y == 0 ) return 1;
        return bar(x, foo(x, y - 1));
    }

    public static int bar(int x, int y) {
        if (y == 0 ) return 0;
        return (x + bar(x, y - 1));
    }
}
