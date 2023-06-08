package Day_7_reviwe_if_else;

import java.util.Scanner;

public class Class_4_if_else {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your wight as kg");
        int kg = scan.nextInt();

        System.out.println("please enter you height as cm");
        int cm = scan.nextInt();

        int result =(kg*10000/(cm*cm));

        if (result>30){
            System.out.println("obese");
        }else if(result>25){
            System.out.println("overweight");
        }else if(result>20) {
            System.out.println("normal");
        }else {
            System.out.println("go check with your dr");
        }













    }

}
