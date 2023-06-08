package Day_3_variable_scanner;

import java.util.Scanner;

public class Day_3_calss_5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("pls enter your name");
        char name = scan.next().charAt(0);

        System.out.println("pls enter surname");
        String surname = scan.nextLine();

        System.out.println("pls enter your age ");
        byte age = scan.nextByte();

        System.out.println(name+ surname + age );

    }
}
