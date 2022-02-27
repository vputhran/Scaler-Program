package day53_intermediate_arrays_carry_forward.classprograms;

public class Q5_ToggleLightBulbs {
    public static void main(String[] args) {
        int[] ar = {1, 0, 1, 0, 1};
        int[] ar2 = {1, 0, 1, 0, 1};
        System.out.println(toggleBulbs(ar));
        System.out.println(toggleBulbOptimised(ar2));
    }
    //Brute force with T.C = N^2 and S.C = O(1)
    public static int toggleBulbs(int[] b) {
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 0) {
                for (int j = i; j <b.length ; j++) {
                    if (b[j] == 0) {
                        b[j] = 1;
                    } else {
                        b[j] = 0;
                    }
                }
                count++;
            }
        }
        return count;
    }

    // Optimised approach
    public static int toggleBulbOptimised(int[] A) {
        int currentState;
        int switchPress = 0;
        for (int i = 0; i < A.length; i++) {
            if (switchPress % 2 == 0) {
                currentState = A[i];
            } else {
                currentState = (A[i] == 0 ? 1 : 0); //  Ternary Operator --> variable = Expression1 ? Expression2: Expression3
//                currentState = 1 - b[i]; // This will also toggle the bit
            }
            if (currentState == 0) {
                switchPress++;
            }
        }
        return switchPress;
    }
}
