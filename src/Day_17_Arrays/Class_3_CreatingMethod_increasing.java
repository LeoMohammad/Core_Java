package Day_17_Arrays;

import java.util.Arrays;

public class Class_3_CreatingMethod_increasing {
    public static void main(String[] args) {


        int [] intarr = {3,2,4,6};

        intarr = changingValuesOfArray(intarr,1);

        System.out.println(Arrays.toString(intarr));




    }

    public static int[] changingValuesOfArray (int[] intarr , int increacment) {

        for (int i = 0; i < intarr.length; i++) {
            intarr[i]=intarr[i]+increacment;
        }
       return intarr;
    }
    }








