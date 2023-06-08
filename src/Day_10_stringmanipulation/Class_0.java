package Day_10_stringmanipulation;

import java.util.Scanner;

public class Class_0 {
    public static void main(String[] args) {

        int y = 20;
        System.out.println((y>=20) ? (2+y) : (y-3));


        int w = 8;
        int x = (w%2== 1) ? (3*w) : (w/4);
        System.out.println(x);


int f= 12;
if(f%2==0){
    System.out.println(3*f);
}else {
    System.out.println(5+f);
}


        Scanner scan =new Scanner(System.in);
        System.out.println("please enter a salary");
int salary = scan.nextInt();

switch (salary){
    case 6000 : System.out.println("minimum wage");
        break;
    case 10000 : System.out.println("teacher salary");
    break;
    case 15000 : System.out.println("tesster");
        break;
    default: System.out.println("no such salary");





}








    }
}
