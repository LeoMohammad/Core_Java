package Day_22_Constructor;

public class Class_4_Doctor {


    Class_4_Doctor(){
        System.out.println("the costructor without any parameters");
    }

    String name = "not assgined";

    String surname ;
    String phone ;
    int age;
    int preHourSalary=20;

    public int calsOfSalary (int hour){return hour*preHourSalary;}
}
