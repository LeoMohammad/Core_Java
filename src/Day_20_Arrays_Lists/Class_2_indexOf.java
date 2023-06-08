package Day_20_Arrays_Lists;

import java.util.ArrayList;
import java.util.List;

public class Class_2_indexOf {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();

        names.add("Esra");
        names.add("Mohammad");
        names.add("Kaan");
        names.add("Bahadir");
        names.add("Seda");

//print the value of index
        System.out.println(names.get(2));

        System.out.println(names.indexOf("Mohammad"));

        System.out.println(names.lastIndexOf("Seda"));


    }
}
