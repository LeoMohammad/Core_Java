package Day_19_MDAArraysList;

import java.util.ArrayList;
import java.util.List;

public class Class_7_SubList {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        numbers.add(13);
        numbers.add(53);
        numbers.add(2);

        System.out.println(numbers);

        System.out.println(numbers.subList(2,5));

        System.out.println(numbers);

    }
}