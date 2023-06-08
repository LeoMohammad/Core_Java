package Day_10_stringmanipulation;

import java.util.Scanner;

public class Class_6_question {
    public static void main(String[] args) {

        //Question 1: Get a String from the user and the text to be searched.
        // Print whether the String contains the desired text using the indexOf( ) method.

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a string");
        String str1 = scan.nextLine();

        System.out.println("please enter another string");
        String str2 = scan.next();

        if (str1.indexOf(str2) != (-1)) {
            System.out.println("str1 contains str2 ");
        } else {
            System.out.println("str1 does not contains str2");
        }


    }
}
