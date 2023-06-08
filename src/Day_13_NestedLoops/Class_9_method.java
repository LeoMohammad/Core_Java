package Day_13_NestedLoops;

public class Class_9_method {
    public static void main(String[] args) {

        System.out.println(factoriel(5));


    }

    public static int factoriel ( int number){

        int factoriel= 1;
        for (int i = number; i >0 ; i--) {

            factoriel=factoriel*i;

        }
        return factoriel;

    }


}
