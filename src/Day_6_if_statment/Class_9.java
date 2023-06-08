package Day_6_if_statment;

import java.util.Scanner;

public class Class_9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your age ");
        int age = scan.nextInt();

        if (age>=65){
            System.out.println(" you can retire ");
        }else {
            System.out.println("you have to work : " + (65-age) + " years more" );
        }











    }
}
