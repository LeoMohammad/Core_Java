package Day_24_StaticKeyword_StaticBlock_PassByValue;

public class C01_StaticBlock {
    C01_StaticBlock (){
        System.out.println("Constructor is executed");
    }

    public static void main(String[] args) {
        System.out.println("main method is executed");

        System.out.println("============");
        C01_StaticBlock obj1 = new C01_StaticBlock();
    }

    static {
        /*
        Statick Block

        When class starts running before main method static block is executed. If we want to arrange something before
        main method we should use static blocs

        if there are more than one static block in the class they will be executed according to the order
         */

        System.out.println("Static block is executed");

    }

    {
        /*
        Non-Static Block

        Non-static blocks are executed before object creation when we try to create an object
        We use it to arrange a few things before creating an object
         */
        System.out.println("Non-static block is executed");
    }

    static {

        System.out.println("second static block is executed");

    }





}

