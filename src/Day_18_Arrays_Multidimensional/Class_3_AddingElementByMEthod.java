package Day_18_Arrays_Multidimensional;

import java.util.Arrays;

public class Class_3_AddingElementByMEthod {
    public static void main(String[] args) {


        int[] arr={4,5,6};
        int addingValue=10;

        arr=addingNewElement(arr,addingValue);
        arr=addingNewElement(arr,12);
        arr=addingNewElement(arr,5);
        arr=addingNewElement(arr,0);
        arr=addingNewElement(arr,39);

        System.out.println(Arrays.toString(arr));


    }

    public static int[] addingNewElement (int[] arr, int addNewValue){

        int[] newarr = new int[arr.length+1];

        for (int i = 0; i <arr.length; i++) {
            newarr[i]=arr[i];
        }

        newarr[newarr.length-1]=addNewValue;

        return newarr;

    }






}
