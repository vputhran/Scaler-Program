package iday4_Arrays.classprograms;

public class ArrayKSum {
    public static void main(String[] args) {
        int[] ar = {3, -2, 1, 4, 3, 6, 8};
        int[] ar1 = {2, 4, -3, 7};
        int k = 5;
        System.out.println(arraySumTriangle(ar1, k));
    }

    // Brute force approach
    public static boolean arraySum(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if ((i != j) && (k) == a[i] + a[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /*Upper triangle approach discussed in the class*/
    public static boolean arraySumTriangle(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ( (k) == a[i] + a[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
