package day54_intermediate_arrays_subarrays.classprograms;

public class Q5_SumOfAllSubArrays {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3};
        System.out.println(allSum(ar));
        System.out.println(allSum_2(ar));
        System.out.println(allSum_3(ar));
    }

    public static int allSum(int[] ar) {
        int[] prSum = new int[ar.length];
        prSum[0] = ar[0];
        for (int i = 1; i < ar.length; i++) {
            prSum[i] = prSum[i - 1] + ar[i];
        }
        int sum = 0;
        for (int i = 0; i < prSum.length; i++) {
            for (int j = i; j < prSum.length; j++) {
                if (j > 0 && i > 0) {
                    sum += prSum[j] - prSum[i - 1];
                }else {
                    sum += prSum[j];
                }
            }
        }
        return sum;
    }

    public static int allSum_2(int[] ar) {
        int ans = 0;
        for (int i = 0; i < ar.length; i++) {
            int sum = 0;
            for (int j = i; j < ar.length; j++) {
                sum = sum + ar[j];
                ans += sum;
            }
        }
        return ans;
    }

    public static int allSum_3(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            int n = (i + 1) * (ar.length - i);
            sum += ar[i] * n;
        }
        return sum;
    }
}
