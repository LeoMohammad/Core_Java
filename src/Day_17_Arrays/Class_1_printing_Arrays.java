package Day_17_Arrays;

import java.util.Arrays;

public class Class_1_printing_Arrays {
    public static void main(String[] args) {


        int [] intarr = {4,2,45,5,6,5,56,757,67,};
        System.out.println(Arrays.toString(intarr));

        System.out.println(intarr[2]);


        for (int i =0; i <intarr.length; i++) {
            System.out.print(intarr[i]+ " ");
        }

        System.out.println("======================");

        for (int i = 0; i <=intarr.length-1; i++) {
            System.out.print(intarr[i]);
        }











    }
}
