package Day_10_stringmanipulation;

import javax.swing.plaf.basic.BasicOptionPaneUI;

public class Class_5_index {
    public static void main(String[] args) {

        String str = "Java is very beautiful, very";

        System.out.println(str.indexOf("J"));
        System.out.println(str.indexOf("v"));
        System.out.println(str.indexOf("b"));
        System.out.println(str.indexOf("l"));
        System.out.println(str.length()-1);
        System.out.println(str.indexOf("very"));
        System.out.println(str.indexOf("x"));
        System.out.println(str.indexOf("very"));
        System.out.println(str.indexOf("very" , 13));
        System.out.println(str.indexOf("a" , 8));





    }
}
