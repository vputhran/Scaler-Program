package day51_Intermediate_introduction_to_arrays.classprograms;

/* Q. Given and array of size N and a number K, return true if there exists a pair a[i] & a[j] such that
 *      a[i] + a[j] == k  and i != j  */



public class Q2_ArrayPairSum {
    public static void main(String[] args) {
        int[] ar = {3, -2, 1, 4, 3, 6, 8};
        int K = 13;
        System.out.println(pairSum_2Pointers(ar, K));
    }

    //Brute force method -->  Time complexity O(N^2)
    public static boolean pairSum(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1 ; j < a.length; j++) {
                if ((a[j] == k - a[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* Using 2 Pointer Approach
    * T.C:  O(N)
    * Ref. Link:  https://www.baeldung.com/java-two-pointer-technique#:~:text=In%20the%20two-pointer%20approach,end%20until%20they%20both%20meet */

    public static boolean pairSum_2Pointers(int[] a, int k) {
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            int sum = a[start] + a[end];
            if (sum == k) {
                return true;
            } else if (sum < k) {
                start++;
            }else {
                end--;
            }
        }
        return false;
    }
}

