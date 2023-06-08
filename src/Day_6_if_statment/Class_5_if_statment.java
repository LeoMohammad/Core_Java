package Day_6_if_statment;

import java.util.Scanner;

public class Class_5_if_statment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter three side");

        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        int side3 = scan.nextInt();

        if (side1==side2 && side2==side3 && side1>0){
            System.out.println("equilateral triangle");
        }












    }
}
