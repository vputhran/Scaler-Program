package day59_intermediate_arrays_and_maths.classprograms;

public class Q1_MajorityElement {
    public static void main(String[] args) {
        int[] A = {1, 1, 1, 2, 2};
        System.out.println(majorityElement2(A));
    }

    /* Brute force method */
    public static int majorityElement(int[] A) {

        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = 0; j <A.length ; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
            if (count > A.length / 2) {
                return A[i];
            }
        }
        return 0;
    }

    public static int majorityElement2(int[] A) {
        int count = 1;
        int majEle = A[0];
        for (int i = 0; i < A.length-1; i++) {
            if (A[i] == A[i + 1]) {
                majEle = A[i];
                count++;
            }else {
                if (count != 0) {
                    count --;
                }
//                i++;
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] == majEle) {
                count++;
            }
        }
        if ((count > A.length / 2) || (A.length == 1)) {
            return majEle;
        }else {
            return 0;
        }
    }
}
