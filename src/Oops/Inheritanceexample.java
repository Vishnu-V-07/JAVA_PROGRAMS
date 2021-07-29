package Oops;
import java.util.*;
class A
{
    int a=5;
    int b=10;

}
class B extends A
{
   public void add()
   {
       System.out.println(a+b);
   }
}
public class Inheritanceexample {

    public static void main(String args[])
    {
        B b=new B();
        b.add();
    }
    
}
