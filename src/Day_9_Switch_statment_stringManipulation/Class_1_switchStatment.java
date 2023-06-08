package Day_9_Switch_statment_stringManipulation;

import java.util.Scanner;

public class Class_1_switchStatment {
    public static void main(String[] args) {

        // ask a letter from user
        // print days starting with the letter
        //  if user enters invalid data, print invalid letter


        Scanner scan = new Scanner(System.in);
        System.out.println("pleas enter a letter ");
        char letter = scan.next().charAt(0);

        Character.toUpperCase(letter);
        switch (letter) {

            case 'm':
                System.out.println("monday");
                break;
            case 't':
                System.out.println("tuesday" + "thursday");
                break;
            case 'w':
                System.out.println("wednesday");
                break;
            case 'f':
                System.out.println("friday");
                break;
            case 's':
                System.out.println("saturday" + "sunday");
                break;
            default:
                System.out.println("Sorry not invalid");
        }


    }
}
