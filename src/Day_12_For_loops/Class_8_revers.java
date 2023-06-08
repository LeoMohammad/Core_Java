package Day_12_For_loops;

import java.util.Scanner;

public class Class_8_revers {
    public static void main(String[] args) {
        //Question 9 (interview)- Ask the user for a String and print the String in reverse.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scan.nextLine();

        int startingNumber = str.length()-1;
        String outputStr ="";

        for (int i = startingNumber; i >=0 ; i--) {

            outputStr = outputStr + str.charAt(i);
        }

        System.out.println(outputStr);
    }
}
