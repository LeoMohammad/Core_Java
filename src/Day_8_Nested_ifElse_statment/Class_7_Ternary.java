package Day_8_Nested_ifElse_statment;

import java.util.Scanner;

public class Class_7_Ternary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a letter");
        char letter = scan.next().charAt(0);

        System.out.println(Character.isLowerCase(letter)? Character.toUpperCase(letter) : letter);








    }
}
