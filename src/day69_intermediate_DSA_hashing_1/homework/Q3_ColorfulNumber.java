package day69_intermediate_DSA_hashing_1.homework;

import java.util.HashSet;
import java.util.Set;

public class Q3_ColorfulNumber {
    public static void main(String[] args) {
        int A = 3245;
        System.out.println(colorful(A));
    }
    public static int colorful(int A) {
        Set<Integer> set = new HashSet<>();
        int B=A,i=0,sum=1;

        while(A>0){
            int d = B%10;
            sum=sum*d;
            if(set.contains(sum)){
                return 0;
            }
            set.add(sum);
            B=B/10;
            if(B==0){
                A=A/10;
                B=A;
                sum=1;
            }
        }
        return 1;

    }
}
