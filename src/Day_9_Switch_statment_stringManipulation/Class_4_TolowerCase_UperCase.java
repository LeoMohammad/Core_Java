package Day_9_Switch_statment_stringManipulation;

import java.util.Locale;

public class Class_4_TolowerCase_UperCase {
    public static void main(String[] args) {


        String str = "java is life";

        str = str.toUpperCase();
        System.out.println(str);

        str = str.toLowerCase(Locale.ENGLISH);
        System.out.println(str);


    }

}
