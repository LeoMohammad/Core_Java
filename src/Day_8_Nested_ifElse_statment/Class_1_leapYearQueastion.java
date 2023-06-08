package Day_8_Nested_ifElse_statment;

import java.util.Scanner;

public class Class_1_leapYearQueastion {
    public static void main(String[] args) {

        //Ask the user to enter the year to check if it is a leap year.
        //Rule 1: Years not divisible by 4 are not leap years
        //Rule 2: Years that are divisible by 4 but not by 100 are leap years.
        //Rule 3: Years that are a multiple of 4 but divisible by 100, only years that are a multiple of 400 are leap years

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a year");
        int year = scan.nextInt();

        if (year % 4 != 0) {
            System.out.println("this is not a leap year ");
        } else if (year % 100 != 0) {
            System.out.println("this is a leap year");
        } else if (year % 400 != 0) {
            System.out.println("this is a leap year ");
        } else {
            System.out.println("sorry this is not a leap year ");
        }
        System.out.println("thank you for your respons ");

    }
}