package Day54_Intermediate_arrays_subarrays.classprograms;

public class Q4_1_IndividualSumsOfEverySingleSubArray {
    public static void main(String[] args) {
        int[] ar = {3, 2, -1, 4};

        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                subArraySum(ar, i, j);
            }
            System.out.println();
        }

    }
    //Brute force approach --> O(N^3)
    public static void subArraySum(int[] A, int stIdx, int edIdx) {
        int sum = 0;
        for (int i = stIdx; i <= edIdx; i++) {
            sum += A[i];
        }
        System.out.print(sum+" ");
    }
}
