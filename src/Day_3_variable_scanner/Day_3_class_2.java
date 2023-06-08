package Day_3_variable_scanner;

import java.util.Scanner;

public class Day_3_class_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a number");
       int number = scan.nextInt();

        System.out.println("please enter a second number");
        double secondnumber = scan.nextDouble();

        System.out.println("result of "+number+"+"+secondnumber+"is : "+ (number+secondnumber) );
        System.out.println("thank you for your respons");





    }
}
