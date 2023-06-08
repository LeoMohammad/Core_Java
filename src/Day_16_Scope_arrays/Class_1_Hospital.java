package Day_16_Scope_arrays;

public class Class_1_Hospital {

    public static void main(String[] args) {

        Adoctor doctor1 = new Adoctor();
        System.out.println(doctor1.name);

        doctor1.name="jhone";
        doctor1.surname="bingul";
        doctor1.brithday=1998;
        doctor1.onVocation= true;
        doctor1.phonenumber="59340959";
        System.out.println("Name" + doctor1.name + "\nSurname "+ doctor1.surname);

        Adoctor doctor2 = new Adoctor();

        doctor2.name= "fatema";
        doctor2.surname="shala";
        doctor2.brithday= 1999;
        doctor2.phonenumber="895489303";
        doctor2.onVocation= true;

        System.out.println(doctor2.onVocation);
        System.out.println(doctor1.onVocation);
        System.out.println(doctor1.nameofhospital);

        doctor1.nameofhospital="leo hospital";

        System.out.println(doctor2.nameofhospital);

        System.out.println("=------------------");

        doctor1.name="shahabbas";
        System.out.println(doctor1.name);
        System.out.println(doctor2.name);


        Adoctor doctor3 = new Adoctor();

        System.out.println(doctor3.name);

        System.out.println(doctor1.hospitalphone);
        System.out.println(doctor2.hospitalphone);
        System.out.println(doctor3.hospitalphone);
        doctor3.hospitalphone="3839433939";

        System.out.println(doctor1.hospitalphone);
        System.out.println(doctor2.hospitalphone);
    }
}
