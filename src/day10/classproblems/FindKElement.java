package day10.classproblems;
/*
Prob: Given N*M, where every row and col are sorted in increasing
order, search if k element is present in given matrix?

k = 15 (present)
k = 28 (not present)
* */
public class FindKElement {
    public static void main(String[] args) {
        int mat[][] = {
                {-1, 2, 4, 5, 9, 11},
                {1, 4, 7, 8, 10, 14},
                {3, 7, 9, 10, 12, 18},
                {6, 10, 12, 14, 16, 20},
                {9, 13, 16, 19, 22, 24},
                {11, 15, 19, 21, 24, 27},
                {14, 20, 25, 29, 31, 29}};

//        System.out.println(smartKSearch(mat, 15));
//        System.out.println(KSearch(mat, 28));
        System.out.println(smartKSearchP3(mat, 0));
    }

    /* Brute force method
    Time Complexity is O(N*M)
    Space Complexity is 1 since no extra space is used
    */
    public static boolean KSearch(int mat[][], int k) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == k) {
                    return true;
                }
            }
        }
        return false;
    }

    /* O(N+M) because at every iteration we either skip a row or column
    * Since there can be N + M skips --> TC == O(N+M)*/
    public static boolean smartKSearch(int mat[][], int k) {
        int i = 0;
        int j = mat[0].length-1;

        while (i < mat.length && j >= 0) {
            if (k == mat[i][j]) {
                return true;
            } else if (k < mat[i][j]) {
                j--;  //left shift
            } else {
                i++;  // shift down
            }
        }
        return false;
    }

    public static boolean smartKSearchP3(int mat[][], int k) {
        int i = mat.length - 1;
        int j = 0;

        while (i >= 0 && j < mat[0].length) {
            if (k == mat[i][j]) {
                return true;
            } else if (k > mat[i][j]) {
                j++;
            }else {
                i--;
            }
        }
        return false;
    }
}
