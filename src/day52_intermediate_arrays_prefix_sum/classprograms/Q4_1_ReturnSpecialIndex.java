package day52_intermediate_arrays_prefix_sum.classprograms;

/* My Code to return the special Index and element */
public class Q4_1_ReturnSpecialIndex {
    public static void main(String[] args) {
        int[] ar = {4, 3, 2, 7, 6, -2};
        int eSum = 0;
        int oSum = 0;
        for (int i = 0; i < ar.length; i++) {
            if (i % 2 == 0) {
                eSum += ar[i];
            } else {
                oSum += ar[i];
            }
        }
        int speElement;
        if (eSum > oSum) {
            speElement = eSum - oSum;
        } else {
            speElement = oSum - eSum;
        }
        System.out.println("Special element is "+speElement);
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == speElement) {
                System.out.println("Special index is "+i);
            }
        }
    }
}
