package Day_30_Inheritance;


public class C07_Parent extends C06_GrandParent {

    protected C07_Parent (){
        super();
        System.out.println("Parent Class constructor is called");
    }

    protected int parentNumber=888888;
}
