package Oops;
import java.util.*;
class Parent{
     public void display()
     {
         System.out.println("This is parent class");
     }

}
class Child extends Parent{
    public  void display(){
       System.out.println("This is child class");
    }
}
public class MethodOverriding {
    public static void main(String args[])
    {
    
        Child c=new Child();
        c.display();
    }
}
