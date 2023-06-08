package Day_3_variable_scanner;

import java.util.Scanner;

public class Day_3_class_1 {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("please enter your name and surname ");
        String nameandsurname= scan.nextLine();

        System.out.println("please enter your age ");
        byte age = scan.nextByte();

        System.out.println("please enter your date of brith");
        int dob= scan.nextInt();

        System.out.println("nameandsurname :"+nameandsurname+ "\nage : "+age+ "\ndob :"+dob);





















    }




}
