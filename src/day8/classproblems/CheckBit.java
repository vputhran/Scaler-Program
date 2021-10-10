package day8.classproblems;

/* Give a integer check if ith bit is set or not*/

public class CheckBit {
    public static void main(String[] args) {
        System.out.println(checkBit(5,1));
    }

    public static boolean checkBit(int N, int i) {
        if (((N >> i) & 1) == 1) {
            return true;
        }else{
            return false;
        }
    }
}
