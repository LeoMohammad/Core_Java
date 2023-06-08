package Day_13_NestedLoops;

public class Socrative {

    public static void main(String[] args) {

        for (int i = 1; i <6; i++) {

            System.out.print(i+" ");
        }
        System.out.println("-======================-=-=-=-=-=-=-=-=-=-=-");

        for (int i = 1; i <100; i+=2) {
            System.out.print(i + " ");
        }

        System.out.println("=-=-=-=-=-=-=-=-=-----------------=-=-=-=-=-=-=-=-=-=-");

        int total = 0;

        for (int i = 1; i <6; i++) {
            total = total + i ;
        }
        System.out.println("total: "  +  total );

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        int sum=0;

        for (int i =10; i > 0; i=i-5) {
            sum = sum +i;
        }

        System.out.println(sum);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        int multiply = 1;

        for (int i = 5; i >=0; i--) {

            multiply = multiply * i ;
        }
        System.out.println(multiply);


        System.out.println("-=======================================");

        for (int i = 1; i <10; i=i+1) {

            if(i%3==0){

                System.out.print (i + " ");
            }
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        for (int j = 0; j <=10; j=j+3) {

            System.out.print(j +" ");

        }
        System.out.println("=--------------------------=-=-=-=-=-=-=-=-=-=-=-");

        for (int j = 10;j <0; j++) {

            System.out.print(" Hello king ");
        }
        System.out.println("-=========-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        for (char i = 'f'; i >='a'; i--) {
            System.out.print(i+ " ");
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        for (int i = 1; i <=5; i++) {
            for (int j = (5-i); j >1 ; j--) {

                System.out.print(i+j);
            }
            System.out.println(

            );
        }









    }
}
