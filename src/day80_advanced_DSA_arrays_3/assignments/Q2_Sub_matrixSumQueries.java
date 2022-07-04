package day80_advanced_DSA_arrays_3.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2_Sub_matrixSumQueries {
    public static void main(String[] args) {
     /*   ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        A.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        A.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> D = new ArrayList<>(Arrays.asList(2, 3));
        ArrayList<Integer> E = new ArrayList<>(Arrays.asList(2, 3));
*/

       /*
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(5, 17, 100, 11)));
        A.add(new ArrayList<>(Arrays.asList(0, 0,  2,   8)));

        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 1));
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList(1, 4));
        ArrayList<Integer> D = new ArrayList<>(Arrays.asList(2, 2));
        ArrayList<Integer> E = new ArrayList<>(Arrays.asList(2, 4));
*/
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        A.add(new ArrayList<>(Arrays.asList(5, 17, 100, 11)));
        A.add(new ArrayList<>(Arrays.asList(0, 0,  2,   8)));

        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 1));
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList(1, 4));
        ArrayList<Integer> D = new ArrayList<>(Arrays.asList(2, 2));
        ArrayList<Integer> E = new ArrayList<>(Arrays.asList(2, 4));

        System.out.println(solve(A, B, C, D, E));
    }

    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D, ArrayList<Integer> E) {

        int N = A.size();
        int M = A.get(0).size();

        // Prefix sum matrix - using long data type
        long[][] psm = new long[N][M];

        //Setting the 0th Column
        for (int i = 0; i < N; i++) {
            psm[i][0] = A.get(i).get(0);
        }

        //Row wise Prefix sum
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < M; j++) {
                psm[i][j] = psm[i][j - 1] + A.get(i).get(j);
            }
        }

        //Column wise Prefix sum
        for (int j = 0; j < M; j++) {
            for (int i = 1; i < N; i++) {
                psm[i][j] += psm[i - 1][j];
            }
        }

        ArrayList<Integer> sum = new ArrayList<>();

        for (int i = 0; i < B.size(); i++) {
            int b = B.get(i) - 1;
            int c = C.get(i) - 1;
            int d = D.get(i) - 1;
            int e = E.get(i) - 1;

            long fullSum = psm[d][e];

            long topSum = 0;
            long sideSum = 0;
            long extra = 0;

            //Case: when b & c are greater than 0
            if (b > 0 && c > 0) {
                topSum = psm[b - 1][e];

                sideSum = psm[d][c - 1];

                extra = psm[b - 1][c - 1];
            }
            else if ( b > 0){ // Case :  when only b is greater than 0
                topSum = psm[b - 1][e];
            } else if ( c > 0){  // Case : when only c is greater than 0
                sideSum = psm[d][c - 1];
            }

            // Using mod 10^9 + 7 on final value
            long sumLocal = (fullSum - topSum  - sideSum  + extra) % 1000000007;

            //Handle -ve sumLocal value: if -ve then adding 1000000007 to sumLocal
            if (sumLocal < 0){
                sumLocal += 1000000007;
            }

            sum.add((int) sumLocal);
        }

        return sum;
    }
}
