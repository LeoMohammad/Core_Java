package Day_19_MDAArraysList;

import Day_18_Arrays_Multidimensional.Class_3_AddingElementByMEthod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class_2_ArraysList {
    public static void main(String[] args) {


        int [] arr = {1,2,};
        System.out.println(Arrays.toString(arr));


        arr= Class_3_AddingElementByMEthod.addingNewElement(arr,11);
        System.out.println(Arrays.toString(arr));


  List<String> letter= new ArrayList<>();
        System.out.println(letter);


        letter.add("s");
        letter.add("l");
        letter.add("a");
        System.out.println(letter);




    }
}
