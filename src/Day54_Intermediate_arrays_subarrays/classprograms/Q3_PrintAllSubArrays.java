package Day54_Intermediate_arrays_subarrays.classprograms;

public class Q3_PrintAllSubArrays {
    public static void main(String[] args) {
        int[] ar = {2, 4, 5};

        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                printSub(ar, i, j);
                System.out.println();
            }
        }
    }
    public static void printSub(int[] a, int srtIndex, int endIndex) {

        for (int i = srtIndex; i <= endIndex; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
