package bday14.classprograms;

public class SortedArray {
    public static void main(String[] args) {
        int[] ar = {10, 9, 40, 50};
        for (int i = 0; i < ar.length-1; i++) {
            if ((ar[i] < ar[i + 1]) ) {
                System.out.println("Sorted");
            } else {
                System.out.println("Not sorted");
            }
        }
    }
}
