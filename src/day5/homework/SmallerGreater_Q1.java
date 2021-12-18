package day5.homework;

import java.util.Arrays;

public class SmallerGreater_Q1 {
    public static void main(String[] args) {
        int[] ar = {241, 710, 751, 904, 264, 955, 413, 163, 914, 173, 940, 164, 494, 545, 750, 685, 665, 619, 99, 953, 759, 783, 534, 706, 771, 570, 471, 543, 658, 674, 634, 766, 931, 40, 244, 209, 360, 517, 962, 420, 155, 711, 845, 646, 117, 641, 458, 790, 620, 46, 837, 560, 374, 510, 133, 214, 322, 275, 342, 460, 642, 153, 751, 317, 71, 8, 256, 195, 256, 469, 16, 986, 339, 753, 773, 921, 638, 529, 333, 73, 393, 985, 846, 175, 548, 694, 560, 174, 710, 478, 316};
        System.out.println(solve(ar));
    }
    public static int solve(int[] A) {
        int cnt = 0;
        Arrays.sort(A);
        System.out.println(A.length);
        System.out.println(Arrays.toString(A));
        for (int i = 1; i < A.length-1; i++) {
            if ((A[i] > A[0]) && (A[i] < A[A.length - 1])) {
                cnt++;
            }
        }
        return cnt;
    }
}
