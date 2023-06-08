package Day_4_data_casting_wrapper;

import java.util.Scanner;

public class Class_7_modulus {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("please enter 4 digit integer");
        int number = scan.nextInt();

        int sum = 0;

        sum = sum+ number%10;
        number=number/10;

        sum = sum +number%10;
        number = number/10;

        sum = sum + number%10;
        number = number/10;


        sum = sum + number%10;

        System.out.println("sum of digits : "+ sum);




    }
}
