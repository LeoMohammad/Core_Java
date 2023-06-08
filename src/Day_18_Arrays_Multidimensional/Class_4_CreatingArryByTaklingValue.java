package Day_18_Arrays_Multidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Class_4_CreatingArryByTaklingValue {


    public static void main(String[] args) {
        // take numbers from user and add them to an array
        // when user presses 0, we should see the array on the console
        Scanner scan = new Scanner(System.in);
        // because of the while condition we need to start with any number other than zero. If we don't while loop
        // won't be executed (because condition will be always false)
        int enteredNumber =1 ;
        int[] arr = new int[0];
        while (enteredNumber!=0){
            // user enters a number to add the array
            System.out.println("Please enter a number to add the array. Press 0 to quit");
            enteredNumber = scan.nextInt();
            // as long as the number is not 0 we will add it to the array
            if (enteredNumber!=0){
                // we called the method we have created from previous class and made the assignment
                arr =Class_3_AddingElementByMEthod.addingNewElement(arr,enteredNumber);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


