package Day_22_Constructor;

public class Class_3_NursRunner {
    public static void main(String[] args) {

        Class_2_Nurse nurse1 = new Class_2_Nurse();


        System.out.println(nurse1.name);
        System.out.println(nurse1.surname);
        System.out.println(nurse1.age);
        System.out.println(nurse1.onVacation);


        nurse1.name = "Melek";
        nurse1.age = 22;

        System.out.println(nurse1.name);
        System.out.println(nurse1.surname);
        System.out.println(nurse1.age);
        System.out.println(nurse1.onVacation);







    }

}
