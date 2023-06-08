package Day_8_Nested_ifElse_statment;

import java.util.Scanner;

public class Class_3_Neasted_If_Else {
    public static void main(String[] args) {

        //Question 1- Get the gender and age from the user.
        // Female, 60 years old and over,
        // Men 65 years and older can retire.
        // Print “You can retire” or “You need to work .. more years to retire”,
        // taking into account gender and age.


        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your gender ");
        char gender = scan.next().charAt(0);
        System.out.println("please enter your age ");

        int age = scan.nextInt();

        if ((gender == 'f' && age >= 60) || gender == 'm' && age >= 65) {
            System.out.println("yes you can retire");
        } else {
            System.out.println("Sorry you have to work more");
        }
        System.out.println();
        System.out.println("your gender : " +(gender)  +"and your age : " + (age));
    }
}
