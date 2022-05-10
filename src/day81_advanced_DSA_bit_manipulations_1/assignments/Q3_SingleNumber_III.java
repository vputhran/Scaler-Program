package day81_advanced_DSA_bit_manipulations_1.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Q3_SingleNumber_III {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2308, 1447, 1918, 1391, 2308, 216, 1391, 410, 1021, 537, 1825, 1021, 1729, 669, 216, 1825, 537, 1995, 805, 410, 805, 602, 1918, 1447, 90, 1995, 90, 1540, 1161, 1540, 2160, 1235, 1161, 602, 880, 2160, 1235, 669));
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(186, 256, 102, 377, 186, 377));
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 4));
        System.out.println(solve(A));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        int xorVal = 0;
        for (int i = 0; i < A.size(); i++) {
            xorVal ^= A.get(i);
        }
        int checkXorValSetBit = xorVal;
        int i = -1;
        while (checkXorValSetBit > 0) {
            if ((checkXorValSetBit & 1) == 1) {
                i++;
                break;
            } else {
                checkXorValSetBit = checkXorValSetBit >> 1;
                i++;
            }
        }
        ArrayList<Integer> setArr = new ArrayList<>();
        ArrayList<Integer> unSetArr = new ArrayList<>();
        for (int j = 0; j < A.size(); j++) {
            if (checkBit(A.get(j), i)) {
                setArr.add(A.get(j));
            } else unSetArr.add(A.get(j));
        }
        int firstNum = 0;
        int secNum = 0;
        for (int j = 0; j < setArr.size(); j++) {
            firstNum ^= setArr.get(j);
        }
        for (int j = 0; j < unSetArr.size(); j++) {
            secNum ^= unSetArr.get(j);
        }

        //The output needs to be the lowest number first and the highest number second
        ans.add(Math.min(firstNum,secNum));
        ans.add(Math.max(firstNum,secNum));

        return ans;
    }

    public static boolean checkBit(int N, int i) {
        return (((N >> i) & 1) == 1);
    }
}
