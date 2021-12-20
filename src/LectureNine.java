import java.util.Scanner;

public class LectureNine {
    public static void main(String[] args) {

        // 1D Integer Array

        int[] arr = {10, 20, 30, 40};

        //loop to iterate over the array

        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //Enhanced for loop
        System.out.println("Enhanced for loop");
        for (int val : arr) {
            System.out.println(val);
        }

        takeInput();
    }

    //Take input the size of the array and create array of that size
    static void takeInput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int val : arr) {
            System.out.println(val);

        }
    }
}
