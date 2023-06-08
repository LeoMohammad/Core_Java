package Day_20_Arrays_Lists;

import java.util.ArrayList;
import java.util.List;

public class Class_5_CallingMethodFromOtherClass {

    public static void main(String[] args) {
        // let's use deleteNamesWhichContainsUnwantedLetter method from C04 Class
        List<String> products = new ArrayList<>();
        products.add("Nutella");
        products.add("Toy Car");
        products.add("Baby Toy");
        products.add("Rabbit");
        products.add("Candy");
        String unwantedLetter = "o";
        System.out.println(Class_4_RemoveUnwanted.deleteNamesWhichContainsUnwantedLetter(products, unwantedLetter));
        System.out.println(Class_4_RemoveUnwanted.deleteNamesWhichContainsUnwantedLetter(products, "i"));
    }
}


