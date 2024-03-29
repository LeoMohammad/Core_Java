package Day_28_StringBuilders_AccessModifiers_Encapsulation;

public class C02_AccessModiferTest {

    public static void main(String[] args) {


        //public
        System.out.println(C01_AccessModifers.publicStr);  // I could be able to reach it and see it because it is public
        C01_AccessModifers.publicStr = "I changed value of Public Str because I can"; // we can change value of a public access

        //private
        //C01_AccessModifers.privateStr // we can not reach, see, update it because it is private to  C01_AccessModifers class
        // from nowhere in the project we can reach a private variable

        //default
        System.out.println(C01_AccessModifers.defaultStr); // I can reach and see a default variable from same package
        C01_AccessModifers.defaultStr=" I am trying change a default variable"; // I can change a default variable from same package

        // protected
        System.out.println(C01_AccessModifers.protectedStr); // I can reach and see a protected variable from same package
        C01_AccessModifers.protectedStr =" I can change a protected variable from same package";

        // to reach a non-static public variable from another class, again we need to create an object from variable's class
        C01_AccessModifers accessMod2 = new C01_AccessModifers();
        System.out.println(accessMod2.publicStrObject);


    }



}