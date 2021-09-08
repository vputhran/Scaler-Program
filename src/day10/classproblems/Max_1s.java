package day10.classproblems;

/*Prob:  Given a N*M matrix, where every element is either 0 or 1
* and each row is sorted in increasing order.
* Find max no. of 1's in a row.*/

/*Hint --> Get the first column number that contains 1
* Then subtract it from total number of columns*/

public class Max_1s {
    public static void main(String[] args) {
        int mat[][] = {{0, 0, 0, 1, 1},
                       {0, 0, 0, 0, 1},
                       {0, 1, 1, 1, 1},
                       {0, 0, 0, 1, 1},
                       {1, 1, 1, 1, 1}};

        int mat2[][] = {{0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 1, 1, 1},
                {0, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 1, 1, 1}};
        System.out.println(max1s(mat));
        System.out.println(firstMax1s(mat));

    }
    /*TC: N + M and SC: 1 */
    public static int max1s(int mat[][]) {
        int i = 0;
        int j = mat[0].length - 1;
        int count = 0;
        while (i < mat.length && j >= 0) {
            if (mat[i][j] == 1) {
                count++;
                j--;
            }else {
                i++;
            }
        }
        return count;
    }
    /*Logic from the class:
    * Search for the first 1 in each column
    * Then subtract value of j with the col. length to get the count
    * Exit outLoop
    * Link: https://stackoverflow.com/questions/886955/how-do-i-break-out-of-nested-loops-in-java */
    public static int firstMax1s(int mat[][]) {
        int count = 0;
        int rows = mat.length; // row length
        int cols = mat[0].length; // col length
        outerLoop:          //Label to break out of Nested Loops
        for (int j = 0; j <= cols - 1; j++) {   // Iterate over columns
            for (int i = 0; i <= rows - 1; i++) { //Iterate over rows
                if (mat[i][j] == 1) {
                    count = cols - j;
                    break outerLoop;    //Break out of loop
                }
            }
        }
        return count;
    }
}
