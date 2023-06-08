package Day_7_reviwe_if_else;

import java.util.Scanner;

public class Class_2_review {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your grade ");
        int grade = scan.nextInt();

        if (grade>=85){
            System.out.println("AA");
        }else if (grade>=65) {
            System.out.println("BB");
        }else if (grade>=50){
            System.out.println("CC");
        }else{
            System.out.println("DD");
        }










    }
}
