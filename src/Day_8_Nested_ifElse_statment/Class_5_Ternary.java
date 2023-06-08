package Day_8_Nested_ifElse_statment;

import java.util.Scanner;

public class Class_5_Ternary {
    public static void main(String[] args) {
        //Question 3- Ask the user for a letter,
        // if the entered character is lowercase,
        // print it in uppercase, otherwise print the entered letter


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter");
        char letter = scan.next().charAt(0);

        System.out.println(Character.isLowerCase(letter)? Character.toUpperCase(letter) : letter );
        // letter>='a' && letter <= 'z' : Instead of   "Character.isLowerCase(letter" we could have used  letter>='a' && letter <= 'z'


    }

}


