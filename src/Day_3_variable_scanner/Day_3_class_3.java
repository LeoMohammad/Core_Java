package Day_3_variable_scanner;

import java.util.Scanner;

public class Day_3_class_3 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your name ");
        String name= scan.nextLine();

        System.out.println("please enter your last name " );
        String lastname= scan.nextLine();

        System.out.println("please enter your age");
        byte age = scan.nextByte();

        System.out.println("your name : "+name +"\nyour last name : "+lastname + "\nyour age : "+age +"\nyour registration has been successfully completed");













    }
}
