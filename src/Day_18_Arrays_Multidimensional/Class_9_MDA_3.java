package Day_18_Arrays_Multidimensional;

public class Class_9_MDA_3 {


    // find how many even numbers are there in the array?
    public static void main(String[] args) {
        int[][] arr = {{3, 5, 7}, {1, 2, 3, 4}, {1, 2}, {7}};
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.println(arr[i][j]+ " ");
                    counter++;
                }
            }
        }
        System.out.println("there are "+counter+" even numbers");
    }
}

