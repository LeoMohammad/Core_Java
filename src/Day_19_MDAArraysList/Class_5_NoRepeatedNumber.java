package Day_19_MDAArraysList;

import java.util.ArrayList;
import java.util.List;

public class Class_5_NoRepeatedNumber {
    public static void main(String[] args) {
        
        int[] arr = {3,4,5,8,3,5,1,2,3,4,6,7,8,9,7,5,2,1,3,5,6,7,8,3,2,5,6,};

        List<Integer> uniqueList= new ArrayList<>();

        for (int i = 0; i <arr.length; i++) {
            if (!uniqueList.contains(arr[i])){
                uniqueList.add(arr[i]);
            }
        }
        System.out.println(uniqueList);
        

        
    }
}
