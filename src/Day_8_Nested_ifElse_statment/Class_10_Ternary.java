package Day_8_Nested_ifElse_statment;

public class Class_10_Ternary {
    public static void main(String[] args) {

        /*
        take an int number from user
        if it is positive, check if it is an even number
        if it is not a positive number, check if it has 3 digits
         */
        int number = 100;

        System.out.println(number > 0 ?

                number % 2 == 0 ? "even" : "not even" :

                number > -1000 && number < -99 ? "3 digits" : "no 3 digits");


    }
}

