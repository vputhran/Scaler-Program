package day8.classproblems;

public class CheckBitRightShift_2 {
    public static void main(String[] args) {
        System.out.println(checkBitRight(7,2));
    }

    public static boolean checkBitRight(int N, int i) {
        if ((N & (1 << i)) != 0) {
            return true;
        }else {
            return false;
        }
    }
}
