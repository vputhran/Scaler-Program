package bday10.assigments;

import java.util.Scanner;

public class Q1_CategoriesThePerson {
    public static void main(String[] args) {
        System.out.println("Enter the Height");
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();

        if (height >= 195) {
            System.out.println("abnormal");
        } else if (height >= 165 && height < 195) {
            System.out.println("taller");
        } else if (height >= 150 && height < 165) {
            System.out.println("average");
        }else {
            System.out.println("dwarf");
        }
    }
}
