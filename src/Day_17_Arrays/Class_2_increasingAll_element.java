package Day_17_Arrays;

import java.util.Arrays;

public class Class_2_increasingAll_element {
    public static void main(String[] args) {


        int [] intArr = {3,6,3,9};

        for (int i = 0; i <intArr.length; i++) {

            intArr[i]=intArr[i]+2;

        }
        System.out.println(Arrays.toString(intArr));

        int [] leo = {4,6,7,8,8,};

        for (int i = 0; i <leo.length; i++) {

            leo[i]=leo[i]+1;

        }
        System.out.println(Arrays.toString(leo));


        int [] intarr2 = {2,3,4,5,1,};

        for (int i = 0; i <intarr2.length; i++) {
            intarr2[i]=intarr2[i]+4;
        }

        System.out.println(Arrays.toString(intarr2));



    }
}
