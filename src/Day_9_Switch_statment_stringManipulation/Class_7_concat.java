package Day_9_Switch_statment_stringManipulation;

public class Class_7_concat {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Life";
        String str3 = " ";

        // use concat method to write "Java Life"

        System.out.println(str1 + str3 + str2);
        System.out.println(str1.concat(str3).concat(str2));


    }
}