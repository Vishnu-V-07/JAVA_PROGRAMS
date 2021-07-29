package Oops;
import java.util.*;
class baseParent{
    String name="Vishnu";
}
class Childclass extends baseParent{
    String name="Hello";
    void display()
    {
        System.out.println(name);
        System.out.println(super.name);
    }
}
public class Superkey {
    public static void main(String args[])
    {
        Childclass c=new Childclass();
        c.display();
    }
    
}
