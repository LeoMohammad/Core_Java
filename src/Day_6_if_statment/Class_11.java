package Day_6_if_statment;

import java.util.Scanner;

public class Class_11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a lowercase");
        char chr = scan.next().charAt(0);

        if(chr>= 'a' && chr <= 'z'){
            System.out.println(Character.toUpperCase(chr));
        }else {
            System.out.println(chr);
        }














    }
}
