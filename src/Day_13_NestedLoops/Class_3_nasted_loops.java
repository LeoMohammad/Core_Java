package Day_13_NestedLoops;

public class Class_3_nasted_loops {

    public static void main(String[] args) {

        /*
        1
        1 2
        1 2 3
        1 2 3 4
         */

        for (int j = 1; j <= 4; j++) {

            for (int i = 1; i <= j; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }
}