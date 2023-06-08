package Day_4_data_casting_wrapper;

import java.util.Scanner;

public class Class_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("please enter first number");
        double firstnumber= scan.nextDouble();


        System.out.println("please enter second number");
 double secondnumber = scan.nextDouble();


 double result = firstnumber/secondnumber;
        System.out.println(result);

        int intresult = (int)result;
        System.out.println(intresult);





    }
}
