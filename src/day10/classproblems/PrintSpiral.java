package day10.classproblems;

/* Given a N*N matrix, print data in spiral */
public class PrintSpiral {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4, 5},
                       {6, 7, 8, 9, 10},
                       {11, 12, 13, 14, 15},
                       {16, 17, 18, 19, 20},
                       {21, 22, 23, 24, 25}};

        printSpiral(mat);
    }

    public static void printSpiral(int[][] mat) {
        int c = 0; //center - starting point
        int l = mat.length-1; // length to iterate

        while (l > 0) {
            int i =  c; // starting point
            int j = c;
            //Iterate horizontally to right (increase j)
            for (int k = 0; k < l; k++) {
                System.out.print(mat[i][j]+" ");
                j++;
            }
            //Iterate vertical to down (increase i)
            for (int k = 0; k < l; k++) {
                System.out.print(mat[i][j]+" ");
                i++;
            }
            //Iterate horizontally to left (decrease j)
            for (int k = 0; k < l; k++) {
                System.out.print(mat[i][j]+" ");
                j--;
            }
            //Iterate vertically to up (decrease i)
            for (int k = 0; k < l; k++) {
                System.out.print(mat[i][j]+" ");
                i--;
            }
            c++;  //center + 1
            l -= 2; // length - 2
        }
        if (l == 0) {
            System.out.print(mat[c][c]);
        }
    }
}
