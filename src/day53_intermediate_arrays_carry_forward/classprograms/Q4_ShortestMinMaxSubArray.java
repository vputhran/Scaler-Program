package day53_intermediate_arrays_carry_forward.classprograms;

public class Q4_ShortestMinMaxSubArray {
    public static void main(String[] args) {
        int[] ar = {-3, 5, 2, 4, 5, 2, 8, -9, 3, 1};
        int[] ar2 = {1, 6, 4, 2, 7, 7, 5, 1, 3, 1, 1, 5};
        int[] ar3 = {8, 8, 8, 8, 8};
        System.out.println(subArrayLengthBrute(ar3));
        System.out.println(subArrayLengthOptimised(ar3));
    }

    //Brute force approach
    public static int subArrayLengthBrute(int[] A) {
        //Find the min and max value
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > maxVal) {
                maxVal = A[i];
            } else if (A[i] < minVal) {
                minVal = A[i];
            }
        }
        //Finding the shortest sub-array length
        int subArrayLength = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == maxVal) {
                for (int j = i; j < A.length; j++) {
                    if (A[j] == minVal) {
                        subArrayLength = Math.min(subArrayLength, j - i + 1);
                    }
                }
            } else if (A[i] == minVal) {
                for (int j = i; j < A.length; j++) {
                    if (A[j] == maxVal) {
                        subArrayLength = Math.min(subArrayLength, j - i + 1);
                    }
                }
            }
        }
        return subArrayLength;
    }

    //Optimised Approach
    public static int subArrayLengthOptimised(int[] A) {
        //Find the min and max value
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > maxVal) {
                maxVal = A[i];
            } else if (A[i] < minVal) {
                minVal = A[i];
            }
        }
        //Finding the shortest sub-array length
        int subArrayLength = Integer.MAX_VALUE;
        int lastMin = -1;
        int lastMax = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == minVal) {
                lastMin = i;
            }
            if (A[i] == maxVal) {
                lastMax = i;
            }
            if (lastMax != -1 && lastMin != -1) {
                if (lastMin > lastMax) {
                    subArrayLength = Math.min(subArrayLength, lastMin - lastMax + 1);
                } else {
                    subArrayLength = Math.min(subArrayLength, lastMax - lastMin + 1);
                }
            }
        }
        return subArrayLength;
    }
}
