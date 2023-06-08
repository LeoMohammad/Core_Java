package Day_9_Switch_statment_stringManipulation;

import java.util.Scanner;

public class Class_0 {
    public static void main(String[] args) {

        if(4>3 && 6<5){
            System.out.println("java");
        }else {
            System.out.println("king");
        }

        if (9>8 || 10<2){
            System.out.println("life");
        }else {
            System.out.println("derem");
        }


        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a letter");
        char letter = scan.next().charAt(0);

        if (letter>='a' && letter<='z'){
            System.out.println("lower case");
        }else if (letter>= 'A' && letter <= 'Z'){
            System.out.println("capital letter");
        }










    }
}
