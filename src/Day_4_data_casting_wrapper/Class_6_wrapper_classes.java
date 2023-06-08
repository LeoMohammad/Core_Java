package Day_4_data_casting_wrapper;

public class Class_6_wrapper_classes {
    public static void main(String[] args) {

//wrapper classes
      //  Example


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

String strnumber = "345";

int intnumber = Integer.parseInt(strnumber);
        System.out.println(intnumber);
        System.out.println((intnumber)+(10));


        System.out.println(strnumber+10);
        System.out.println(Integer.parseInt(strnumber)+10);


        char chr='k';

        System.out.println(Character.isDigit(chr));
        System.out.println(Character.isLetter(chr));
        System.out.println(Character.isAlphabetic(chr));


        int a = 20;
        int b = 6;
        System.out.println(20/6);

        int ab= a/b;
        double dnumber= (double)ab;
        System.out.println(dnumber);

        double c = 20;
        System.out.println(c/b);

       int number1 = 12;
       number1= number1+5;
       System.out.println(number1);

       int number2 = 25;
        System.out.println(number2 = number2/10);


    }
}
