package Day_7_reviwe_if_else;

import java.util.Scanner;

public class Class_3_if_eles_question {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your age ");
int age = scan.nextInt();
        System.out.println("please enter your gender");
char gender = scan.next().charAt(0);

if ((gender=='f' && age>=60 ) || (gender=='m' && age>=65)){
    System.out.println("you can retire");
}else if (gender=='f'){
    System.out.println("you have work " + (age-60) + "years more please");
}else if (gender== 'm'){
    System.out.println("you have to work" + (age-65) + "years more please bab");
}else {
    System.out.println("you are not under process");
}









    }
}
