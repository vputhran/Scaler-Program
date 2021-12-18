/*Nobel Integer
* Given an array, check if there exists an Integer 'P' such that
* (number of integers greater than P ) == P */
/*Nobel Integer
 * Given an array, check if there exists an Integer 'P' such that
 * (number of integers greater than P ) == P */



/* Better approach - with edge case when array contain duplicate elements*/

package day15.classproblems;
import java.util.Arrays;

public class NobelInteger {
    public static void main(String[] args) {
        int[] ar = {2, 3,4,4,4,9,6,7,10};
        System.out.println(nobelInt(ar));
    }
    public static boolean nobelInt(int[] a) {
        Arrays.sort(a);
        int n = a.length;
        for (int i = 0; i < n;i++) {
            //check if 'i' is not the last element and a[i] == a[i-1]
            if (i <= n-2 && a[i] == a[i+1]){
                i++;
            } else if (a[i] == (n - i - 1)) {
                System.out.println(a[i]);
                System.out.println(i);
                return true;
            }

        }
        return false;
    }
}
