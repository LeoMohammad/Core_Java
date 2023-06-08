package Day_3_variable_scanner;

import java.util.Scanner;

public class Day_3_class_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter firstside");
        double firstside = scan.nextDouble();

        System.out.println("please enter secondside");
        double secondside = scan.nextDouble();

        double areaofrec = firstside*secondside;

        System.out.println("result of two side :" + areaofrec);
        System.out.println("thank you for you respons");




    }
}
