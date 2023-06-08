package Day_8_Nested_ifElse_statment;

import java.util.Scanner;

public class Class_4_ternary {
    public static void main(String[] args) {


        // take a positive number from user
        // if it is an even number, print "even number"
        // if it is not print "odd number"

Scanner scan = new Scanner(System.in);
        System.out.println("please enter a positive number");
int number = scan.nextInt();

if (number%2==0){
    System.out.println("this is an even number ");
}else {
    System.out.println("this is a Odd number ");
}

        System.out.println(number%2==0 ? "even number" : "odd number");



    }
}
