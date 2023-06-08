package Day_21_ArrayLists_For_EachLoop;

import java.util.ArrayList;
import java.util.List;

public class Class_3_MakeArrayFromUniqueElements {
    // Question 1- For the repeating elements in a given array,
    // delete the duplicates, make only one of all the elements,
    // assign the new version to the old array and print it.
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 4, 3, 2, 1, 2, 3, 4, 5, 3, 4, 2, 4, 3, 5, 3, 2, 4, 5, 3};
        // to copy unique elements of array, we created an empty list
        List<Integer> newList = new ArrayList<>();
        // checked all elements of arr, and assinged unique elements to newList
        for (int each : arr1
        ) {
            if (!newList.contains(each)) {
                newList.add(each);
            }
        }
        System.out.println(newList); // [1, 2, 3, 4, 5]
        // we created a new array to copy elements of the newList
        // after creating newArray we will reassing it to old arr
        int[] newArr = new int[newList.size()]; // [0, 0, 0, 0, 0]
        // we copied all elements from the newList to newarr
        for (int i = 0; i < newList.size(); i++) {
            newArr[i] = newList.get(i);
        }

        arr1= newArr;
        System.out.println(arr1);


    }

}





