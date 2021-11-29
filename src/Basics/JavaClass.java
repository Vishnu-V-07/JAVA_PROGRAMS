package Basics;
/*
Syntax for class

class className{
    fields(variables)
    methods

}


Syntax for Object

className objectName=new className();



*/
class Bike{

    boolean lightswitch;

    public void turnOn()
    {
        lightswitch=true;
        System.out.println("Light is On ? "+lightswitch);
    }
    public void turnOff()
    {
        lightswitch=false;
        System.out.println("Light is On ? "+lightswitch);
    }
}

public class JavaClass {

 public static void main(String args[])
 {
     Bike light=new Bike();
     light.turnOn();
     System.out.println("After 5 mins");
     light.turnOff();
 }
    
}
