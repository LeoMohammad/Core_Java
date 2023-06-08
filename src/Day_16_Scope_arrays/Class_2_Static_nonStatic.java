package Day_16_Scope_arrays;

public class Class_2_Static_nonStatic {

    static String str1 = "staticvaribal";
    String str2 = "nonstatic";
    String str3 = "lsfjdslfj";


    public static void main(String[] args) {

        Adoctor doctor4= new Adoctor();
        doctor4.name="shaqasi";
        System.out.println(doctor4.name);

        System.out.println(str1);

        Class_2_Static_nonStatic test= new Class_2_Static_nonStatic();

        System.out.println(test.str2);


        System.out.println(test.str1);

        System.out.println(test.str3);

        test.str3="0000";

        System.out.println(test.str3);
        System.out.println(test.str2);
    }



    }
