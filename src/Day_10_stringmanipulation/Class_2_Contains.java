package Day_10_stringmanipulation;

import javax.management.remote.TargetedNotification;

public class Class_2_Contains {
    public static void main(String[] args) {
        String str = "Learn Java, get the job";

        System.out.println(str.contains("Java")); //true

        System.out.println(str.contains("th")); // true
        String desiredWord = "Le";

        System.out.println(str.contains(desiredWord)); // true

        System.out.println(str.contains("a")); // true
        System.out.println(str.contains(" ")); // true

        System.out.println(str.contains(""));  // true

        System.out.println(str.contains("java")); // false

        if (str.contains("java")){
            System.out.println("yes str contains java");
        }else {
            System.out.println("no str does not contain java");
        }


    }
}