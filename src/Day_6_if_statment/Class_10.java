package Day_6_if_statment;

import java.util.Scanner;

public class Class_10 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a charactar");
        char chr = scan.next().charAt(0);

        if (chr >= 65 && chr <= 90 ){
            System.out.println("yes, it is a capital letter ");
        }else {
            System.out.println("it is somthing else");
        }













    }
}
