package Day54_Intermediate_arrays_subarrays.classprograms;

public class PrintSubArray {
    public static void main(String[] args) {
        int[] ar = {2, 4, 5, -1, 3, 6, 8, 9};
        printSub(ar, 2, 7);
    }

    public static void printSub(int[] a, int srtIndex, int endIndex) {

        for (int i = srtIndex; i <= endIndex; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
