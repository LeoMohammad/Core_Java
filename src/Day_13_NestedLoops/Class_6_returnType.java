package Day_13_NestedLoops;

import java.util.Scanner;

public class Class_6_returnType {

        public static void main(String[] args) {

            add();
            add();
            add();

        }

        public static void add() {

            Scanner scan = new Scanner(System.in);
            System.out.println("Pleae enter a number");
            int firstNumber = scan.nextInt();

            System.out.println("Please enter second number");
            int secondNumber = scan.nextInt();

            int result = firstNumber + secondNumber;

            System.out.println(result);
            System.out.println("End of the calculation");

        }

    }