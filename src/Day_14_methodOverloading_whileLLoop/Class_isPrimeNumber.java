package Day_14_methodOverloading_whileLLoop;

public class Class_isPrimeNumber {
    public static void main(String[] args) {

isprimeNumberMethod(79);
        isprimeNumberMethod(87);
        isprimeNumberMethod(80);
    }

public static void isprimeNumberMethod( int number){

        int flag = 0;

    for (int i = 2; i <number; i++) {
        if (number %i==0){
            flag++;
        }
    }
    if (flag!=0){
        System.out.println(number + "is not prime number");
    }else {
        System.out.println(number + "yes it is a prime number");
    }
    System.out.print(number);
    }
}
