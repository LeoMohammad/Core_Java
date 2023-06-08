package Day_19_MDAArraysList;

import java.util.ArrayList;
import java.util.List;

public class Class_3_Adding {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);

        System.out.println(numbers);

        numbers.add(1, 7);

        List<Integer> addOn = new ArrayList<>();
        addOn.add(45);
        addOn.add(67);

        System.out.println(addOn);



        numbers.addAll(addOn);
        System.out.println(numbers);

        numbers.addAll(2,addOn);
        System.out.println(numbers);


        numbers.addAll(0,addOn);
        System.out.println(numbers);


    }
}