package day72_intermediate_DSA_recursion_2.assignment;

public class Q1_ImplementPowerFunction {
    public static void main(String[] args) {
        System.out.println(pow(0, 0, 1));
    }
    public static int pow(int A, int B, int C) {
        if (A==0){
            return 0;
        }
        if (B==0){
            return 1;
        }
        long he= pow(A,B/2,C);
        long ha= ((he%C)*(he%C))%C;
        if ((B&1)==0){
            return (int)ha;
        }
        else{
            int x= (int)((ha % C * (long) (A % C))%C);
            if (x<0){
                return C+(int)((ha % C * (long) (A % C))%C);
            }
            else{
                return x;
            }
        }
    }
}
