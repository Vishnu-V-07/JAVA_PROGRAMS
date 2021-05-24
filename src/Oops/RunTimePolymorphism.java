package Oops;
import java.util.*;
class Hall
{
    int a=150;
    int b=200;
    int c=250;
    void getNumberOfPersonsAllowed()
    {
        System.out.println(0);
    }
}
class Hall_A extends Hall{
    void getNumberOfPersonsAllowed()
    {
        System.out.println("Number of Persons allowed in Hall_A is "+a);
    }
}
class Hall_B extends Hall{
    void getNumberOfPersonsAllowed()
    {
        System.out.println("Number of Persons allowed in Hall_B is "+b);
    }
}
class Hall_C extends Hall{
    void getNumberOfPersonsAllowed()
    {
        System.out.println("Number of Persons allowed in Hall_C is "+c);
    }
}
public class RunTimePolymorphism {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Hall h;
        h=new Hall_A();
        h.getNumberOfPersonsAllowed();
        h=new Hall_B();
        h.getNumberOfPersonsAllowed();
        h=new Hall_C();
        h.getNumberOfPersonsAllowed();



    }
    
}
