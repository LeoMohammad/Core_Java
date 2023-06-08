package Day_15_while_do_while_loops;

import java.util.Scanner;

public class Class_8_WhileLoop {

    public static void main(String[] args) {
        // to calculate sum of numbers, take numbers from the user
        // and tell user to press 0 to end the app
        // when user presses 0 code should print the sum of numbers

        Scanner scan = new Scanner(System.in);

        int number =1;
        int sum =0;

        while(number!=0){
            System.out.println("Plese enter a number");
            number = scan.nextInt();

            sum+=number;
        }
        System.out.println(sum);

    }
}