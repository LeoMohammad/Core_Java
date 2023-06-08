package Day_20_Arrays_Lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Class_1_Equal {
    public static void main(String[] args) {


        List<Integer> number1 = new ArrayList<>();
        number1.add(3);
        number1.add(8);
        number1.add(1);
        number1.add(2);


        List<Integer> number2 = new ArrayList<>();
        number2.add(3);
        number2.add(1);
        number2.add(2);
        number2.add(8);


        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        System.out.println(number1.equals(number2));

        Collections.sort(number1);
Collections.sort(number2);

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        System.out.println(number1.equals(number2));


    }
}
