package Day_9_Switch_statment_stringManipulation;

public class Class_8_length {
    public static void main(String[] args) {

        String str = "Java";
        System.out.println(str.length()); //4  // length gives us the number of characters, not index

        String str2 = "şasldkfjşaslkfjaşlsdkfjşklsdjfpweruqpoırupqowerıE";
        //System.out.println(str2.length());  // 60

        //System.out.println(str2.charAt(59));

        System.out.println(str2.charAt(str2.length()-1));


    }
}