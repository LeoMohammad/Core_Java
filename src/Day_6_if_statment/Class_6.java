package Day_6_if_statment;

import java.util.Scanner;

public class Class_6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please write a note more than 50 ");
        int grade = scan.nextInt();

        if (grade >= 50) {
            System.out.println("congratulation you passed");
        }

        if (grade < 50) {
            System.out.println(" sorry you failed");
        }
    }}








