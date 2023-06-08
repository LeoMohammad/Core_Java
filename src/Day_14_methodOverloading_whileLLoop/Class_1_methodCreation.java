package Day_14_methodOverloading_whileLLoop;
import Day_13_NestedLoops.Class_10_reverseString;
import java.util.Scanner;
public class Class_1_methodCreation {
    // use the method from day13 to reverse strings and check if it is a palindrome (madam)
    // take a string from user and check if it is a palindrome
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scan.nextLine();
        String reversedStr = Class_10_reverseString.reverseString(str);
        if (str.equals(reversedStr)){
            System.out.println("Yes they are palindrome");
        }else {
            System.out.println("they are not palindrome");
        }
    }
}
