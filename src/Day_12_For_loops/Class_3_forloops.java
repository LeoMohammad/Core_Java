package Day_12_For_loops;

import java.awt.*;
import java.util.Scanner;

public class Class_3_forloops {

        public static void main(String[] args) {
            //Question 2- Take a positive integer from the user,
            // print numbers divisible by 7 from 1 to the entered number (including the entered number).
            Scanner scan = new Scanner(System.in);
            System.out.println("please enter a number");
            int endingNumber = scan.nextInt();

            for (int i = 1; i <=endingNumber ; i++) {
                if (i%7==0){
                    System.out.print(i+" ");
                }
            }
        }
    }














