package Day_4_data_casting_wrapper;

import java.util.Scanner;

public class class_5 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("please enter a double number");
        double doublenumber = scan.nextDouble();

        System.out.println("please enter a integer number");
        int intnumber = scan.nextInt();

        double result = doublenumber/intnumber;
        System.out.println(result);

        int intresult = (int) result;
        System.out.println(intresult);

        System.out.println("thank you for your respons");
    }
}
