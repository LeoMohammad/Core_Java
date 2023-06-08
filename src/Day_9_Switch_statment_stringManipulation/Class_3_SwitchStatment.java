package Day_9_Switch_statment_stringManipulation;

import java.util.Scanner;

public class Class_3_SwitchStatment {
    public static void main(String[] args) {
        //Question get the number from the user and print the season.

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number of season");
        int number = scan.nextInt();

        switch (number){

            case 1 : System.out.println("Summer");
            break;
            case 2 : System.out.println("Spring");
            break;
            case 3 : System.out.println("Autumn");
            break;
            case 4 : System.out.println("Winter");
            break;
            default: System.out.println("Sorry not invalid");




        }


    }
}
