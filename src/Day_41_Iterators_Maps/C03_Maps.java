package Day_41_Iterators_Maps;

import java.util.HashMap;
import java.util.Map;

public class C03_Maps {

    public static void main(String[] args) {

        /*

        When we are creating a map, to bea able to reach the value easier and faster
        we can use key, value structures. Which means map data type

        key is used to reach a long value.

        When we create a map, if we are planing to store more than one information, order should be always same
        so we can receive the data from that value

         */

        Map<Integer,String> schoolMap = new HashMap<>();

        schoolMap.put(101,"Ali-Cem-10-M");
        schoolMap.put(102,"Veli-Can-10-M");
        schoolMap.put(103,"Ali-Can-11-M");
        schoolMap.put(104,"Ayse-Cem-11-H");
        schoolMap.put(105,"Ayse-Han-10-H");
        schoolMap.put(106,"Veli-Han-10-H");




        System.out.println(schoolMap);
        //{101=Ali-Cem-10-H, 102=Veli-Can-10-M, 103=Ali-Can-11-M, 104=Ayse-Cem-11-H, 105=Ayse-Han-10-H, 106=Veli-Han-10-H}

        // how many elements are there in this map?
        System.out.println(schoolMap.size()); // 6

        // print the keys
        System.out.println(schoolMap.keySet()); //[101, 102, 103, 104, 105, 106]

        // print the values of the map
        System.out.println(schoolMap.values()); // [Ali-Cem-10-H, Veli-Can-10-M, Ali-Can-11-M, Ayse-Cem-11-H, Ayse-Han-10-H, Veli-Han-10-H]

        // our map has 6 values
        System.out.println(schoolMap.values().size());  // 6



    }
}