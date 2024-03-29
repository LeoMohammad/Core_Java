package Day_44_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_NoRepeat {


    public static void main(String[] args) {

        // if we dont want to see any repeated elements in the array how can we do that
        // hint : use a set

        int [] arr = {3,4,5,3,2,3,4,5,2,3,4,5,2,3,4,5,3,2,4,3,2,4,3,5,3,4,2,3,4};

        Set<Integer> uniqueElements = new HashSet<>();

        for (int each: arr
        ) {
            uniqueElements.add(each);
        }

        System.out.println(Arrays.toString(arr)); // [3, 4, 5, 3, 2, 3, 4, 5, 2, 3, 4, 5, 2, 3, 4, 5, 3, 2, 4, 3, 2, 4, 3, 5, 3, 4, 2, 3, 4]
        System.out.println(uniqueElements); // [2, 3, 4, 5]

        arr = new int[uniqueElements.size()];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0]

        int index = 0;

        for (int each:uniqueElements
        ) {
            arr[index]=each;
            index++;
        }

        System.out.println(Arrays.toString(arr)); //[2, 3, 4, 5]

            /*
            if you want to work with a set, you should use for each loop, or an Iterator because set does not use index structure
             */



    }



}


