package Day_19_MDAArraysList;

import java.util.ArrayList;
import java.util.List;

public class Class_6_Get_set {
    public static void main(String[] args) {

        List<Integer>numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(6);

        System.out.println(numbers);

        System.out.println(numbers.get(0));

        System.out.println(numbers.get(numbers.size()-1));

        System.out.println(numbers.set(1,7));
        System.out.println(numbers);

    }
}
