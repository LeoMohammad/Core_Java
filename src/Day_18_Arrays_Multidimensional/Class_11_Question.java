package Day_18_Arrays_Multidimensional;

public class Class_11_Question {

    public static void main(String[] args) {


        int[][] arr = {{3, 4, 5,}, {2, 3, 6, 7}};

        int shortesrArrayLength = arr[0].length;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length < shortesrArrayLength) ;

        }
        System.out.println(shortesrArrayLength);


        for (int i = 0; i <shortesrArrayLength; i++) {
            for (int j = 0; j <arr.length; j++) {


                System.out.println(arr[j][i]);

            }
        }




    }}