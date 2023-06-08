package Day_4_data_casting_wrapper;

import java.util.Scanner;

public class Class_2 {

    public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);

        System.out.println("please enter a letter");

char letter = scan.next().charAt(0);

        System.out.println("user entered : " + "\nnextletter :" + (char)(letter+1)
        +"\nnextletter :" +(char)(letter+2)
        +"\nnextletter : " + (char)(letter+3));







    }

    }
