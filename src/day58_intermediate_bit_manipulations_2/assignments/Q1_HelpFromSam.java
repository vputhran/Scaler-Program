package day58_intermediate_bit_manipulations_2.assignments;

public class Q1_HelpFromSam {
    public static void main(String[] args) {
        int A = 4;
        System.out.println(solve(A));
    }
    public static int solve(int A) {
        int count = 0;
        while(A >= 0){
            if(A > 2){
                A = A / 2;
            }else if (A == 2){
                A = A / 2;
                count++;
            } else if(A ==1){
                count++;
            }

        }
        return count;
    }
}
