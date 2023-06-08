package Day_19_MDAArraysList;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class Class_8_contains {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        int[] arr = {2,3,5,7,8,9,5,3,2,4,6,5,7,8,9,0,9,6,4};

        for (int i = 0; i <arr.length; i++) {
            numbers.add(arr[i]);
        }

        System.out.println("we have added elements of the array to our list : "+ numbers );

        System.out.println(numbers.contains(3));
        System.out.println(numbers.contains(9));

        numbers.clear();
        System.out.println("after clear method");
        System.out.println(numbers);
















    }
}
