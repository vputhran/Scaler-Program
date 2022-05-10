package day81_advanced_DSA_bit_manipulations_1.classprograms;

public class Q3_UniqueElement {
    public static void main(String[] args) {
        int[] ar = {3, 2, 3, 7, 2, 8, 7};
        System.out.println(uniqueEle(ar));
    }

    public static int uniqueEle(int[] ar) {
        int ele = 0;
        for (int i = 0 ; i < ar.length; i++) {
            ele = ele ^ ar[i];
        }
        return ele;
    }
}
