package Day_12_For_loops;

public class Socrative {
    public static void main(String[] args) {

        String str= "hello word";
        System.out.println(str.charAt(0));

        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.length());
        System.out.println(str.charAt(4));

        String str1 = "Ayhan Beyhan";

        System.out.println(str1.replace("h", ""));
        System.out.println(str1.length());

        System.out.println(str1.replace("han","ol"));
        System.out.println("-------------------------------------");

        String str3 = "Ali";
        String str4 = "ali";

        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));
        System.out.println("------------------------------");

        String str5 = "leo habibi";

        System.out.println(str5.replace("l","L").replace("h","H"));
        System.out.println(str5.replaceAll("o", "O").replaceAll("i", "I"));

        System.out.println(str5.replace('e', 'E').replace('a','A'));
        System.out.println("---------------------------------------");
        String str6 = "java kolaydir";

        System.out.println(str6.endsWith("r"));
        System.out.println(str6.endsWith(""));
        System.out.println(str6.endsWith("dir"));
        System.out.println(str6.endsWith("java kolaydir"));
        System.out.println("-----------------------------------------------------");

        String str7 = "Canan Can";
        System.out.println(str7.startsWith("c"));
        System.out.println(str7.startsWith("C"));
        System.out.println((str7.endsWith("n")));
        System.out.println(str7.startsWith("a",3  ));
        System.out.println(str7.startsWith("n",4));
        System.out.println("----------------------------------------------");

        System.out.println("------------------------------------------");

        String str8 = "java code yaz";

        System.out.println(str8.substring(5));
        System.out.println(str8.substring(12));
        System.out.println(str8.substring(5,9));
        System.out.println(str8.substring(8,8));






    }

}
